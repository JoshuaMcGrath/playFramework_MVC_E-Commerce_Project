package controllers;

import play.mvc.*;

import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import play.mvc.Http.*;
import play.mvc.Http.MultipartFormData.FilePart;
import java.io.File;


import org.im4java.core.ConvertCmd;
import org.im4java.core.IMOperation;


import models.*;
import views.html.*;
import models.users.*;
import controllers.security.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

   
    private FormFactory formFactory;
    private Environment e;
    private String filter;
    
    @Inject
    public HomeController(FormFactory f, Environment env){
        this.formFactory=f;
        this.e=env;
    }
        

    public Result Home(String filter) {
        Form<Login> loginForm = formFactory.form(Login.class);
        List<Product> productList = Product.findAll();

        return ok(views.html.home.render(loginForm,productList, User.getUserById(session().get("email")),filter));
    }


    
    public Result AboutUs() {
        Form<Login> loginForm = formFactory.form(Login.class);
        
        return ok(views.html.aboutus.render(loginForm, User.getUserById(session().get("email")),filter));
    }

    @Transactional
    public Result Bathroom(Long cat, String filter){
        List<Product> productList = null;
        List<Category> categoryList =Category.findAll();

        if(cat!=3){
            productList=Product.findAll(filter);

        }else{
            productList=Category.find.ref(cat).getProducts();
        }


        return ok(views.html.bathroom.render(productList,categoryList,cat, filter,User.getUserById(session().get("email")),e));
    }

    public Result Kitchen(Long cat, String filter){

        List<Product> productList=null;
        List<Category> categoryList =Category.findAll();

        if(cat!=2){
            productList=Product.findAll(filter);

        }else{
            productList=Category.find.ref(cat).getProducts();
        }


        return ok(views.html.bathroom.render(productList,categoryList, cat, filter,User.getUserById(session().get("email")),e));
    }


    





    public Result Bedroom(Long cat, String filter){
        List<Product> productList = null;
        List<Category> categoryList =Category.findAll();

        if(cat!=1){
            productList=Product.findAll();

        }else{
            productList=Category.find.ref(cat).getProducts();
        }


        return ok(views.html.bathroom.render(productList,categoryList, cat, filter,User.getUserById(session().get("email")),e));
    }

    public Result LivingRoom(Long cat, String filter){
        List<Product> productList = null;
        List<Category> categoryList =Category.findAll();

        if(cat!=4){
            productList=Product.findAll();

        }else{
            productList=Category.find.ref(cat).getProducts();
        }


        return ok(views.html.bathroom.render(productList,categoryList, cat, filter,User.getUserById(session().get("email")),e));
    }


     @Security.Authenticated(Secured.class)
     
    public Result addProduct(){
        Form<Product> productForm = formFactory.form(Product.class);
        return ok(addProduct.render(productForm, User.getUserById(session().get("email")),filter));
    }

    public Result addProductSubmit() {
        Product newProduct;
        Form<Product> newProductForm = formFactory.form(Product.class).bindFromRequest();

        if (newProductForm.hasErrors()) {
            return badRequest(addProduct.render(newProductForm, User.getUserById(session().get("email")),filter));
        }
        else {
            newProduct = newProductForm.get();

            if (newProduct.getId() == null) {
                newProduct.save();    
                flash("success", "Product " + newProduct.getName() + " was added");
                
            }
            else if (newProduct.getId() != null) {
                newProduct.update();
                flash("success", "Product " + newProduct.getName() + " was updated");
            }
        }



    MultipartFormData data = request().body().asMultipartFormData();
    FilePart<File> image = data.getFile("upload");

    String saveImageMsg = saveFile(newProduct.getId(), image);

    flash("success", "Product " + newProduct.getName() + " has been created/updated " + saveImageMsg);

    return redirect(controllers.routes.HomeController.Home(filter));
}
public Result addUser(){
        Form<User> userForm = formFactory.form(User.class);
        return ok(addUser.render(userForm,User.getUserById(session().get("email")),filter));
    }

    public Result addUserSubmit(){
        Form<User> newUserForm = formFactory.form(User.class).bindFromRequest();

        if(newUserForm.hasErrors()){
            return badRequest(addUser.render(newUserForm, User.getUserById(session().get("email")),filter));
        }else{
            User newUser = newUserForm.get();

            newUser.save();
            flash("You have Successfully registered!");
            return redirect(controllers.routes.HomeController.Home(filter));
        }

    }

    public Result addCustomer(){
        Form<Customer> customerForm = formFactory.form(Customer.class);
        return ok(addCustomer.render(customerForm,  User.getUserById(session().get("email")),filter));
    }


    public Result updateProduct(Long id){

        Product p;
        Form<Product> productForm;

        try{    
            p = Product.find.byId(id);

            productForm = formFactory.form(Product.class).fill(p);
        }catch(Exception ex){
            return badRequest("ERROR IN FORM");
        }
        return ok(updateProduct.render(id,productForm,User.getUserById(session().get("email")),filter));
    
        }

        public Result updateProductSubmit(Long id) {
            
                    // Retrieve the submitted form object (bind from the HTTP request)
                    Form<Product> updateProductForm = formFactory.form(Product.class).bindFromRequest();
            
                    // Check for errors (based on constraints set in the Product class)
                    if (updateProductForm.hasErrors()) {
                        // Display the form again by returning a bad request
                        return badRequest(updateProduct.render(id,updateProductForm, User.getUserById(session().get("email")),filter));
                    } else {
                        // No errors found - extract the product detail from the form
                        Product p = updateProductForm.get();
                        p.setId(id);
                        
                        
                        //update (save) this product
                        p.update();
            
            
                        flash("success", "Product " + p.getName() + " has been  updated " );
                        


                        // Redirect to the index page
                        return redirect(routes.AdminController.adminControl(filter));
                    }
                }
                
    







    


   







    public Result addCustomerSubmit(){
        Form<Customer> customerForm = formFactory.form(Customer.class).bindFromRequest();

        if(customerForm.hasErrors()){
            return badRequest(addCustomer.render(customerForm, User.getUserById(session().get("email")),filter));
        }else{
            Customer newCustomer = customerForm.get();

            newCustomer.save();
            flash("You have Successfully registered!");
            return redirect(controllers.routes.HomeController.Home(filter));
        }

    }





  



    public String saveFile(Long id, FilePart<File> uploaded) {
        // make sure that the file exists
        if (uploaded != null) {
            // make sure that the content is indeed an image
            String mimeType = uploaded.getContentType(); 
            if (mimeType.startsWith("image/")) {
                // get the file name
                String fileName = uploaded.getFilename();                
                // save the file object (created without a path, File saves
                // the content to a default location, usually the temp or tmp
                // directory)
                File file = uploaded.getFile();
                // create an ImageMagik operation - this object is used to specify
                // the required image processing
                IMOperation op = new IMOperation();
                // add the uploaded image to the operationop.addImage(file.getAbsolutePath());
                op.addImage(file.getAbsolutePath());
                // resize the image using height and width saveFileOld(Long id, FilePart<File> uploaded) {
                op.resize(300, 200);
                // save the image as jpg 
                op.addImage("public/images/productImages/" + id + ".jpg");
                // create another Image Magick operation and repeat the process above to
                // specify how a thumbnail image should be processed - size 60px
                IMOperation thumb = new IMOperation();
                thumb.addImage(file.getAbsolutePath());
                thumb.resize(60);
                thumb.addImage("public/images/productImages/thumbnails/" + id + ".jpg");
                // we must make sure that the directories exist before running the operations
                File dir = new File("public/images/productImages/thumbnails/");
                if (!dir.exists()) {
                    dir.mkdirs();
                }
                // now we create an Image Magick command and execute the operations
                ConvertCmd cmd = new ConvertCmd();
                try {
                    cmd.run(op);
                    cmd.run(thumb);
                } catch(Exception e) {
                    e.printStackTrace();
                }
                return " and image saved";
            }
        }
        return "/ no file";
    }
    public Result productListing(Long id, String filter) {
        
        List<Product> productList = null;
        Product p;
       
        p = Product.find.byId(id);
        return ok(productListing.render(p,User.getUserById(session().get("email")),e, filter));
    }
    
    @Transactional
    public Result search(long cat,String filter){
        List<Product> products = null;
        List<Category> categories =Category.findAll();
        products = Product.findAll(filter);

        if (cat == 0) {
            products = Product.findAll(filter);
        }else {
            products = Product.findFilter(cat, filter);
        }
        return ok(search.render(categories, products,cat, filter,User.getUserById(session().get("email")),e));
        }
    


        public Result updateCustomer(String email){
            
                    Customer c;
                    Form<Customer> customerForm;
            
                    try{    
                        c = Customer.find.byId(email);
            
                        customerForm = formFactory.form(Customer.class).fill(c);
                    }catch(Exception ex){
                        return badRequest("ERROR IN FORM");
                    }
                    return ok(updateUser.render(email,customerForm,User.getUserById(session().get("email")),filter));
                
                    }
                    public Result updateCustomerSubmit(String email) {
                        
                                // Retrieve the submitted form object (bind from the HTTP request)
                                Form<Customer> updateCustomerForm = formFactory.form(Customer.class).bindFromRequest();
                        
                                // Check for errors (based on constraints set in the Product class)
                                if (updateCustomerForm.hasErrors()) {
                                    // Display the form again by returning a bad request
                                    return badRequest(updateUser.render(email,updateCustomerForm,User.getUserById(session().get("email")),filter));
                                } else {
                                    // No errors found - extract the product detail from the form
                                    Customer c = updateCustomerForm.get();
                                    c.setEmail(email);
                                    
                                    
                                    //update (save) this product
                                    c.update();
                        
                        
                                    flash("success", "User " + c.getFirstName() + " has been  updated " );
                                    
            
            
                                    // Redirect to the index page
                                    return redirect(controllers.routes.HomeController.Home(filter));
                                }
                            }
                            
                
            
            
                            private Customer getCurrentUser() {
                                return (Customer)User.getUserById(session().get("email"));
                            }
                        
                            @Security.Authenticated(Secured.class)
                            @With(AuthCustomer.class)
                        
                            public Result accountDetails() {
                                Form<Login> loginForm = formFactory.form(Login.class);
                               
                                return ok(views.html.accountDetails.render(getCurrentUser(),loginForm, User.getUserById(session().get("email")),filter));
                            }
                        
                        




   
                            public Result facebook() {
                                return redirect("http://facebook.com/%22");
                            }
                        
                        
                            public Result twitter() {
                        
                                return redirect("http://facebook.com/%22");
                                
                            }
                        






}









