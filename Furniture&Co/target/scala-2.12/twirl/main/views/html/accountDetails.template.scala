
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

object accountDetails extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[models.users.Customer,Form[models.users.Login],models.users.User,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customer: models.users.Customer,loginForm: Form[models.users.Login],user : models.users.User, filter: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Account information",user, filter)/*4.42*/ {_display_(Seq[Any](format.raw/*4.44*/("""
  
    """),format.raw/*6.5*/("""<div class="container">
            <div class="panel-body">
                    <table class="table table-striped table-bordered table-list">
                      <thead>

            <tr>
                    <th>Password</th>           
                    <th>View Orders</th>         
                    <th>Name</th>
                    <th>Email</th>
                    
                </tr>
                
              </thead>
              <tbody>
                   
                      <tr>
                        <td align="center">
                                              <a href=""""),_display_(/*24.57*/routes/*24.63*/.HomeController.updateCustomer(user.getEmail)),format.raw/*24.108*/("""">Change Password</a>
                                              

                        </td>
                        <td>        <a href=""""),_display_(/*28.47*/routes/*28.53*/.ShoppingCtrl.viewOrder(user.getEmail)),format.raw/*28.91*/("""">Click here to view or cancel current orders</a>
                        </td>
                        <td>"""),_display_(/*30.30*/customer/*30.38*/.getFirstName),format.raw/*30.51*/("""</td>            
                        <td>"""),_display_(/*31.30*/customer/*31.38*/.getEmail),format.raw/*31.47*/("""</td>
                      </tr>        

                      <P>
                          Welcome!
                          """),_display_(/*36.28*/customer/*36.36*/.getFirstName),format.raw/*36.49*/("""
                          """),_display_(/*37.28*/customer/*37.36*/.getLastName),format.raw/*37.48*/("""
                      """),format.raw/*38.23*/("""</P>
             
        
       
        
            </div>
            
        
        </div>
    </div>
</div>
</div>

        
      
        
    """)))}))
      }
    }
  }

  def render(customer:models.users.Customer,loginForm:Form[models.users.Login],user:models.users.User,filter:String): play.twirl.api.HtmlFormat.Appendable = apply(customer,loginForm,user,filter)

  def f:((models.users.Customer,Form[models.users.Login],models.users.User,String) => play.twirl.api.HtmlFormat.Appendable) = (customer,loginForm,user,filter) => apply(customer,loginForm,user,filter)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 22 21:32:34 IST 2018
                  SOURCE: /media/sf_student/Finished/Finished Document/Furniture&Co/app/views/accountDetails.scala.html
                  HASH: 0177ef3512b7a4f80279f1bcd8ead1ba8249a216
                  MATRIX: 1022->1|1205->113|1249->129|1276->131|1324->171|1363->173|1397->181|2035->792|2050->798|2117->843|2290->989|2305->995|2364->1033|2500->1142|2517->1150|2551->1163|2625->1210|2642->1218|2672->1227|2830->1358|2847->1366|2881->1379|2936->1407|2953->1415|2986->1427|3037->1450
                  LINES: 28->1|31->2|34->3|35->4|35->4|35->4|37->6|55->24|55->24|55->24|59->28|59->28|59->28|61->30|61->30|61->30|62->31|62->31|62->31|67->36|67->36|67->36|68->37|68->37|68->37|69->38
                  -- GENERATED --
              */
          