package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import models.users.*;
@Entity
public class Payment extends Model {



    @Id
    private Long id;
    @Constraints.Required
    private String shipmentAddress;
    @Constraints.Required
    private String ccNumber;
    @Constraints.Required
    private String ccv;

    @ManyToOne
    private Customer customer;
   
    public  Payment () {
   }
   
       public Payment(Long id, String shipmentAddress, String ccNumber, String ccv,Customer customer) {
           this.id = id;
           this.shipmentAddress = shipmentAddress;
           this.ccNumber = ccNumber;
           this.ccv = ccv;
           this.customer=customer;
       }
   
       public Customer getCustomer(){
           return customer;
       }

       public void setCustomer(Customer customer){
           this.customer=customer;
       }




       public Long getId() {
           return id;
       }
   
       public void setId(Long id) {
           this.id = id;
       }
   
       public String getShipmentAddress() {
           return shipmentAddress;
       }
   
       public void setShipmentAddress(String shipmentAddress) {
           this.shipmentAddress = shipmentAddress;
       }
   
       public String getCcNumber() {
           return ccNumber;
       }
   
       public void setCcNumber(String ccNumber) {
           this.ccNumber = ccNumber;
       }
   
       public String getCcv() {
           return ccv;
       }
   
       public void setCcv(String ccv) {
           this.ccv = ccv;
       }
   

       public static Finder<Long,Payment> find = new Finder<Long,Payment>(Payment.class);



       //Find all Products in the database
       public static List<Payment> findAll() {
           return Payment.find.all();
       }





}