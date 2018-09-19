
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

object adminControl extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[List[models.Product],List[models.users.Customer],models.users.User,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(productList: List[models.Product],customerList: List[models.users.Customer], user : models.users.User, filter: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""

"""),_display_(/*5.2*/main("Administrator Settings",user,filter)/*5.44*/{_display_(Seq[Any](format.raw/*5.45*/("""






   



    """),format.raw/*16.5*/("""<div class="container">
            <div class="row">
            
           
            
                <div class="col-md-10 col-md-offset-1">
        
                    <div class="panel panel-default panel-table">
                      <div class="panel-heading">
                        <div class="row">
                          <div class="col col-xs-6">
                            <h3 class="panel-title">Currently Registered Customers</h3>
                          </div>
                          <div class="col col-xs-6 text-right">
                              <a href=""""),_display_(/*30.41*/routes/*30.47*/.HomeController.addUser()),format.raw/*30.72*/("""">
                                  <button class="btn peach-gradient btn-rounded">Click here to register a new admin</button>
                                </a>
                                                        
                          </div>
                        </div>
                      </div>
                      <div class="panel-body">
                        <table class="table table-striped table-bordered table-list">
                          <thead>


                              <tr>
                                  <th>Delete User</th>
                                  
                                  <th>Name</th>
                                  <th>Email</th>
                              </tr>





                           """),_display_(/*53.29*/for(c<- customerList) yield /*53.50*/{_display_(Seq[Any](format.raw/*53.51*/("""
                            
                            
                          """),format.raw/*56.27*/("""</thead>
                          <tbody>
                               
                                  <tr>
                                    <td align="center">
                                      
                                      <a href=""""),_display_(/*62.49*/routes/*62.55*/.AdminController.deleteCustomer(c.getEmail, filter)),format.raw/*62.106*/("""" class="fa fa-trash">
                                        
                                    </td>
                                    <td>"""),_display_(/*65.42*/c/*65.43*/.getFirstName),format.raw/*65.56*/("""</td>            
                                    <td>"""),_display_(/*66.42*/c/*66.43*/.getEmail),format.raw/*66.52*/("""</td>
                                  </tr>
                                  
                                
                                </tbody>
                       
                      """)))}),format.raw/*72.24*/("""

                    """),format.raw/*74.21*/("""</table>
                      </div>
                      <a href=""""),_display_(/*76.33*/routes/*76.39*/.HomeController.addUser()),format.raw/*76.64*/("""" button="btn btn-primary"></a>                     
                    </div>
        
        </div></div></div></div>

       

  <div class="btn-toolbar">





    </div>



















   <div class="container">
      <div class="row">
      
     
      
          <div class="col-md-10 col-md-offset-1">
  
              <div class="panel panel-default panel-table">
                <div class="panel-heading">
                  <div class="row">
                    <div class="col col-xs-6">
                      <h3 class="panel-title">Current Products for Sale.</h3>
                    </div>
                    <div class="col col-xs-6 text-right">
                        <a href=""""),_display_(/*123.35*/routes/*123.41*/.HomeController.addProduct()),format.raw/*123.69*/("""">
                            <button class="btn peach-gradient btn-rounded">Click here to add a new product</button>
                          </a>
                                                  
                    </div>
                  </div>
                </div>
                <div class="panel-body">
                    <table class="table table-striped table-bordered table-list">
                      <thead>

      <tr>
      
      <th>Product ID</th>
      
      <th>Product Price</th>
      
      <th>Description</th>
      <th>Qty</th>
      
  
      
      
      
      </tr>
      
      </thead>
      
      <tbody>
      
      
      """),_display_(/*154.8*/for(g<-productList) yield /*154.27*/{_display_(Seq[Any](format.raw/*154.28*/("""
      """),format.raw/*155.7*/("""<tr>
      
      <td>"""),_display_(/*157.12*/g/*157.13*/.getId),format.raw/*157.19*/("""</td>
      
      <td>€"""),_display_(/*159.13*/("%.2f".format(g.getPrice))),format.raw/*159.40*/("""</td>
      
      <td>"""),_display_(/*161.12*/g/*161.13*/.getName),format.raw/*161.21*/("""</td>
      <td>"""),_display_(/*162.12*/g/*162.13*/.getStock),format.raw/*162.22*/("""</td>
      
      <td>
       <a href=""""),_display_(/*165.18*/routes/*165.24*/.AdminController.deleteProduct(g.getId)),format.raw/*165.63*/("""" class="button-xs btn-primary">
           <span class="glyphicon glyphicon-remove-circle"></span>
       </a>
      </td>
      <td>
        <a href=""""),_display_(/*170.19*/routes/*170.25*/.HomeController.updateProduct(g.getId)),format.raw/*170.63*/("""" class="button-xs btn-danger">
          <span class="glyphicon glyphicon-pencil"></span>
        </a>



      </td>
          
  
      </tr>
  
  
  """)))}),format.raw/*182.4*/("""
      """),format.raw/*183.7*/("""</tbody>
      
      </table> 
      





    </div>
  </div>
</div>
</div>
</div>











































""")))}))
      }
    }
  }

  def render(productList:List[models.Product],customerList:List[models.users.Customer],user:models.users.User,filter:String): play.twirl.api.HtmlFormat.Appendable = apply(productList,customerList,user,filter)

  def f:((List[models.Product],List[models.users.Customer],models.users.User,String) => play.twirl.api.HtmlFormat.Appendable) = (productList,customerList,user,filter) => apply(productList,customerList,user,filter)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 22 21:32:34 IST 2018
                  SOURCE: /media/sf_student/Finished/Finished Document/Furniture&Co/app/views/adminControl.scala.html
                  HASH: 4b6a8670e1764fbd857510d10866a81d6863a9cf
                  MATRIX: 1022->2|1235->122|1263->125|1313->167|1351->168|1396->186|2016->779|2031->785|2077->810|2879->1585|2916->1606|2955->1607|3068->1692|3352->1949|3367->1955|3440->2006|3614->2153|3624->2154|3658->2167|3744->2226|3754->2227|3784->2236|4017->2438|4067->2460|4164->2530|4179->2536|4225->2561|4956->3264|4972->3270|5022->3298|5719->3968|5755->3987|5795->3988|5830->3995|5881->4018|5892->4019|5920->4025|5973->4050|6022->4077|6074->4101|6085->4102|6115->4110|6160->4127|6171->4128|6202->4137|6271->4178|6287->4184|6348->4223|6529->4376|6545->4382|6605->4420|6790->4574|6825->4581
                  LINES: 28->2|33->3|35->5|35->5|35->5|46->16|60->30|60->30|60->30|83->53|83->53|83->53|86->56|92->62|92->62|92->62|95->65|95->65|95->65|96->66|96->66|96->66|102->72|104->74|106->76|106->76|106->76|153->123|153->123|153->123|184->154|184->154|184->154|185->155|187->157|187->157|187->157|189->159|189->159|191->161|191->161|191->161|192->162|192->162|192->162|195->165|195->165|195->165|200->170|200->170|200->170|212->182|213->183
                  -- GENERATED --
              */
          