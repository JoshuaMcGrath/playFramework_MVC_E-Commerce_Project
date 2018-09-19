
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

object addCustomer extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[models.users.Customer],models.users.User,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customerForm : Form[models.users.Customer],user : models.users.User, filter: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._
/*3.2*/import play.api.data.validation.Constraints._


Seq[Any](format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("New Customer",user, filter)/*5.35*/{_display_(Seq[Any](format.raw/*5.36*/("""


    """),_display_(/*8.6*/form(routes.HomeController.addCustomerSubmit(), 'class -> "form-horizontal", 'role -> "form")/*8.99*/{_display_(Seq[Any](format.raw/*8.100*/("""
        """),_display_(/*9.10*/CSRF/*9.14*/.formField),format.raw/*9.24*/("""
    """),format.raw/*10.5*/("""<div class="container">
    <div class="row centered-form">
    <div class="col-xs-12 col-sm-8 col-md-4 col-sm-offset-2 col-md-offset-4">
    <div class="panel panel-default">
                    <div class="panel-heading">
                            <h3 class="panel-title">Please Register<small>It's free!</small></h3>
                             </div>
                             <div class="panel-body">
                           
                                <div class="row">
                                    <div class="col-xs-6 col-sm-6 col-md-6">
                                        <div class="form-group">
                                                """),_display_(/*22.50*/inputText(customerForm("firstName"), '_label -> "First Name", 'class -> "form-control input-sm")),format.raw/*22.146*/("""  
                                        """),format.raw/*23.41*/("""</div>
                                    </div>
                                    <div class="col-xs-6 col-sm-6 col-md-6">
                                        <div class="form-group">
                                                """),_display_(/*27.50*/inputText(customerForm("lastName"), '_label -> "Last Name", 'class -> "form-control input-sm")),format.raw/*27.144*/("""  
                                            """),format.raw/*28.45*/("""</div>
                                    </div>
                                </div>
    
                                <div class="form-group">
                                        """),_display_(/*33.42*/inputText(customerForm("email"), '_label -> "Email Address", 'class -> "form-control input-sm")),format.raw/*33.137*/("""
                                """),format.raw/*34.33*/("""</div>
    
                                <div class="row">
                                    <div class="col-xs-6 col-sm-6 col-md-6">
                                        <div class="form-group">
                                                """),_display_(/*39.50*/inputText(customerForm("password"), '_label -> "Password", 'class -> "form-control input-sm")),format.raw/*39.143*/("""                                                
                                        """),format.raw/*40.41*/("""</div>
                                    </div>
                                    
                                </div>
                                
                           
                              
        <div class="actions">
                <input type="submit" value = "Register" class="btn btn-info btn-block">
                <a href =""""),_display_(/*49.28*/routes/*49.34*/.HomeController.Home()),format.raw/*49.56*/("""">
                    <button type="button" class="btn btn-warning btn-block">Cancel</button>
                </a>
            </div>
            """)))}),format.raw/*53.14*/("""           
                           
                        
                    """),format.raw/*56.21*/("""</div>
                </div>
            </div>
            </div>
            </div>
       

    """)))}))
      }
    }
  }

  def render(customerForm:Form[models.users.Customer],user:models.users.User,filter:String): play.twirl.api.HtmlFormat.Appendable = apply(customerForm,user,filter)

  def f:((Form[models.users.Customer],models.users.User,String) => play.twirl.api.HtmlFormat.Appendable) = (customerForm,user,filter) => apply(customerForm,user,filter)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 22 21:32:34 IST 2018
                  SOURCE: /media/sf_student/Finished/Finished Document/Furniture&Co/app/views/addCustomer.scala.html
                  HASH: 846bf73e022c8ba0ab0733c8a2c45a526e440ab0
                  MATRIX: 1000->1|1158->88|1181->105|1255->151|1282->153|1323->186|1361->187|1394->195|1495->288|1534->289|1570->299|1582->303|1612->313|1644->318|2352->999|2470->1095|2541->1138|2809->1379|2925->1473|3000->1520|3219->1712|3336->1807|3397->1840|3677->2093|3792->2186|3909->2275|4299->2638|4314->2644|4357->2666|4536->2814|4649->2899
                  LINES: 28->1|31->2|32->3|35->4|36->5|36->5|36->5|39->8|39->8|39->8|40->9|40->9|40->9|41->10|53->22|53->22|54->23|58->27|58->27|59->28|64->33|64->33|65->34|70->39|70->39|71->40|80->49|80->49|80->49|84->53|87->56
                  -- GENERATED --
              */
          