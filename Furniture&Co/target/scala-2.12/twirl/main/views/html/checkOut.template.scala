
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

object checkOut extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[models.Payment],models.users.Customer,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(newPaymentForm: Form[models.Payment],customer: models.users.Customer,filter: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._
/*4.2*/import play.api.Play.current


Seq[Any](format.raw/*1.87*/(""" 

"""),format.raw/*5.1*/("""
"""),format.raw/*6.1*/("""<!-- Pass page title and user on to main -->
"""),_display_(/*7.2*/main("Check Out", customer, filter)/*7.37*/ {_display_(Seq[Any](format.raw/*7.39*/("""

"""),format.raw/*9.1*/("""<br>
<br>
<br>


<div class="row">

    <div class="col-md-12">
        """),_display_(/*17.10*/if(flash.containsKey("success"))/*17.42*/ {_display_(Seq[Any](format.raw/*17.44*/("""
        """),format.raw/*18.9*/("""<div class="alert alert-success">
            """),_display_(/*19.14*/flash/*19.19*/.get("success")),format.raw/*19.34*/("""
        """),format.raw/*20.9*/("""</div>
        """)))}),format.raw/*21.10*/("""
        """),format.raw/*22.9*/("""<br>
        <br>
        <br>
        <br>


        <table class="table table-bordered table-hover table-condensed">
            <thead>
                <!-- The header row-->
                <tr>
                    <th>Name</th>
                    <th>Description</th>
                    <th>Item Price</th>
                    <th>Total</th>
                    <th>Quantity</th>

                </tr>
            </thead>
            <tbody>
                """),_display_(/*41.18*/if(customer.getBasket() != null)/*41.50*/ {_display_(Seq[Any](format.raw/*41.52*/("""
                
                
                """),_display_(/*44.18*/for(i <- customer.getBasket().getBasketItems()) yield /*44.65*/ {_display_(Seq[Any](format.raw/*44.67*/(""" 
                    
                    
                    """),format.raw/*47.21*/("""<tr>


                    <td>"""),_display_(/*50.26*/i/*50.27*/.getProduct.getName),format.raw/*50.46*/("""</td>
                    <td>"""),_display_(/*51.26*/i/*51.27*/.getProduct.getDescription()),format.raw/*51.55*/("""</td>
                    <td>&euro; """),_display_(/*52.33*/("%.2f".format(i.getPrice))),format.raw/*52.60*/("""</td>
                    <td>&euro; """),_display_(/*53.33*/("%.2f".format(i.getItemTotal))),format.raw/*53.64*/("""</td>
                    <td>"""),_display_(/*54.26*/i/*54.27*/.getQuantity()),format.raw/*54.41*/("""</td>


                    </tr>
                """)))}),format.raw/*58.18*/("""
            """),format.raw/*59.13*/("""</tbody>






        </table>

    
   
                """)))}),format.raw/*70.18*/("""



"""),_display_(/*74.2*/form(routes.ShoppingCtrl.checkOutSubmit(), 'class -> "form-horizontal", 'role -> "form")/*74.90*/{_display_(Seq[Any](format.raw/*74.91*/("""
    """),_display_(/*75.6*/CSRF/*75.10*/.formField),format.raw/*75.20*/("""
    """),_display_(/*76.6*/inputText(newPaymentForm("shipmentAddress"), '_label -> "Please fill in Shipping Address", 'class -> "form-control")),format.raw/*76.122*/("""
    """),_display_(/*77.6*/inputText(newPaymentForm("ccNumber"), '_label -> "Credit Card Number", 'class -> "form-control")),format.raw/*77.102*/("""
    """),_display_(/*78.6*/inputText(newPaymentForm("ccv"), '_label -> "Please enter ccv number of your card.", 'class -> "form-control")),format.raw/*78.116*/("""                 
    """),_display_(/*79.6*/inputText(newPaymentForm ("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*79.74*/("""

    """),format.raw/*81.5*/("""<div class="actions">
    <p class="text-right">
            <input type="submit" value = "Confirm Purchase" class="btn btn-primary">
        <a href=""""),_display_(/*84.19*/routes/*84.25*/.ShoppingCtrl.placeOrder()),format.raw/*84.51*/("""" class="btn btn-success btn-sm">
            <span class="glyphicon glyphicon-euro"></span> Place Order</a>
    </p>
    </div>
""")))}),format.raw/*88.2*/("""
    

    
    






    
    
    """),format.raw/*101.5*/("""</div>
    

</div>
</div>

""")))}),format.raw/*107.2*/("""






















  








"""))
      }
    }
  }

  def render(newPaymentForm:Form[models.Payment],customer:models.users.Customer,filter:String): play.twirl.api.HtmlFormat.Appendable = apply(newPaymentForm,customer,filter)

  def f:((Form[models.Payment],models.users.Customer,String) => play.twirl.api.HtmlFormat.Appendable) = (newPaymentForm,customer,filter) => apply(newPaymentForm,customer,filter)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 22 21:32:34 IST 2018
                  SOURCE: /media/sf_student/Finished/Finished Document/Furniture&Co/app/views/checkOut.scala.html
                  HASH: 84932fac9d5000737019e39d98f38b035ee33d97
                  MATRIX: 994->1|1152->90|1175->107|1233->86|1262->136|1289->137|1360->183|1403->218|1442->220|1470->222|1570->295|1611->327|1651->329|1687->338|1761->385|1775->390|1811->405|1847->414|1894->430|1930->439|2425->907|2466->939|2506->941|2585->993|2648->1040|2688->1042|2780->1106|2839->1138|2849->1139|2889->1158|2947->1189|2957->1190|3006->1218|3071->1256|3119->1283|3184->1321|3236->1352|3294->1383|3304->1384|3339->1398|3421->1449|3462->1462|3552->1521|3583->1526|3680->1614|3719->1615|3751->1621|3764->1625|3795->1635|3827->1641|3965->1757|3997->1763|4115->1859|4147->1865|4279->1975|4328->1998|4417->2066|4450->2072|4629->2224|4644->2230|4691->2256|4851->2386|4916->2423|4976->2452
                  LINES: 28->1|31->3|32->4|35->1|37->5|38->6|39->7|39->7|39->7|41->9|49->17|49->17|49->17|50->18|51->19|51->19|51->19|52->20|53->21|54->22|73->41|73->41|73->41|76->44|76->44|76->44|79->47|82->50|82->50|82->50|83->51|83->51|83->51|84->52|84->52|85->53|85->53|86->54|86->54|86->54|90->58|91->59|102->70|106->74|106->74|106->74|107->75|107->75|107->75|108->76|108->76|109->77|109->77|110->78|110->78|111->79|111->79|113->81|116->84|116->84|116->84|120->88|133->101|139->107
                  -- GENERATED --
              */
          