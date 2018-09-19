package models;



import java.util.*;
import javax.persistence.*;

import models.*;
import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;
@Entity
public class Comment extends Model{

    @Id
    private Long commentId;
    @Constraints.Required
    private String commenting;
    @Constraints.Required
    private int   rating;

    @ManyToOne
    private Product p1;

    public  Comment(){

    }

    public Comment(Long commentId, String commenting, int rating, Product p1){
        this.commentId = commentId;
        this.commenting = commenting;
        this.rating = rating;
        this.p1=p1;
    }

    public Product getProduct(){
        return p1;
    }

    public void setProduct(Product p1){
        this.p1=p1;
    }

    public Long getcommentId() {
        return commentId;
    }

    public void setcommentId(Long commentId) {
        this.commentId = commentId;
    }

    public String getCommenting() {
        return commenting;
    }

    public void setCommenting(String commenting) {
        this.commenting = commenting;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public static final Finder<Long, Comment> find = new Finder<>(Comment.class);


    public static final List<Comment> findAll(){
        return Comment.find.all();
    }




    public static final List<Product> findAll1(){
        return Product.find.all();
    }

    






}