
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

object orderConfirmed extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[models.users.Customer,models.users.User,models.ShopOrder,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customer: models.users.Customer, user : models.users.User, order: models.ShopOrder, filter: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import play.api.Play.current


Seq[Any](format.raw/*2.1*/("""

"""),format.raw/*5.1*/("""

"""),format.raw/*7.1*/("""<!-- Pass page title and user on to main -->
"""),_display_(/*8.2*/main("Order Confirmation", user, filter)/*8.42*/ {_display_(Seq[Any](format.raw/*8.44*/("""


"""),format.raw/*11.1*/("""<div class="row">

	<div class="col-md-12">
		"""),_display_(/*14.4*/if(flash.containsKey("success"))/*14.36*/ {_display_(Seq[Any](format.raw/*14.38*/("""
			  """),format.raw/*15.6*/("""<div class="alert alert-success">
			      """),_display_(/*16.11*/flash/*16.16*/.get("success")),format.raw/*16.31*/("""
			  """),format.raw/*17.6*/("""</div>
		""")))}),format.raw/*18.4*/(""" 

		"""),format.raw/*20.3*/("""<table class="table table-bordered table-hover table-condensed">
			<thead>
			<!-- The header row-->
			<tr>
				<th>Name</th>
				<th>Description</th>
				<th>Item Price</th>
				<th>Quantity</th>
                <th>Total</th>
			</tr>
			</thead>
			<tbody>
                """),_display_(/*32.18*/if(order != null)/*32.35*/ {_display_(Seq[Any](format.raw/*32.37*/("""
                    """),format.raw/*33.21*/("""<!-- Start of For loop - For each p in products add a row -->
                    """),_display_(/*34.22*/for(i <- order.getItems) yield /*34.46*/ {_display_(Seq[Any](format.raw/*34.48*/("""
                    """),format.raw/*35.21*/("""<tr>
                        <td>"""),_display_(/*36.30*/i/*36.31*/.getProduct.getName),format.raw/*36.50*/("""</td>
                        <td>"""),_display_(/*37.30*/i/*37.31*/.getProduct.getDescription),format.raw/*37.57*/("""</td>
                        <td>&euro; """),_display_(/*38.37*/("%.2f".format(i.getPrice))),format.raw/*38.64*/("""</td>
                        <td>"""),_display_(/*39.30*/i/*39.31*/.getQuantity()),format.raw/*39.45*/("""</td>
                        <td>&euro; """),_display_(/*40.37*/("%.2f".format(i.getItemTotal))),format.raw/*40.68*/("""</td>
                    </tr>
                    """)))}),format.raw/*42.22*/("""<!-- End of For loop -->
              """)))}),format.raw/*43.16*/("""
			"""),format.raw/*44.4*/("""</tbody>
		</table>
        <div class="row">
            <div class="col-md-12">
                <p class="text-right"><strong>Order Total: &euro; """),_display_(/*48.68*/("%.2f".format(order.getOrderTotal))),format.raw/*48.104*/("""</strong></p>
            </div>  
        </div>
        </div>
</div>
""")))}))
      }
    }
  }

  def render(customer:models.users.Customer,user:models.users.User,order:models.ShopOrder,filter:String): play.twirl.api.HtmlFormat.Appendable = apply(customer,user,order,filter)

  def f:((models.users.Customer,models.users.User,models.ShopOrder,String) => play.twirl.api.HtmlFormat.Appendable) = (customer,user,order,filter) => apply(customer,user,order,filter)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 22 21:32:35 IST 2018
                  SOURCE: /media/sf_student/Finished/Finished Document/Furniture&Co/app/views/orderConfirmed.scala.html
                  HASH: 205d973770c20c42a3fdabace02c5bfe0cf85c5b
                  MATRIX: 1014->1|1187->105|1244->102|1272->134|1300->136|1371->182|1419->222|1458->224|1488->227|1561->274|1602->306|1642->308|1675->314|1746->358|1760->363|1796->378|1829->384|1869->394|1901->399|2207->678|2233->695|2273->697|2322->718|2432->801|2472->825|2512->827|2561->848|2622->882|2632->883|2672->902|2734->937|2744->938|2791->964|2860->1006|2908->1033|2970->1068|2980->1069|3015->1083|3084->1125|3136->1156|3220->1209|3291->1249|3322->1253|3498->1402|3556->1438
                  LINES: 28->1|31->4|34->2|36->5|38->7|39->8|39->8|39->8|42->11|45->14|45->14|45->14|46->15|47->16|47->16|47->16|48->17|49->18|51->20|63->32|63->32|63->32|64->33|65->34|65->34|65->34|66->35|67->36|67->36|67->36|68->37|68->37|68->37|69->38|69->38|70->39|70->39|70->39|71->40|71->40|73->42|74->43|75->44|79->48|79->48
                  -- GENERATED --
              */
          