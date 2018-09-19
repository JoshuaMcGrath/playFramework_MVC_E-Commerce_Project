
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

object livingroom extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[List[models.Product],List[models.Category],models.users.User,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product],categories: List[models.Category],user : models.users.User, filter: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Living Room",user, filter)/*2.34*/{_display_(Seq[Any](format.raw/*2.35*/("""
  

    """),_display_(/*5.6*/for(p<- products) yield /*5.23*/{_display_(Seq[Any](format.raw/*5.24*/("""
        
        
                """),format.raw/*8.17*/("""<div class="col-md-3">
                  <div class="thumbnail">
                    
                      <img src="http://urbanliferealty.com/wp-content/uploads/2017/06/53-Dutch-Settlers-Crt-East-MLS_Size-005-7-Bathroom-640x480-72dpi.jpg" alt="Lights" style="width:100%">
                      <div class="caption">
        
                  <p>Product:"""),_display_(/*14.31*/p/*14.32*/.getDescription),format.raw/*14.47*/("""
                  """),format.raw/*15.19*/("""</br>
                    Price: """),_display_(/*16.29*/p/*16.30*/.getPrice),format.raw/*16.39*/("""</p>
                        
                      
                      </div>
                    </a>
                  </div>
                </div>
          """)))}),format.raw/*23.12*/("""
        









""")))}))
      }
    }
  }

  def render(products:List[models.Product],categories:List[models.Category],user:models.users.User,filter:String): play.twirl.api.HtmlFormat.Appendable = apply(products,categories,user,filter)

  def f:((List[models.Product],List[models.Category],models.users.User,String) => play.twirl.api.HtmlFormat.Appendable) = (products,categories,user,filter) => apply(products,categories,user,filter)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 22 21:32:35 IST 2018
                  SOURCE: /media/sf_student/Finished/Finished Document/Furniture&Co/app/views/livingroom.scala.html
                  HASH: e85276326a72ffcd33c76e72434f7f6d8045e732
                  MATRIX: 1014->1|1215->110|1255->142|1293->143|1328->153|1360->170|1398->171|1460->206|1845->564|1855->565|1891->580|1938->599|1999->633|2009->634|2039->643|2236->809
                  LINES: 28->1|33->2|33->2|33->2|36->5|36->5|36->5|39->8|45->14|45->14|45->14|46->15|47->16|47->16|47->16|54->23
                  -- GENERATED --
              */
          