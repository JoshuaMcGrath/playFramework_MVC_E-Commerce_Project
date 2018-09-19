
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

object bedroom extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[List[models.Product],List[models.Category],Long,models.users.User,String,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product],categories: List[models.Category], catId: Long, user : models.users.User, filter: String,e: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Bedroom",user, filter)/*2.30*/{_display_(Seq[Any](format.raw/*2.31*/("""
    
  """),format.raw/*4.3*/("""<div class="row"></div>
  
    <br>
    <br>
    <br>
    <br>
    <br>
  
    
   
      <div class="container">
          <div class="row">
                <h1>Bedroom Appliances</h1>
                
        
              </div>
            </div>
                    
  
      """),_display_(/*23.8*/for(g<- products) yield /*23.25*/{_display_(Seq[Any](format.raw/*23.26*/("""
          
        
  
                  """),format.raw/*27.19*/("""<div class="col-sm-3">
                      <article class="col-item">
                        <div class="photo">
                        <div class="options-cart-round">
                          <button class="btn btn-default" title="Add to cart">
                            <span class="fa fa-shopping-cart"></span>
                          </button>
                        </div>>c
                        """),_display_(/*35.26*/if(e.resource("public/images/productImages/" + g.getId + ".jpg").isDefined)/*35.101*/ {_display_(Seq[Any](format.raw/*35.103*/("""
                          """),format.raw/*36.27*/("""<td><img src="/assets/images/productImages/"""),_display_(/*36.71*/(g.getId + ".jpg")),format.raw/*36.89*/(""""/></td>
                      """)))}/*37.25*/else/*37.30*/{_display_(Seq[Any](format.raw/*37.31*/("""
                          """),format.raw/*38.27*/("""<td><img src="/assets/images/productImages/noImage.jpg"/></td>
                      """)))}),format.raw/*39.24*/("""                  
                      """),format.raw/*40.23*/("""</div>
                      <div class="info">
                        <div class="row">
                          <div class="price-details col-md-6">
                            
                            <h1><a href=""""),_display_(/*45.43*/routes/*45.49*/.HomeController.productListing(g.getId)),format.raw/*45.88*/("""">
                              """),_display_(/*46.32*/g/*46.33*/.getName),format.raw/*46.41*/("""</h1>
                            <span class="price-new">"""),_display_(/*47.54*/g/*47.55*/.getPrice),format.raw/*47.64*/("""</span>
                          </div>
                        </div>
                      </div>
  
                    <a href=""""),_display_(/*52.31*/routes/*52.37*/.ShoppingCtrl.addToBasket(g.getId)),format.raw/*52.71*/(""""  class="btn btn-default btn-xs"><span class="glyphicon glyphicon-shopping-cart"></span></a>
                      
                    </article>
                    
                  </div>
  
                  
              
            """)))}),format.raw/*60.14*/("""
        
        
  
            
  
  
  
  
  
  
  
  
  
  """)))}))
      }
    }
  }

  def render(products:List[models.Product],categories:List[models.Category],catId:Long,user:models.users.User,filter:String,e:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(products,categories,catId,user,filter,e)

  def f:((List[models.Product],List[models.Category],Long,models.users.User,String,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (products,categories,catId,user,filter,e) => apply(products,categories,catId,user,filter,e)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 22 21:32:34 IST 2018
                  SOURCE: /media/sf_student/Finished/Finished Document/Furniture&Co/app/views/bedroom.scala.html
                  HASH: 39503bc11b8a90254e18dcc0177b1ad8cfdef881
                  MATRIX: 1037->1|1276->148|1312->176|1350->177|1384->185|1693->468|1726->485|1765->486|1835->528|2278->944|2363->1019|2404->1021|2459->1048|2530->1092|2569->1110|2620->1143|2633->1148|2672->1149|2727->1176|2844->1262|2913->1303|3164->1527|3179->1533|3239->1572|3300->1606|3310->1607|3339->1615|3425->1674|3435->1675|3465->1684|3626->1818|3641->1824|3696->1858|3971->2102
                  LINES: 28->1|33->2|33->2|33->2|35->4|54->23|54->23|54->23|58->27|66->35|66->35|66->35|67->36|67->36|67->36|68->37|68->37|68->37|69->38|70->39|71->40|76->45|76->45|76->45|77->46|77->46|77->46|78->47|78->47|78->47|83->52|83->52|83->52|91->60
                  -- GENERATED --
              */
          