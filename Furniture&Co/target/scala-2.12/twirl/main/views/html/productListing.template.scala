
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object productListing extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[models.Product,models.users.User,play.api.Environment,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(p: models.Product,user: models.users.User,e: play.api.Environment, filter:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Product Listing",user, filter)/*3.38*/{_display_(Seq[Any](format.raw/*3.39*/("""
    """),format.raw/*4.5*/("""<br>
    <br>
   
    
    <div class="container-fluid">
        <div class="content-wrapper">	
            <div class="item-container">	
                <div class="container">	
                    <div class="col-md-12">
                            <div class="autoFit">
                        <div class="product col-md-3 service-image-left">
                        
                            <center>
                        
                                          
                      """),_display_(/*19.24*/if(e.resource("public/images/productImages/" + p.getId + ".jpg").isDefined)/*19.99*/ {_display_(Seq[Any](format.raw/*19.101*/("""
                        """),format.raw/*20.25*/("""<td><img src="/assets/images/productImages/"""),_display_(/*20.69*/(p.getId + ".jpg")),format.raw/*20.87*/(""""/></td>
                    """)))}/*21.23*/else/*21.28*/{_display_(Seq[Any](format.raw/*21.29*/("""
                        """),format.raw/*22.25*/("""<td><img src="/assets/images/productImages/noImage.jpg"/></td>
                    """)))}),format.raw/*23.22*/("""            
                
                            """),format.raw/*25.29*/("""</center>
                        </div>
                        
                    </div>
                   
                        
                    <div class="col-md-7">
                        <div class="product-title"><p>Name: """),_display_(/*32.62*/p/*32.63*/.getName),format.raw/*32.71*/(""" """),format.raw/*32.72*/("""</p></div>
                        <div class="product-desc"><p>Description: """),_display_(/*33.68*/p/*33.69*/.getDescription),format.raw/*33.84*/("""</p></div>
                        <div class="product-rating"><i class="fa fa-star gold"></i> <i class="fa fa-star gold"></i> <i class="fa fa-star gold"></i> <i class="fa fa-star gold"></i> <i class="fa fa-star-o"></i> </div>
                        <hr>
                        <div class="product-price"><p>Price:  €"""),_display_(/*36.65*/("%.2f".format(p.getPrice))),format.raw/*36.92*/("""</p></div>
                        <div class="product-stock"><p>Stock: """),_display_(/*37.63*/p/*37.64*/.getStock),format.raw/*37.73*/(""" """),format.raw/*37.74*/("""</p></div>
                        <div class="Add Comment">
                                <a href=""""),_display_(/*39.43*/routes/*39.49*/.ShoppingCtrl.addComment(p.getId,"")),format.raw/*39.85*/("""">
                                        <button class="btn btn-primary">Submit a review.</button>
                                </a></div>
                        
                        
                        <hr>
                        <div class="btn-group cart">
                            <a href=""""),_display_(/*46.39*/routes/*46.45*/.ShoppingCtrl.addToBasket(p.getId)),format.raw/*46.79*/(""""button type="button" class="btn btn-success">
                                Add to cart 
                            </button></a>
                        </div>
                       
                    </div>
                </div> 
            </div>







        
            <div class="container-fluid">		
                <div class="col-md-12 product-info">
                        <ul id="myTab" class="nav nav-tabs nav_tabs">
                             <li><a href="#service-three" data-toggle="tab">Comments</a>
                            """),_display_(/*66.30*/for(g<-p.getComments()) yield /*66.53*/{_display_(Seq[Any](format.raw/*66.54*/("""
                                """),format.raw/*67.33*/("""<p>Review:  """),_display_(/*67.46*/g/*67.47*/.getCommenting),format.raw/*67.61*/("""             """),format.raw/*67.74*/("""</p>





                            """)))}),format.raw/*73.30*/("""
                            
                         
                            
                            







                            """),format.raw/*85.29*/("""</li>
                            

                        </ul>
                    
                           

                        </div>
                        <div class="tab-pane fade" id="service-three">
                                                    
                        </div>
                    </div>
                    <hr>
                </div>
            </div>
        </div>
    </div>
""")))}),format.raw/*102.2*/("""
"""))
      }
    }
  }

  def render(p:models.Product,user:models.users.User,e:play.api.Environment,filter:String): play.twirl.api.HtmlFormat.Appendable = apply(p,user,e,filter)

  def f:((models.Product,models.users.User,play.api.Environment,String) => play.twirl.api.HtmlFormat.Appendable) = (p,user,e,filter) => apply(p,user,e,filter)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 22 21:32:35 IST 2018
                  SOURCE: /media/sf_student/Finished/Finished Document/Furniture&Co/app/views/productListing.scala.html
                  HASH: 941701da61c3873332e3a1fbbaa916ba99e775eb
                  MATRIX: 1011->1|1187->84|1214->86|1258->122|1296->123|1327->128|1854->628|1938->703|1979->705|2032->730|2103->774|2142->792|2191->823|2204->828|2243->829|2296->854|2411->938|2497->996|2766->1238|2776->1239|2805->1247|2834->1248|2939->1326|2949->1327|2985->1342|3332->1662|3380->1689|3480->1762|3490->1763|3520->1772|3549->1773|3679->1876|3694->1882|3751->1918|4092->2232|4107->2238|4162->2272|4749->2832|4788->2855|4827->2856|4888->2889|4928->2902|4938->2903|4973->2917|5014->2930|5084->2969|5261->3118|5715->3541
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|50->19|50->19|50->19|51->20|51->20|51->20|52->21|52->21|52->21|53->22|54->23|56->25|63->32|63->32|63->32|63->32|64->33|64->33|64->33|67->36|67->36|68->37|68->37|68->37|68->37|70->39|70->39|70->39|77->46|77->46|77->46|97->66|97->66|97->66|98->67|98->67|98->67|98->67|98->67|104->73|116->85|133->102
                  -- GENERATED --
              */
          