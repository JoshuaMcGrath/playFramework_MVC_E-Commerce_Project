
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

object addComment extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[Long,models.Product,Form[models.Comment],models.users.User,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long,p: models.Product,commentForm: Form[models.Comment],user : models.users.User,filter: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*3.1*/("""



"""),_display_(/*7.2*/main("Submitting a review",user, filter)/*7.42*/{_display_(Seq[Any](format.raw/*7.43*/("""

"""),_display_(/*9.2*/form(routes.ShoppingCtrl.addCommentSubmit(p.getId),     'class -> "form-horizontal", 
    'role -> "form")/*10.21*/ {_display_(Seq[Any](format.raw/*10.23*/("""
        """),_display_(/*11.10*/CSRF/*11.14*/.formField),format.raw/*11.24*/("""
        """),_display_(/*12.10*/inputText(commentForm ("commentId"), '_label -> "", 'hidden -> "hidden")),format.raw/*12.82*/("""
        
        """),_display_(/*14.10*/inputText(commentForm ("commenting"), '_label -> "Write your comment down below", 'class -> "form-control")),format.raw/*14.117*/("""
        """),_display_(/*15.10*/inputText(commentForm ("rating"), '_label -> "Rating (1 -> 5)", 'class -> "form-control")),format.raw/*15.99*/("""
        
        """),_display_(/*17.10*/inputText(commentForm ("commentId"), '_label -> "", 'hidden -> "hidden")),format.raw/*17.82*/("""

 
        
        """),format.raw/*21.9*/("""<div class="actions">
            <input type="submit" value = "Comment" class="btn btn-primary">
            <a href =""""),_display_(/*23.24*/routes/*23.30*/.HomeController.productListing(p.getId,"")),format.raw/*23.72*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
            </div>

        """)))}),format.raw/*28.10*/("""
    """)))}),format.raw/*29.6*/("""








"""))
      }
    }
  }

  def render(id:Long,p:models.Product,commentForm:Form[models.Comment],user:models.users.User,filter:String): play.twirl.api.HtmlFormat.Appendable = apply(id,p,commentForm,user,filter)

  def f:((Long,models.Product,Form[models.Comment],models.users.User,String) => play.twirl.api.HtmlFormat.Appendable) = (id,p,commentForm,user,filter) => apply(id,p,commentForm,user,filter)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 22 21:32:34 IST 2018
                  SOURCE: /media/sf_student/Finished/Finished Document/Furniture&Co/app/views/addComment.scala.html
                  HASH: 0fa32c052ec4d4409e4be5fcc8821e0027a9d5d0
                  MATRIX: 1012->1|1187->105|1231->121|1261->126|1309->166|1347->167|1375->170|1490->276|1530->278|1567->288|1580->292|1611->302|1648->312|1741->384|1787->403|1916->510|1953->520|2063->609|2109->628|2202->700|2250->721|2398->842|2413->848|2476->890|2634->1017|2670->1023
                  LINES: 28->1|31->2|34->3|38->7|38->7|38->7|40->9|41->10|41->10|42->11|42->11|42->11|43->12|43->12|45->14|45->14|46->15|46->15|48->17|48->17|52->21|54->23|54->23|54->23|59->28|60->29
                  -- GENERATED --
              */
          