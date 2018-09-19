
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

object aboutus extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[models.users.Login],models.users.User,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[models.users.Login],user : models.users.User, filter: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("About Us",user, filter)/*4.31*/ {_display_(Seq[Any](format.raw/*4.33*/("""
  
    """),format.raw/*6.5*/("""<div class="container">
        <br></br>
        <br></br>
        
        <br></br>
        <br></br>
        <br></br>
        
            <div class="row">
                    <div class="col-md-4"><img src="http://urbanliferealty.com/wp-content/uploads/2017/06/53-Dutch-Settlers-Crt-East-MLS_Size-005-7-Bathroom-640x480-72dpi.jpg" class="img-responsive" alt="Some picture" width="410" height="307"></div>
                    
                <div class="col-md-8"><h1></h1><p>This has been a Year 2 Project by Jamie Nolan, Lukas Meilinus and Joshua McGrath
                  </p></div>
                
            </div>
        </div>
    </div>
    
        <br></br>
        <br></br>
        <div class="container">
                
        <div class="row">
                
                <div class="col-md-8"><h1></h1><p>
                  </p></div>
                  <div class="col-md-4"><img src="http://urbanliferealty.com/wp-content/uploads/2017/06/53-Dutch-Settlers-Crt-East-MLS_Size-005-7-Bathroom-640x480-72dpi.jpg" class="img-responsive" alt="Some picture" width="410" height="307"></div>
                  
            </div>
        </div>
        
        
        
             
        
       
        
            </div>
            
        
        </div>
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
                  DATE: Sun Apr 22 21:32:34 IST 2018
                  SOURCE: /media/sf_student/Finished/Finished Document/Furniture&Co/app/views/aboutus.scala.html
                  HASH: 92744bf2a88010d28d23fb605f203b1ec212eeb4
                  MATRIX: 993->1|1144->81|1188->97|1215->99|1252->128|1291->130|1325->138
                  LINES: 28->1|31->2|34->3|35->4|35->4|35->4|37->6
                  -- GENERATED --
              */
          