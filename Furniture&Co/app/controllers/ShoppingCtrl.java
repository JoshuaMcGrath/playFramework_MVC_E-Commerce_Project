package controllers;

import play.mvc.*;
import play.data.*;
import javax.inject.Inject;

import views.html.*;
import play.db.ebean.Transactional;
import play.api.Environment;

// Import models
import models.users.*;
import models.*;


import java.util.Calendar;

// Import security controllers
import controllers.security.*;




    
@Security.Authenticated(Secured.class)
@With(AuthCustomer.class)
public class ShoppingCtrl extends Controller {



    /** http://stackoverflow.com/questions/15600186/play-framework-dependency-injection **/
    private FormFactory formFactory;

    /** http://stackoverflow.com/a/37024198 **/
    private Environment env;

    /** http://stackoverflow.com/a/10159220/6322856 **/
    @Inject
    public ShoppingCtrl(Environment e, FormFactory f) {
        this.env = e;
        this.formFactory = f;
    }


    
    // Get a user - if logged in email will be set in the session
	private Customer getCurrentUser() {
		return (Customer)User.getUserById(session().get("email"));
	}

    @Transactional
    public Result showBasket(String filter) {
        return ok(basket.render(getCurrentUser(),filter));
    }


    @Transactional
    public Result checkOut(String filter) {

        Form<Payment> newPaymentForm = formFactory.form(Payment.class);
        return ok(checkOut.render(newPaymentForm,getCurrentUser(),filter));
    }

@Transactional
@Security.Authenticated(Secured.class)
@With(AuthCustomer.class)
public Result viewOrder(String email,String filter){
  
    return ok(viewOrders.render(getCurrentUser(),User.getUserById(session().get("email")),filter));


}

    @Security.Authenticated(Secured.class)
    @With(AuthCustomer.class)
    public Result checkOutSubmit(String filter){
        Form<Payment> newPaymentForm = formFactory.form(Payment.class).bindFromRequest();
        
        if(newPaymentForm.hasErrors()){
            return badRequest(checkOut.render(newPaymentForm,getCurrentUser(),filter));
        }else{
            Payment newPayment = newPaymentForm.get();

            newPayment.save();

            return redirect(controllers.routes.ShoppingCtrl.placeOrder(filter));

        }

    }

    
    // Add item to customer basket
    @Transactional
    public Result addToBasket(Long id,String filter) {
        
        // Find the product
        Product p = Product.find.byId(id);

        // Get basket for logged in customer
        Customer customer = (Customer)User.getUserById(session().get("email"));
        if(p.decrementStock()){
        // Check if item in basket
        if (customer.getBasket() == null) {
            // If no basket, create one
            customer.setBasket(new Basket());
            customer.getBasket().setCustomer(customer);
            customer.update();
        }
        p.update();
        // Add product to the basket and save
        customer.getBasket().addProduct(p);
        customer.update();
    }
        // Show the basket contents     
        return ok(basket.render(customer,filter));
    }
    
    // Add an item to the basket
    @Transactional
    public Result addOne(Long itemId, Long pid, String filter) {
        
        // Get the order item
        OrderItem item = OrderItem.find.byId(itemId);
        // Find the product
        Product p = Product.find.byId(pid);
        
        if(p.decrementStock()){
                    // Increment quantity
        item.increaseQty();
        // Save
        item.update();
        p.update();
        p.increaseSold(0);
        } else{
            flash("success", "Sorry, no more of these products left");
        }


        // Show updated basket
        return redirect(routes.ShoppingCtrl.showBasket(filter));
    }

    
    @Transactional
    public Result removeOne(Long itemId, String filter) {
        
        // Get the order item
        OrderItem item = OrderItem.find.byId(itemId);
        // Get user
        Customer c = getCurrentUser();
        // Call basket remove item method
        c.getBasket().removeItem(item);
        c.getBasket().update();
        // back to basket
        return ok(basket.render(c,filter));
    }

    // Empty Basket
    @Transactional
    public Result emptyBasket(String filter) {
        
        Customer c = getCurrentUser();
        c.getBasket().removeAllItems();
        c.getBasket().update();
        
        return ok(basket.render(c,filter));
    }

    @Transactional
    public Result placeOrder(String filter) {
        Customer c = getCurrentUser();
       
        
        // Create an order instance
        ShopOrder order = new ShopOrder();
        
        // Associate order with customer
        order.setCustomer(c);
        
        // Copy basket to order
        order.setItems(c.getBasket().getBasketItems());
        
        // Save the order now to generate a new id for this order
        order.save();
       
       // Move items from basket to order
        for (OrderItem i: order.getItems()) {
            // Associate with order
            i.setOrder(order);
            // Remove from basket
            i.setBasket(null);
            // update item
            i.update();
        }
        
        // Update the order
        order.update();
        
        // Clear and update the shopping basket
        c.getBasket().setBasketItems(null);
        c.getBasket().update();
        
        // Show order confirmed view
        return ok(orderConfirmed.render(c, getCurrentUser(),order, filter));
    }

   
    @Transactional    
    public Result addComment(Long id,String filter){
       
        Form<Comment> commentForm = formFactory.form(Comment.class);

        Product p;
        
         p = Product.find.byId(id);

        return ok(addComment.render(id,p,commentForm,User.getUserById(session().get("email")),filter));
    }
   
    @Transactional
    public Result addCommentSubmit(Long id,String filter){
        Form<Comment> newCommentForm = formFactory.form(Comment.class).bindFromRequest();
        Product p;
        
         p = Product.find.byId(id);
        if(newCommentForm.hasErrors()){
            return badRequest(addComment.render(id,p,newCommentForm,User.getUserById(session().get("email")),filter));
        }else{
            Comment newComment = newCommentForm.get();
            newComment.save();

            return redirect(controllers.routes.HomeController.productListing(id,filter));
        }
    }



    @Transactional
    public Result cancelOrder(Long orderId){
        ShopOrder order = ShopOrder.find.byId(orderId);
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        String filter = null;
        c1=order.getOrderDate();
        if(compareDates(c1,c2)){
           // order.removeAllItems(orderId);
           order.adjustStock();
           order.delete();
           
            flash("success", "Your order has been cancelled");
        }else {
            flash("success", "Sorry, it is too late to cancel this order");
        }
        return ok(viewOrders.render(getCurrentUser(),User.getUserById(session().get("email")),filter));
    }

    public boolean compareDates(Calendar c1, Calendar c2){
        boolean allowed = true;
        long miliSecondForDate1 = c1.getTimeInMillis();
        long miliSecondForDate2 = c2.getTimeInMillis();
        long diffInMilis = miliSecondForDate2 - miliSecondForDate1;

        long diffInMinutes = diffInMilis / (60 * 1000);
        if(diffInMinutes >60){
            allowed=false;
        }
        return allowed;
    }




    
    

    
  

}