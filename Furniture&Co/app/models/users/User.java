package models.users;



import java.util.*;
import javax.persistence.*;


import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
@Table(name = "user")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="role")
@DiscriminatorValue("admin")
public class User extends Model{

@Id
private String email;

@Column(insertable=false,updatable=false)
private String role;

@Constraints.Required
private String password;

public User(){

}

public User(String email, String password,String role){
    this.email=email;
    this.role=role;
    this.password=password;
}


public String getEmail() {
    return email;
}

public String getRole() {
    return role;
}



public String getPassword() {
    return password;
}



public void setEmail(String email){
    this.email=email;
}

public void setRole(String role){
    this.role=role;
}



public void setPassword(String password){
    this.password=password;
}


public static Finder<String,User> find = new Finder<String,User>(User.class);



public static User authenticate(String email, String password){
    return find.query().where().eq("email",email).eq("password",password).findUnique();
}


public static User getUserById(String id){
    if(id == null)
    return null;
    else
    return find.byId(id);
}













}