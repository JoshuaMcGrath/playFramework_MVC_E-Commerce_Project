package models.users;



import java.util.*;
import javax.persistence.*;


import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;
import models.*;

@Entity
@DiscriminatorValue("customer")
public class Customer extends User{

    
    private String firstName;
    
    private String lastName;
    
    @OneToMany(mappedBy="customer",cascade=CascadeType.ALL)
    private List<Payment> payments;
    

    @OneToMany(mappedBy="customer",cascade=CascadeType.ALL)
    private List<ShopOrder> orders;


    @OneToOne(mappedBy="customer", cascade = CascadeType.ALL)
    private Basket basket;
  
      public Customer() {
      }
  
      public Customer(String email, String role, String password,String firstName, String lastName,List<Payment> payments) {
           super(email, role, password);
          this.firstName = firstName;
          this.lastName = lastName;
          this.payments=payments;
          
      }
  

      public List<Payment> getPayments() {
        return payments;
    }

    public void setPayment(List<Payment> payments) {
        this.payments=payments;
    }
  





      public String getFirstName() {
          return firstName;
      }
  
      public void setFirstName(String firstName) {
          this.firstName = firstName;
      }
  
      public String getLastName() {
          return lastName;
      }
  
      public void setLastName(String lastName) {
          this.lastName = lastName;
      }
  
      

      public static List<Customer> findAll(){
        return Customer.find.all();
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public List<ShopOrder> getOrders(){
        return orders;
    }

    public void setOrders(List<ShopOrder> orders){
        this.orders=orders;
    }






    public static Finder<String,Customer> find = new Finder<String,Customer>(Customer.class);

    public static List<Customer> findAll1(){
        return Customer.find.query().where().orderBy("firstName asc").findList();
    }








}