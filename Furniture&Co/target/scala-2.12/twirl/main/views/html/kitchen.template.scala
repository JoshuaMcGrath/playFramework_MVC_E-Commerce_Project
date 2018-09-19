
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

object kitchen extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[List[models.Product],List[models.Category],models.users.User,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product],categories: List[models.Category],user : models.users.User, filter: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Kitchen Appliances",user, filter)/*3.41*/{_display_(Seq[Any](format.raw/*3.42*/("""
  



    """),_display_(/*8.6*/for(p<- products) yield /*8.23*/{_display_(Seq[Any](format.raw/*8.24*/("""
        
        
                """),format.raw/*11.17*/("""<div class="col-md-3">
                  <div class="thumbnail">
                    
                      <img src="http://urbanliferealty.com/wp-content/uploads/2017/06/53-Dutch-Settlers-Crt-East-MLS_Size-005-7-Bathroom-640x480-72dpi.jpg" alt="Lights" style="width:100%">
                      <div class="caption">
        
                  <p>Product:"""),_display_(/*17.31*/p/*17.32*/.getDescription),format.raw/*17.47*/("""
                  """),format.raw/*18.19*/("""</br>
                    Price: """),_display_(/*19.29*/p/*19.30*/.getPrice),format.raw/*19.39*/("""</p>
                        
                      
                      </div>
                    </a>
                  </div>
                </div>
          """)))}),format.raw/*26.12*/("""
        





















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
                  SOURCE: /media/sf_student/Finished/Finished Document/Furniture&Co/app/views/kitchen.scala.html
                  HASH: 292913b265edf11b1afd8d6dac13d42633155110
                  MATRIX: 1011->1|1212->109|1239->111|1286->150|1324->151|1361->163|1393->180|1431->181|1494->216|1879->574|1889->575|1925->590|1972->609|2033->643|2043->644|2073->653|2270->819
                  LINES: 28->1|33->2|34->3|34->3|34->3|39->8|39->8|39->8|42->11|48->17|48->17|48->17|49->18|50->19|50->19|50->19|57->26
                  -- GENERATED --
              */
          