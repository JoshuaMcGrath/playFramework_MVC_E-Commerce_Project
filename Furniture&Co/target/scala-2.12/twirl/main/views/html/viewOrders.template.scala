
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

object viewOrders extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[models.users.Customer,models.users.User,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customer: models.users.Customer,user : models.users.User,filter:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import play.api.Play.current


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Search",user, filter)/*4.29*/{_display_(Seq[Any](format.raw/*4.30*/("""
    """),format.raw/*5.5*/("""<div class="col-md-12">
		"""),_display_(/*6.4*/if(flash.containsKey("success"))/*6.36*/ {_display_(Seq[Any](format.raw/*6.38*/("""
			  """),format.raw/*7.6*/("""<div class="alert alert-success">
			      """),_display_(/*8.11*/flash/*8.16*/.get("success")),format.raw/*8.31*/("""
			  """),format.raw/*9.6*/("""</div>
		""")))}),format.raw/*10.4*/(""" 

		
               
                    """),format.raw/*14.21*/("""<!-- Start of For loop - For each p in products add a row -->
                    """),_display_(/*15.22*/for(o <- customer.getOrders()) yield /*15.52*/ {_display_(Seq[Any](format.raw/*15.54*/("""

                        """),format.raw/*17.25*/("""<p>Order Number: """),_display_(/*17.43*/o/*17.44*/.getId()),format.raw/*17.52*/("""</p>
                        <p>Order Date: """),_display_(/*18.41*/o/*18.42*/.getOrderDateString()),format.raw/*18.63*/("""</p>
                        <table class="table table-bordered table-hover table-condensed">
                        
                            <thead>
                            <!-- The header row-->
                            <tr>
                                
                                <th>Name</th>
                                <th>Quantity</th>
                                <th>Price</th>
                                <th>Total</th>
                            </tr>
                            </thead>
                            <tbody>
                        """),_display_(/*32.26*/for(i <- o.getItems()) yield /*32.48*/ {_display_(Seq[Any](format.raw/*32.50*/("""

                        """),format.raw/*34.25*/("""<tr>
                        
                        <td>"""),_display_(/*36.30*/i/*36.31*/.getProduct.getName()),format.raw/*36.52*/("""</td>
                        <td>"""),_display_(/*37.30*/i/*37.31*/.getQuantity()),format.raw/*37.45*/("""</td>
                        <td>&euro; """),_display_(/*38.37*/("%.2f".format(i.getPrice()))),format.raw/*38.66*/("""</td>
                        <td>&euro; """),_display_(/*39.37*/("%.2f".format(i.getItemTotal))),format.raw/*39.68*/("""</td>
                        
                    </tr>
                    """)))}),format.raw/*42.22*/("""<!-- End of For loop -->
                    
			</tbody>
        </table>
        <div class="row">
            <div class="col-md-12">
                <p class="text-right"><strong>Order Total: &euro; """),_display_(/*48.68*/("%.2f".format(o.getOrderTotal))),format.raw/*48.100*/("""</strong></p>
            </div>  
        </div>
        <p>
            <a href=""""),_display_(/*52.23*/routes/*52.29*/.ShoppingCtrl.cancelOrder(o.getId())),format.raw/*52.65*/("""">
              <button class="btn btn-primary">Cancel Order</button>
            </a>
          </p>
         """)))}),format.raw/*56.11*/("""<!-- End of For loop -->
       
        </div>



""")))}),format.raw/*62.2*/("""
















"""))
      }
    }
  }

  def render(customer:models.users.Customer,user:models.users.User,filter:String): play.twirl.api.HtmlFormat.Appendable = apply(customer,user,filter)

  def f:((models.users.Customer,models.users.User,String) => play.twirl.api.HtmlFormat.Appendable) = (customer,user,filter) => apply(customer,user,filter)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 22 21:32:35 IST 2018
                  SOURCE: /media/sf_student/Finished/Finished Document/Furniture&Co/app/views/viewOrders.scala.html
                  HASH: 5a072be622ff4702e8c186494b924affd5ab7d8b
                  MATRIX: 993->1|1138->75|1195->104|1222->106|1257->133|1295->134|1326->139|1378->166|1418->198|1457->200|1489->206|1559->250|1572->255|1607->270|1639->276|1679->286|1749->328|1859->411|1905->441|1945->443|1999->469|2044->487|2054->488|2083->496|2155->541|2165->542|2207->563|2828->1157|2866->1179|2906->1181|2960->1207|3046->1266|3056->1267|3098->1288|3160->1323|3170->1324|3205->1338|3274->1380|3324->1409|3393->1451|3445->1482|3554->1560|3785->1764|3839->1796|3950->1880|3965->1886|4022->1922|4166->2035|4248->2087
                  LINES: 28->1|31->2|34->3|35->4|35->4|35->4|36->5|37->6|37->6|37->6|38->7|39->8|39->8|39->8|40->9|41->10|45->14|46->15|46->15|46->15|48->17|48->17|48->17|48->17|49->18|49->18|49->18|63->32|63->32|63->32|65->34|67->36|67->36|67->36|68->37|68->37|68->37|69->38|69->38|70->39|70->39|73->42|79->48|79->48|83->52|83->52|83->52|87->56|93->62
                  -- GENERATED --
              */
          