
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

object bathroom extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[List[models.Product],List[models.Category],Long,String,models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product],categories: List[models.Category], catId: Long, filter:String,user : models.users.User, e: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""                                                                                                                                                  
"""),_display_(/*3.2*/main("Bathrooms",user, filter)/*3.32*/{_display_(Seq[Any](format.raw/*3.33*/("""
  
  """),format.raw/*5.3*/("""<div class="row"></div>

  <br>
  <br>
  <br>
  <br>
  <br>

  
 
   
                  

    """),_display_(/*18.6*/for(p<- products) yield /*18.23*/{_display_(Seq[Any](format.raw/*18.24*/("""
        
      

                """),format.raw/*22.17*/("""<div class="col-sm-3">
                    <a href=""""),_display_(/*23.31*/routes/*23.37*/.HomeController.productListing(p.getId)),format.raw/*23.76*/("""">
                    <article class="col-item">
                      <div class="photo">
                      <div class="options-cart-round">
                        
                        </button>
                      </div>
                      
                      """),_display_(/*31.24*/if(e.resource("public/images/productImages/" + p.getId + ".jpg").isDefined)/*31.99*/ {_display_(Seq[Any](format.raw/*31.101*/("""
                        """),format.raw/*32.25*/("""<td><img src="/assets/images/productImages/"""),_display_(/*32.69*/(p.getId + ".jpg")),format.raw/*32.87*/(""""/></td>
                    """)))}/*33.23*/else/*33.28*/{_display_(Seq[Any](format.raw/*33.29*/("""
                        """),format.raw/*34.25*/("""<td><img src="/assets/images/productImages/noImage.jpg"/></td>
                    """)))}),format.raw/*35.22*/("""                  
                  """),format.raw/*36.19*/("""</div>
                    <div class="info">
                      <div class="row">
                          <a href=""""),_display_(/*39.37*/routes/*39.43*/.HomeController.productListing(p.getId)),format.raw/*39.82*/("""">
                        <div class="price-details col-md-6">
                          
                          
                            """),_display_(/*43.30*/p/*43.31*/.getName),format.raw/*43.39*/("""</h1>
                          <span class="price-new">Price:  €"""),_display_(/*44.61*/p/*44.62*/.getPrice),format.raw/*44.71*/("""</span>
                        </div>
                      </div>
                    </div>
                  </a>

                  
                    
                  </article>
                  
                </div>

                
            
          """)))}),format.raw/*58.12*/("""
      
      

          









""")))}))
      }
    }
  }

  def render(products:List[models.Product],categories:List[models.Category],catId:Long,filter:String,user:models.users.User,e:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(products,categories,catId,filter,user,e)

  def f:((List[models.Product],List[models.Category],Long,String,models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (products,categories,catId,filter,user,e) => apply(products,categories,catId,filter,user,e)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 22 21:32:34 IST 2018
                  SOURCE: /media/sf_student/Finished/Finished Document/Furniture&Co/app/views/bathroom.scala.html
                  HASH: 89846df1edd359d9e07b67b32418141e4fd751ce
                  MATRIX: 1038->1|1276->146|1449->294|1487->324|1525->325|1557->331|1678->426|1711->443|1750->444|1812->478|1892->531|1907->537|1967->576|2275->857|2359->932|2400->934|2453->959|2524->1003|2563->1021|2612->1052|2625->1057|2664->1058|2717->1083|2832->1167|2897->1204|3046->1326|3061->1332|3121->1371|3295->1518|3305->1519|3334->1527|3427->1593|3437->1594|3467->1603|3770->1875
                  LINES: 28->1|33->2|34->3|34->3|34->3|36->5|49->18|49->18|49->18|53->22|54->23|54->23|54->23|62->31|62->31|62->31|63->32|63->32|63->32|64->33|64->33|64->33|65->34|66->35|67->36|70->39|70->39|70->39|74->43|74->43|74->43|75->44|75->44|75->44|89->58
                  -- GENERATED --
              */
          