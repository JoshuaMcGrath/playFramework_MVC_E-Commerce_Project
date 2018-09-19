
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

object search extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[List[models.Category],List[models.Product],Long,String,models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(categories: List[models.Category], products: List[models.Product], catId: Long, filter:String,user : models.users.User,e: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Search",user, filter)/*3.29*/{_display_(Seq[Any](format.raw/*3.30*/("""
  
"""),format.raw/*5.1*/("""<br>
<br>
<br>
  <div class="container">
      <div class="row">
          <div class="col-sm-6 col-sm-offset-3">
              <div id="imaginary_container"> 
                  <div class="input-group stylish-input-group input-append">
                      <form action=""""),_display_(/*13.38*/routes/*13.44*/.HomeController.search()),format.raw/*13.68*/("""" method"GET">
                      <input type="text" class="form-control" name="filter" value=""""),_display_(/*14.85*/filter),format.raw/*14.91*/("""" placeholder="Search">
                        </form>
                    
                      <span class="input-group-addon">
                          <button type="submit">
                              <span class="glyphicon glyphicon-search"></span>
                          </button>  
                      </span>
                  </div>
              </div>
          </div>
    </div>
  </div>
  
  <br>
  <br>
  <br>
  <br>
  <br>

  <br>
  <br>
  <br>
  <br>
  
  <br>
  <br>
  <br>
  <br>
  <br>
  <br>
  <br>
  <br>
  
 


    """),_display_(/*51.6*/for(p<- products) yield /*51.23*/{_display_(Seq[Any](format.raw/*51.24*/("""
        
      """),format.raw/*53.7*/("""</div>
                <div class="col-sm-3">
                    <a href=""""),_display_(/*55.31*/routes/*55.37*/.HomeController.productListing(p.getId)),format.raw/*55.76*/("""">
                    <article class="col-item">
                      <div class="photo">
                      <div class="options-cart-round">
                        
                        </button>
                      </div>
                      
                      """),_display_(/*63.24*/if(e.resource("public/images/productImages/" + p.getId + ".jpg").isDefined)/*63.99*/ {_display_(Seq[Any](format.raw/*63.101*/("""
                        """),format.raw/*64.25*/("""<td><img src="/assets/images/productImages/"""),_display_(/*64.69*/(p.getId + ".jpg")),format.raw/*64.87*/(""""/></td>
                    """)))}/*65.23*/else/*65.28*/{_display_(Seq[Any](format.raw/*65.29*/("""
                        """),format.raw/*66.25*/("""<td><img src="/assets/images/productImages/noImage.jpg"/></td>
                    """)))}),format.raw/*67.22*/("""            
                
                    """),format.raw/*69.21*/("""</div>
                    <div class="info">
                      <div class="row">
                          <a href=""""),_display_(/*72.37*/routes/*72.43*/.HomeController.productListing(p.getId)),format.raw/*72.82*/("""">
                        <div class="price-details col-md-6">
                          
                          
                            """),_display_(/*76.30*/p/*76.31*/.getName),format.raw/*76.39*/("""</h1>
                          <span class="price-new">Price:  €"""),_display_(/*77.61*/p/*77.62*/.getPrice),format.raw/*77.71*/("""</span>
                        </div>
                      </div>
                    </div>
                  </a>

                  
                    
                  </article>
                  
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
      
                
            
          """)))}),format.raw/*96.12*/("""
      
      
        """),format.raw/*99.9*/("""</div>
        

<br>
<br>
<br>
<br>
<br>
          
      </div>
    </div>
  </div>
</div>





<br>
<br>
<br>
<br>
<br>

<br>
<br>
<br>
<br>
<br>





""")))}))
      }
    }
  }

  def render(categories:List[models.Category],products:List[models.Product],catId:Long,filter:String,user:models.users.User,e:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(categories,products,catId,filter,user,e)

  def f:((List[models.Category],List[models.Product],Long,String,models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (categories,products,catId,filter,user,e) => apply(categories,products,catId,filter,user,e)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 22 21:32:35 IST 2018
                  SOURCE: /media/sf_student/Finished/Finished Document/Furniture&Co/app/views/search.scala.html
                  HASH: 75b4f193c740e066cae36ddafa79ad6080b170be
                  MATRIX: 1036->1|1274->146|1301->148|1336->175|1374->176|1404->180|1705->454|1720->460|1765->484|1891->583|1918->589|2493->1138|2526->1155|2565->1156|2608->1172|2711->1248|2726->1254|2786->1293|3094->1574|3178->1649|3219->1651|3272->1676|3343->1720|3382->1738|3431->1769|3444->1774|3483->1775|3536->1800|3651->1884|3729->1934|3878->2056|3893->2062|3953->2101|4127->2248|4137->2249|4166->2257|4259->2323|4269->2324|4299->2333|4693->2696|4743->2719
                  LINES: 28->1|33->2|34->3|34->3|34->3|36->5|44->13|44->13|44->13|45->14|45->14|82->51|82->51|82->51|84->53|86->55|86->55|86->55|94->63|94->63|94->63|95->64|95->64|95->64|96->65|96->65|96->65|97->66|98->67|100->69|103->72|103->72|103->72|107->76|107->76|107->76|108->77|108->77|108->77|127->96|130->99
                  -- GENERATED --
              */
          