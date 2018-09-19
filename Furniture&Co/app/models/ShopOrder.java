package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import java.text.SimpleDateFormat;

import java.util.Date;

import models.users.*;
import models.*;


// ShopOrder entity managed by Ebean
@Entity
public class ShopOrder extends Model {

    @Id
    private Long id;
    
    private Calendar OrderDate;
    
  
    @OneToMany(mappedBy="order", cascade = CascadeType.ALL)
    private List<OrderItem> items;
    
    @ManyToOne
    private Customer customer;

    // Default constructor
    public  ShopOrder() {
        OrderDate = Calendar.getInstance();
    }
    public double getOrderTotal() {
        
        double total = 0;
        
        for (OrderItem i: items) {
            total += i.getItemTotal();
        }
        return total;
    }
	
	//Generic query helper
    public static Finder<Long,ShopOrder> find = new Finder<Long,ShopOrder>(ShopOrder.class);

    //Find all Products in the database
    public static List<ShopOrder> findAll() {
        return ShopOrder.find.all();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Calendar getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(Calendar orderDate) {
        OrderDate = orderDate;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    } 
    public String getOrderDateString() {
        if(OrderDate == null) {
            return "No Date Availible";
        }
        String s = new SimpleDateFormat("dd-MMM-yyyy").format(OrderDate.getTime());
        return s;
    }


    public void adjustStock(){
        for (OrderItem i : items) {
            Product p = Product.find.byId(i.getProduct().getId());
            if (i.getProduct().getId() == p.getId()) {
                int quantity = i.getQuantity();
                p.incrementStock(quantity);
                p.update();
            }
        }
    }

}