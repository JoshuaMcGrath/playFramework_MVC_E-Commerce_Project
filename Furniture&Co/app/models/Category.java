package models;



import java.util.*;
import javax.persistence.*;


import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;
@Entity
public class Category extends Model{

@Id
private Long id;
@Constraints.Required
private String name;


@OneToMany
private List<Product> products;





public Category(){

}

public Category(Long id, String name, List<Product>products){
    this.id=id;
    this.name=name;
    this.products=products;
    
}

public Long getID() {
    return id;
}

public String getName() {
    return name;
}

public List getProducts() {
    return products;
}



public void setId(Long id) {
    this.id = id;
}

public void setName(String name){
    this.name=name;
}

public void setList(List products){
    this.products=products;
}


public static Finder<Long, Category> find = new Finder<Long,Category>(Category.class);

public static List<Category> findAll(){
    return Category.find.query().where().orderBy("name asc").findList();
}


public static Map<String,String> options(){
LinkedHashMap<String,String> options = new LinkedHashMap<>();

for(Category c: Category.findAll()){
    options.put(c.getID().toString(),c.getName());
}
return options;


}












}