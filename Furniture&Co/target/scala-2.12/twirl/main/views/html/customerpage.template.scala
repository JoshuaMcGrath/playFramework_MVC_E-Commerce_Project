
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

object customerpage extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[models.users.Customer],models.users.User,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customerList: List[models.users.Customer], user : models.users.User, filter: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""

"""),_display_(/*4.2*/main("Customer Settings",user,filter)/*4.39*/{_display_(Seq[Any](format.raw/*4.40*/("""




















""")))}))
      }
    }
  }

  def render(customerList:List[models.users.Customer],user:models.users.User,filter:String): play.twirl.api.HtmlFormat.Appendable = apply(customerList,user,filter)

  def f:((List[models.users.Customer],models.users.User,String) => play.twirl.api.HtmlFormat.Appendable) = (customerList,user,filter) => apply(customerList,user,filter)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 22 21:32:35 IST 2018
                  SOURCE: /media/sf_student/Finished/Finished Document/Furniture&Co/app/views/customerpage.scala.html
                  HASH: 0f98d82f0d9b87f836e8bad4a6769805d29bbd85
                  MATRIX: 1001->1|1180->87|1208->90|1253->127|1291->128
                  LINES: 28->1|33->2|35->4|35->4|35->4
                  -- GENERATED --
              */
          