package controllers;

import play.mvc.*;

import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import controllers.security.*;
import models.*;
import views.html.*;
import models.users.*;

@Security.Authenticated(Secured.class)
// Authorise user (check if admin)
@With(AuthAdmin.class)
public class AdminController extends Controller {


   
    private FormFactory formFactory;
    private Environment e;
    
    
    @Inject
    public AdminController(FormFactory f, Environment env){
        this.formFactory=f;
        this.e=env;
    }


public Result adminControl(String filter){
   List<Customer> customerList = Customer.findAll();
   List<Product> productList = Product.findAll();
    return ok(adminControl.render(productList,customerList,User.getUserById(session().get("email")),filter));
}

public Result deleteProduct(Long id, String filter){
    Product.find.ref(id).delete();

    return redirect(routes.AdminController.adminControl(filter));



}

public Result deleteCustomer(String email, String filter){
    Customer.find.ref(email).delete();

    return redirect(routes.AdminController.adminControl(filter));



}






}