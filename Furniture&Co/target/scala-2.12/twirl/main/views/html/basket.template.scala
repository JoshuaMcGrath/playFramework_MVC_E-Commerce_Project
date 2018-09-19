
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

object basket extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[models.users.Customer,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customer: models.users.Customer, filter: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import play.api.Play.current


Seq[Any](format.raw/*1.51*/(""" 

"""),format.raw/*4.1*/("""
"""),format.raw/*5.1*/("""<!-- Pass page title and user on to main -->
"""),_display_(/*6.2*/main("Shopping Basket", customer, filter)/*6.43*/ {_display_(Seq[Any](format.raw/*6.45*/("""

"""),format.raw/*8.1*/("""<br>
<br>
<br>


<div class="row">

    <div class="col-md-12">
        """),_display_(/*16.10*/if(flash.containsKey("success"))/*16.42*/ {_display_(Seq[Any](format.raw/*16.44*/("""
        """),format.raw/*17.9*/("""<div class="alert alert-success">
            """),_display_(/*18.14*/flash/*18.19*/.get("success")),format.raw/*18.34*/("""
        """),format.raw/*19.9*/("""</div>
        """)))}),format.raw/*20.10*/("""
        """),format.raw/*21.9*/("""<br>
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
                    <th>dec.</th>
                    <th>inc.</th>
                </tr>
            </thead>
            <tbody>
                """),_display_(/*41.18*/if(customer.getBasket() != null)/*41.50*/ {_display_(Seq[Any](format.raw/*41.52*/("""
                """),format.raw/*42.17*/("""<!-- Start of For loop - For each p in products add a row -->
                """),_display_(/*43.18*/for(i
                <- customer.getBasket().getBasketItems()) yield /*44.58*/ {_display_(Seq[Any](format.raw/*44.60*/(""" """),format.raw/*44.61*/("""<tr>
                    <td>"""),_display_(/*45.26*/i/*45.27*/.getProduct.getName),format.raw/*45.46*/("""</td>
                    <td>"""),_display_(/*46.26*/i/*46.27*/.getProduct.getDescription()),format.raw/*46.55*/("""</td>
                    <td>&euro; """),_display_(/*47.33*/("%.2f".format(i.getPrice))),format.raw/*47.60*/("""</td>
                    <td>&euro; """),_display_(/*48.33*/("%.2f".format(i.getItemTotal))),format.raw/*48.64*/("""</td>
                    <td>"""),_display_(/*49.26*/i/*49.27*/.getQuantity()),format.raw/*49.41*/("""</td>
                    <td>
                        <a href=""""),_display_(/*51.35*/routes/*51.41*/.ShoppingCtrl.removeOne(i.getId)),format.raw/*51.73*/("""">
                            <span class="glyphicon glyphicon-minus-sign"></span>
                        </a>
                    </td>
                    <td>
                        <a href=""""),_display_(/*56.35*/routes/*56.41*/.ShoppingCtrl.addOne(i.getId,i.getProduct.getId())),format.raw/*56.91*/("""">
                            <span class="glyphicon glyphicon-plus-sign"></span>
                        </a>
                    </td>


                    </tr>
                    """)))}),format.raw/*63.22*/(""" 
                
                
                    """),format.raw/*66.21*/("""<p class="text-right">
                        <a href=""""),_display_(/*67.35*/routes/*67.41*/.ShoppingCtrl.checkOut()),format.raw/*67.65*/("""" class="btn btn-success btn-sm">
                            <span class="glyphicon glyphicon-euro"></span> Proceed to Checkout</a>
                    </p>
                
                
                
                
                
                """)))}),format.raw/*75.18*/("""
            """),format.raw/*76.13*/("""</tbody>
        </table>
        <div class="row">
            <div class="col-md-12">
                <p class="text-right">
                    <strong>Basket Total: &euro; """),_display_(/*81.51*/("%.2f".format(customer.getBasket.getBasketTotal))),format.raw/*81.101*/("""</strong>
                </p>
            </div>
        </div>
        <div class="row">
            <div class="col-md-6">
                <p class="text-right">
                    <a href=""""),_display_(/*88.31*/routes/*88.37*/.ShoppingCtrl.emptyBasket()),format.raw/*88.64*/("""" class="btn btn-danger btn-sm" onclick="return confirmDel();">
                        <span class="glyphicon glyphicon-trash"></span> Empty Basket</a>
                </p>
            </div>
            <div class="col-md-6">

            </div>
        </div>
    </div>
</div>

<script>
    // JavaScript function returns true if user clicks yes, otherwise, false
    function confirmDel() """),format.raw/*101.27*/("""{"""),format.raw/*101.28*/("""
        """),format.raw/*102.9*/("""return confirm('Are you sure?');
    """),format.raw/*103.5*/("""}"""),format.raw/*103.6*/("""
"""),format.raw/*104.1*/("""</script>
""")))}))
      }
    }
  }

  def render(customer:models.users.Customer,filter:String): play.twirl.api.HtmlFormat.Appendable = apply(customer,filter)

  def f:((models.users.Customer,String) => play.twirl.api.HtmlFormat.Appendable) = (customer,filter) => apply(customer,filter)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 22 21:32:34 IST 2018
                  SOURCE: /media/sf_student/Finished/Finished Document/Furniture&Co/app/views/basket.scala.html
                  HASH: b4f38a69757348166b9a8732904926727bce1ced
                  MATRIX: 971->1|1093->54|1151->50|1180->83|1207->84|1278->130|1327->171|1366->173|1394->175|1494->248|1535->280|1575->282|1611->291|1685->338|1699->343|1735->358|1771->367|1818->383|1854->392|2416->927|2457->959|2497->961|2542->978|2648->1057|2727->1120|2767->1122|2796->1123|2853->1153|2863->1154|2903->1173|2961->1204|2971->1205|3020->1233|3085->1271|3133->1298|3198->1336|3250->1367|3308->1398|3318->1399|3353->1413|3445->1478|3460->1484|3513->1516|3738->1714|3753->1720|3824->1770|4042->1957|4126->2013|4210->2070|4225->2076|4270->2100|4561->2360|4602->2373|4806->2550|4878->2600|5100->2795|5115->2801|5163->2828|5586->3222|5616->3223|5653->3232|5718->3269|5747->3270|5776->3271
                  LINES: 28->1|31->3|34->1|36->4|37->5|38->6|38->6|38->6|40->8|48->16|48->16|48->16|49->17|50->18|50->18|50->18|51->19|52->20|53->21|73->41|73->41|73->41|74->42|75->43|76->44|76->44|76->44|77->45|77->45|77->45|78->46|78->46|78->46|79->47|79->47|80->48|80->48|81->49|81->49|81->49|83->51|83->51|83->51|88->56|88->56|88->56|95->63|98->66|99->67|99->67|99->67|107->75|108->76|113->81|113->81|120->88|120->88|120->88|133->101|133->101|134->102|135->103|135->103|136->104
                  -- GENERATED --
              */
          