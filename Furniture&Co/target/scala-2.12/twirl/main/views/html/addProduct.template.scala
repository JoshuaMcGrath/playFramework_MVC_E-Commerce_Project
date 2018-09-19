
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

object addProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[models.Product],models.users.User,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(productForm : Form[models.Product],user : models.users.User, filter: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*3.1*/("""



"""),_display_(/*7.2*/main("Adding new Product",user, filter)/*7.41*/{_display_(Seq[Any](format.raw/*7.42*/("""
"""),format.raw/*8.1*/("""<div class="col-sm-6"></div>
<h1>Fill out current form to add Product.</h1>

"""),_display_(/*11.2*/form(routes.HomeController.addProductSubmit(),     'class -> "form-horizontal", 
'role -> "form",
'enctype -> "multipart/form-data")/*13.35*/ {_display_(Seq[Any](format.raw/*13.37*/("""
    """),_display_(/*14.6*/CSRF/*14.10*/.formField),format.raw/*14.20*/("""
    """),_display_(/*15.6*/inputText(productForm ("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*15.82*/("""
    """),_display_(/*16.6*/inputText(productForm ("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*16.84*/("""
    """),_display_(/*17.6*/inputText(productForm ("description"), '_label -> "Description", 'class -> "form-control")),format.raw/*17.96*/("""
    """),_display_(/*18.6*/inputText(productForm ("stock"), '_label -> "Stock", 'class -> "form-control")),format.raw/*18.84*/("""
    
    """),_display_(/*20.6*/select(
    
        productForm ("category.id"),options(Category.options),'_label ->"Category",'_default -> "Choose Room",
    '_showConstraints -> false, 'class-> "form-control"
    
    
    )),format.raw/*26.6*/("""
    
    
    """),_display_(/*29.6*/inputText(productForm ("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*29.71*/("""

    """),format.raw/*31.5*/("""<label>Image Upload</label>
    <input class="btn-sm btn-default" type="file" name="upload">
    <br><br>

    <div class="actions">
    <input type="submit" value = "-ADD PRODUCT-" class="btn btn-primary">
    <a href =""""),_display_(/*37.16*/routes/*37.22*/.HomeController.Home()),format.raw/*37.44*/("""">
        <button type="button" class="btn btn-warning">Cancel</button>
    </a>
    
    
    
    
    </div>
    
    """)))}),format.raw/*46.6*/("""
    






























""")))}))
      }
    }
  }

  def render(productForm:Form[models.Product],user:models.users.User,filter:String): play.twirl.api.HtmlFormat.Appendable = apply(productForm,user,filter)

  def f:((Form[models.Product],models.users.User,String) => play.twirl.api.HtmlFormat.Appendable) = (productForm,user,filter) => apply(productForm,user,filter)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 22 21:32:34 IST 2018
                  SOURCE: /media/sf_student/Finished/Finished Document/Furniture&Co/app/views/addProduct.scala.html
                  HASH: c8ca96a8ec3d54a7fa2c29374bd37662bd2d6c50
                  MATRIX: 992->1|1142->80|1186->96|1216->101|1263->140|1301->141|1328->142|1432->220|1573->352|1613->354|1645->360|1658->364|1689->374|1721->380|1818->456|1850->462|1949->540|1981->546|2092->636|2124->642|2223->720|2260->731|2475->926|2517->942|2603->1007|2636->1013|2885->1235|2900->1241|2943->1263|3096->1386
                  LINES: 28->1|31->2|34->3|38->7|38->7|38->7|39->8|42->11|44->13|44->13|45->14|45->14|45->14|46->15|46->15|47->16|47->16|48->17|48->17|49->18|49->18|51->20|57->26|60->29|60->29|62->31|68->37|68->37|68->37|77->46
                  -- GENERATED --
              */
          