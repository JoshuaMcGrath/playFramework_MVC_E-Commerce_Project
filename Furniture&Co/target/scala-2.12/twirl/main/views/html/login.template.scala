
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[models.users.Login],models.users.User,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[models.users.Login],user : models.users.User, filter: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Login Required",user, filter)/*4.37*/ {_display_(Seq[Any](format.raw/*4.39*/("""
	

	"""),format.raw/*7.2*/("""<!-- Display login errors if they exist -->
	"""),_display_(/*8.3*/if(loginForm.hasGlobalErrors)/*8.32*/ {_display_(Seq[Any](format.raw/*8.34*/("""
		  """),format.raw/*9.5*/("""<p class="alert alert-warning">
		      """),_display_(/*10.10*/loginForm/*10.19*/.globalError.message),format.raw/*10.39*/("""
		  """),format.raw/*11.5*/("""</p>
	""")))}),format.raw/*12.3*/("""
    """),_display_(/*13.6*/if(flash.containsKey("error"))/*13.36*/ {_display_(Seq[Any](format.raw/*13.38*/("""
		  """),format.raw/*14.5*/("""<div class="alert alert-warning">
		      """),_display_(/*15.10*/flash/*15.15*/.get("loginRequired")),format.raw/*15.36*/("""
		  """),format.raw/*16.5*/("""</div>
	""")))}),format.raw/*17.3*/("""
	"""),format.raw/*18.2*/("""<!-- The login form -->
	"""),_display_(/*19.3*/helper/*19.9*/.form(CSRF(controllers.routes.LoginController.loginSubmit()))/*19.70*/ {_display_(Seq[Any](format.raw/*19.72*/("""

		"""),format.raw/*21.3*/("""<div class="container">
			<div class="row centered-form">
			<div class="col-xs-12 col-sm-8 col-md-4 col-sm-offset-2 col-md-offset-4">
			<div class="panel panel-default">
							<div class="panel-heading">
									<h3 class="panel-title">Please Login</h3>
									 </div>
									 <div class="panel-body">
								   
										<div class="row">
											
										</div>
			
										<div class="form-group">
											<input type="email" name="email" class="form-control input-xs" placeholder="Email" value=""""),_display_(/*35.103*/loginForm("email")/*35.121*/.value),format.raw/*35.127*/("""">
										</div>
			
										<div class="row">
											<div class="col-xs-12 col-sm-12 col-md-12">
												<div class="form-group">
													<input type="password" name="password" class="form-control input-xs" placeholder="Password">
												</div>
											</div>

										</div>
										
									</div>

		<!-- Add a submit button -->
		<div class="form-group">
		    <input type="submit" value="Sign In" class="btn btn-info btn-block">
		</div>
		""")))}),format.raw/*53.4*/("""


	
"""),format.raw/*57.1*/("""</div>
</div>
</div>
</div>







""")))}))
      }
    }
  }

  def render(loginForm:Form[models.users.Login],user:models.users.User,filter:String): play.twirl.api.HtmlFormat.Appendable = apply(loginForm,user,filter)

  def f:((Form[models.users.Login],models.users.User,String) => play.twirl.api.HtmlFormat.Appendable) = (loginForm,user,filter) => apply(loginForm,user,filter)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 22 21:32:35 IST 2018
                  SOURCE: /media/sf_student/Finished/Finished Document/Furniture&Co/app/views/login.scala.html
                  HASH: 0b9f558f29195f5a9fb02604226682658723c9c3
                  MATRIX: 991->1|1142->81|1186->97|1213->99|1256->134|1295->136|1326->141|1397->187|1434->216|1473->218|1504->223|1572->264|1590->273|1631->293|1663->298|1700->305|1732->311|1771->341|1811->343|1843->348|1913->391|1927->396|1969->417|2001->422|2040->431|2069->433|2121->459|2135->465|2205->526|2245->528|2276->532|2825->1053|2853->1071|2881->1077|3389->1555|3421->1560
                  LINES: 28->1|31->2|34->3|35->4|35->4|35->4|38->7|39->8|39->8|39->8|40->9|41->10|41->10|41->10|42->11|43->12|44->13|44->13|44->13|45->14|46->15|46->15|46->15|47->16|48->17|49->18|50->19|50->19|50->19|50->19|52->21|66->35|66->35|66->35|84->53|88->57
                  -- GENERATED --
              */
          