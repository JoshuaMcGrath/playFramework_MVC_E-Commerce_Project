
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

object updateProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Long,Form[models.Product],models.users.User,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, updateProductForm: Form[models.Product], user: models.users.User, filter: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.94*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Update product", user,filter)/*4.37*/{_display_(Seq[Any](format.raw/*4.38*/("""


    """),_display_(/*7.6*/form(action=routes.HomeController.updateProductSubmit(id),'class -> "form-horizontal", 
    'role -> "form",
    'enctype -> "multipart/form-data")/*9.39*/ {_display_(Seq[Any](format.raw/*9.41*/("""
        """),_display_(/*10.10*/CSRF/*10.14*/.formField),format.raw/*10.24*/("""
        """),_display_(/*11.10*/inputText(updateProductForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*11.91*/("""
        """),_display_(/*12.10*/inputText(updateProductForm ("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*12.94*/("""
        """),_display_(/*13.10*/select(
            
                updateProductForm ("category.id"),options(Category.options),'_label ->"Category",'_default -> "Choose Room",
            '_showConstraints -> false, 'class-> "form-control"
            
            
            )),format.raw/*19.14*/("""    
        """),_display_(/*20.10*/inputText(updateProductForm("stock"), '_label -> "Stock", 'class -> "form-control")),format.raw/*20.93*/("""
        """),_display_(/*21.10*/inputText(updateProductForm("description"), '_label -> "Description", 'class -> "form-control")),format.raw/*21.105*/("""
        
        """),_display_(/*23.10*/inputText(updateProductForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*23.80*/("""
        """),format.raw/*24.9*/("""<div class="actions">
            <input type="submit" value="Update Product" class="btn btn-primary">
            <a href=""""),_display_(/*26.23*/routes/*26.29*/.AdminController.adminControl()),format.raw/*26.60*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
     """)))}),format.raw/*30.7*/("""
    




    """)))}),format.raw/*36.6*/("""
"""))
      }
    }
  }

  def render(id:Long,updateProductForm:Form[models.Product],user:models.users.User,filter:String): play.twirl.api.HtmlFormat.Appendable = apply(id,updateProductForm,user,filter)

  def f:((Long,Form[models.Product],models.users.User,String) => play.twirl.api.HtmlFormat.Appendable) = (id,updateProductForm,user,filter) => apply(id,updateProductForm,user,filter)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 22 21:32:35 IST 2018
                  SOURCE: /media/sf_student/Finished/Finished Document/Furniture&Co/app/views/updateProduct.scala.html
                  HASH: e270b31e2c71cf4f5e22d9a7a9867a6e0568e6a7
                  MATRIX: 1000->1|1165->96|1210->93|1238->113|1266->116|1309->151|1347->152|1383->163|1540->312|1579->314|1617->325|1630->329|1661->339|1699->350|1801->431|1839->442|1944->526|1982->537|2258->792|2300->807|2404->890|2442->901|2559->996|2607->1017|2698->1087|2735->1097|2889->1224|2904->1230|2956->1261|3109->1384|3160->1405
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|39->7|41->9|41->9|42->10|42->10|42->10|43->11|43->11|44->12|44->12|45->13|51->19|52->20|52->20|53->21|53->21|55->23|55->23|56->24|58->26|58->26|58->26|62->30|68->36
                  -- GENERATED --
              */
          