package models;
import java.util.*;
import javax.persistence.*;
import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;
import models.*;
@Entity
public class Product extends Model{
    @Id
    private Long id;
    @Constraints.Required
    private String name;
    @Constraints.Required
    private double price;
    @Constraints.Required
    private String description;
    @Constraints.Required
    private int stock; 
    

    @ManyToOne
    private Category category;

    @OneToMany(mappedBy = "p1")
    private List<Comment> comments;

    public Product() {
    }

    public Product(Long id, String name, double price, int stock, String description, Category category, List<Comment> comments) {
        this.id = id; 
        this.name = name;
        this.price = price;
        this.description = description;
        this.category=category;
        this.stock = stock;
        this.comments = comments;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public int getStock() { 
        return stock; 
    } 
    public void setStock(int stock) { 
        this.stock = stock; 
    } 

    public List <Comment> getComments() { 
        return comments; 
    } 
    public void setComments(List<Comment> comments) { 
        this.comments = comments;
    } 
   
    public int increaseSold(int sold){
         sold++;
        return sold;
    }

public Category getCategory(){
    return category;
}

public void setCategory(Category category){
    this.category=category;
}



    
    public static final Finder<Long, Product> find = new Finder<>(Product.class);

    public static final List<Product> findAll(){
        return Product.find.all();
    }
    public static final List<Comment> findAll1(){
        return Comment.find.all();
    }

    public static List<Product> findAll(String filter) {
        return Product.find.query().where()
        .ilike("name", "%" +filter+ "%")
        .orderBy("name asc")
        .findList();
    }

         public boolean decrementStock(){
            boolean allowed =true;
            if ((stock-1) < 0){
                allowed = false;
            }else{
                stock = stock-1;
            }
            return allowed;
        }
        public void incrementStock(int q){          
            stock = stock +q;
        }

        public static List<Product> findFilter(Long catId, String filter) {
            return Product.find.query().where()
            .eq("category.id", catId)
            .ilike("name", "%" + filter + "%")
            .orderBy("name asc")
            .findList();
            
        }
        
        public List<String> getProductComments(){
            List<String> comments123 = new ArrayList<>();
              if(getComments().size() > 0){
                  for(int i = 0; i < getComments().size(); i++){
                    comments123.add(getComments().get(i).getCommenting());
                  }
              } else {
                comments123.add("not currently placed on a product");
              }
                 return comments123;
          }

   
    
}