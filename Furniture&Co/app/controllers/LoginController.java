package controllers;

import play.api.Environment;
import java.util.*;
import javax.persistence.*;
import play.mvc.*;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import javax.inject.Inject;

import views.html.*;

import models.users.*;

public class LoginController extends Controller{

private FormFactory formFactory;

private Environment env;

private String filter;

@Inject
public LoginController(Environment e, FormFactory f){
    this.env=e;
    this.formFactory=f;
}


public Result login(String filter){
 Form<Login> loginForm = formFactory.form(Login.class);
 return ok(login.render(loginForm,User.getUserById(session().get("email")),filter));
}

public Result loginSubmit(){
Form<Login> loginForm = formFactory.form(Login.class).bindFromRequest();


if(loginForm.hasErrors()){
    return badRequest(login.render(loginForm,User.getUserById(session().get("email")),filter));
}else{
    session().clear();
    session("email", loginForm.get().getEmail());
}
return redirect(controllers.routes.HomeController.Home(filter));


}

public Result logout(){
    session().clear();
    flash("You have been logged out.");
    return redirect(routes.HomeController.Home(filter));
}








}
