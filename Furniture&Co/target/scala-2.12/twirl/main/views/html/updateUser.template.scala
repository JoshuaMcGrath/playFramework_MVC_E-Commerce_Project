
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

object updateUser extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[String,Form[models.users.Customer],models.users.User,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(email: String, updateCustomerForm: Form[models.users.Customer], user: models.users.User,filter: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Update Customer", user,filter)/*4.38*/{_display_(Seq[Any](format.raw/*4.39*/("""

    """),format.raw/*6.5*/("""<br>
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
    """),_display_(/*18.6*/form(action=routes.HomeController.updateCustomerSubmit(email), 'class -> "form-horizontal", 
    'role -> "form",'enctype -> "multipart/form-data")/*19.55*/ {_display_(Seq[Any](format.raw/*19.57*/("""
        """),_display_(/*20.10*/CSRF/*20.14*/.formField),format.raw/*20.24*/("""
        """),_display_(/*21.10*/inputText(updateCustomerForm("email"), '_label -> "", 'hidden -> "hidden")),format.raw/*21.84*/("""
        """),_display_(/*22.10*/inputText(updateCustomerForm("email"), '_label -> "", 'hidden -> "hidden")),format.raw/*22.84*/("""
        """),_display_(/*23.10*/inputText(updateCustomerForm("password"), '_label -> "New Password", 'class -> "form-control")),format.raw/*23.104*/("""
        """),_display_(/*24.10*/inputText(updateCustomerForm("firstname"), '_label -> "", 'hidden -> "hidden")),format.raw/*24.88*/("""
        """),_display_(/*25.10*/inputText(updateCustomerForm("lastname"), '_label -> "", 'hidden -> "hidden")),format.raw/*25.87*/("""
        
        
        """),format.raw/*28.9*/("""<div class="actions">
            <input type="submit" value="Update User" class="btn btn-primary">
            <a href=""""),_display_(/*30.23*/routes/*30.29*/.HomeController.Home()),format.raw/*30.51*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
     """)))}),format.raw/*34.7*/("""
    




    """)))}))
      }
    }
  }

  def render(email:String,updateCustomerForm:Form[models.users.Customer],user:models.users.User,filter:String): play.twirl.api.HtmlFormat.Appendable = apply(email,updateCustomerForm,user,filter)

  def f:((String,Form[models.users.Customer],models.users.User,String) => play.twirl.api.HtmlFormat.Appendable) = (email,updateCustomerForm,user,filter) => apply(email,updateCustomerForm,user,filter)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 22 21:32:35 IST 2018
                  SOURCE: /media/sf_student/Finished/Finished Document/Furniture&Co/app/views/updateUser.scala.html
                  HASH: c74d83545795c34e4dd1832116850d7c1c24030e
                  MATRIX: 1006->1|1183->107|1227->123|1254->125|1298->161|1336->162|1368->168|1503->277|1659->424|1699->426|1736->436|1749->440|1780->450|1817->460|1912->534|1949->544|2044->618|2081->628|2197->722|2234->732|2333->810|2370->820|2468->897|2522->924|2671->1046|2686->1052|2729->1074|2878->1193
                  LINES: 28->1|31->2|34->3|35->4|35->4|35->4|37->6|49->18|50->19|50->19|51->20|51->20|51->20|52->21|52->21|53->22|53->22|54->23|54->23|55->24|55->24|56->25|56->25|59->28|61->30|61->30|61->30|65->34
                  -- GENERATED --
              */
          