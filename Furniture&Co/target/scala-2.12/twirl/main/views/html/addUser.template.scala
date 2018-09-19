
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

object addUser extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[models.users.User],models.users.User,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userForm : Form[models.users.User],user : models.users.User, filter: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*3.1*/("""



"""),_display_(/*7.2*/main("Register",user, filter)/*7.31*/{_display_(Seq[Any](format.raw/*7.32*/("""
    """),format.raw/*8.5*/("""<div class="container">
    <div class="row"></div>
<div class="col-sm-6"></div>
<h1>Fill out current form to register.</h1>

"""),_display_(/*13.2*/form(routes.HomeController.addUserSubmit(), 'class -> "form-horizontal", 'role -> "form")/*13.91*/{_display_(Seq[Any](format.raw/*13.92*/("""
    """),_display_(/*14.6*/CSRF/*14.10*/.formField),format.raw/*14.20*/("""

    """),_display_(/*16.6*/inputText(userForm("email"), '_label -> "email", 'class -> "form-control")),format.raw/*16.80*/("""
    """),_display_(/*17.6*/inputText(userForm("name"), '_label -> "name", 'class -> "form-control")),format.raw/*17.78*/("""
    """),_display_(/*18.6*/inputText(userForm("password"), '_label -> "password", 'class -> "form-control")),format.raw/*18.86*/("""                 
   
    
    
  
    
    
    """),format.raw/*25.5*/("""<div class="actions">
    <input type="submit" value = "Register" class="btn btn-primary">
    <a href =""""),_display_(/*27.16*/routes/*27.22*/.HomeController.Home()),format.raw/*27.44*/("""">
        <button type="button" class="btn btn-warning">Cancel</button>
    </a>
    
    
""")))}),format.raw/*32.2*/("""
    
    """),format.raw/*34.5*/("""</div>
</div>

    """)))}))
      }
    }
  }

  def render(userForm:Form[models.users.User],user:models.users.User,filter:String): play.twirl.api.HtmlFormat.Appendable = apply(userForm,user,filter)

  def f:((Form[models.users.User],models.users.User,String) => play.twirl.api.HtmlFormat.Appendable) = (userForm,user,filter) => apply(userForm,user,filter)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 22 21:32:34 IST 2018
                  SOURCE: /media/sf_student/Finished/Finished Document/Furniture&Co/app/views/addUser.scala.html
                  HASH: 0f08ad03a0fb827220233874b6c7d47202df2917
                  MATRIX: 992->1|1142->80|1186->96|1216->101|1253->130|1291->131|1322->136|1475->263|1573->352|1612->353|1644->359|1657->363|1688->373|1721->380|1816->454|1848->460|1941->532|1973->538|2074->618|2150->667|2283->773|2298->779|2341->801|2464->894|2501->904
                  LINES: 28->1|31->2|34->3|38->7|38->7|38->7|39->8|44->13|44->13|44->13|45->14|45->14|45->14|47->16|47->16|48->17|48->17|49->18|49->18|56->25|58->27|58->27|58->27|63->32|65->34
                  -- GENERATED --
              */
          