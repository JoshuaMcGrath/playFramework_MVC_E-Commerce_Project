
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
/*5.2*/import helper._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[String,models.users.User,String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(title: String,user : models.users.User, filter: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.1*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">

   <head>
           <link rel="stylesheet" href=""""),_display_(/*13.42*/routes/*13.48*/.Assets.versioned("bootsrap/css/bootstrap.min.css")),format.raw/*13.99*/("""" >
       <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
       <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
       <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
       <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
       <title>"""),_display_(/*18.16*/title),format.raw/*18.21*/("""</title>
       <link rel="stylesheet" media="screen" href=""""),_display_(/*19.53*/routes/*19.59*/.Assets.versioned("stylesheets/main.css")),format.raw/*19.100*/("""">
       <link rel="shortcut icon" type="image/png" href=""""),_display_(/*20.58*/routes/*20.64*/.Assets.versioned("images/favicon.png")),format.raw/*20.103*/("""">
       <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
       
   </head>
   <div class="container">
           <nav class="navbar navbar-icon-top navbar-default navbar-fixed-top">
               <div class="container-fluid">
                   <!-- Brand and toggle get grouped for better mobile display -->
                   <div class="navbar-header">
                       <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                           <span class="sr-only">Toggle navigation</span>
                           <span class="icon-bar"></span>
                           <span class="icon-bar"></span>
                           <span class="icon-bar"></span>
                       </button>
                       <a class="navbar-brand" href=""""),_display_(/*35.55*/routes/*35.61*/.HomeController.Home("")),format.raw/*35.85*/("""">Furniture Co</a>
                   </div>
                   <!-- Collect the nav links, forms, and other content for toggling -->
                   <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                       <ul class="nav navbar-nav">
                           <li><a href=""""),_display_(/*40.42*/routes/*40.48*/.HomeController.Home("")),format.raw/*40.72*/("""">Home <span class="sr-only">(current)</span></a></li>
             

                           <li class="dropdown">
                               <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Products<span class="caret"></span></a>
                               <ul class="dropdown-menu">
                                   <li><a href=""""),_display_(/*46.50*/routes/*46.56*/.HomeController.Bathroom()),format.raw/*46.82*/("""">Bathroom</a></li>
                                   <li><a href=""""),_display_(/*47.50*/routes/*47.56*/.HomeController.Kitchen()),format.raw/*47.81*/("""">Kitchen</a></li>
                                   <li><a href=""""),_display_(/*48.50*/routes/*48.56*/.HomeController.Bedroom()),format.raw/*48.81*/("""">Bedroom</a></li>
                                   <li><a href=""""),_display_(/*49.50*/routes/*49.56*/.HomeController.LivingRoom()),format.raw/*49.84*/("""">Living room</a></li>
                               </ul>
                           </li>
                       </ul>
                       
                       <ul class="nav navbar-nav navbar-right">
                          
                        <ul class="nav navbar-nav navbar-right">
                                <li><a href=""""),_display_(/*57.47*/routes/*57.53*/.HomeController.search(0,filter)),format.raw/*57.85*/(""""> 
                                        <span class="glyphicon glyphicon-search"></span>                           </a></li>
                              <li>
                                    """),_display_(/*60.38*/if(user!=null)/*60.52*/{_display_(Seq[Any](format.raw/*60.53*/("""
                                        """),format.raw/*61.41*/("""<a href=""""),_display_(/*61.51*/routes/*61.57*/.ShoppingCtrl.showBasket()),format.raw/*61.83*/("""">
                                                <span class="glyphicon glyphicon-shopping-cart"></span>
                                              </a>
                                       """)))}/*64.41*/else/*64.45*/{_display_(Seq[Any](format.raw/*64.46*/("""
            
                                       """)))}),format.raw/*66.41*/("""

                              """),format.raw/*68.31*/("""</li>

                           <li class="dropdown">
                               
                               <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
                                   <i class="fa fa-user-circle-o"></i>
                                   """),_display_(/*74.37*/if(user!=null)/*74.51*/{_display_(Seq[Any](format.raw/*74.52*/("""
                                   
                                   """),_display_(/*76.37*/user/*76.41*/.getEmail),format.raw/*76.50*/(""" """),format.raw/*76.51*/("""<span class="caret"></span>
                                   """)))}/*77.37*/else/*77.41*/{_display_(Seq[Any](format.raw/*77.42*/("""
                                       """),format.raw/*78.40*/("""Account
                                   """)))}),format.raw/*79.37*/("""


                               """),format.raw/*82.32*/("""</a>


                               <ul class="dropdown-menu">
                                    <li><a href=""""),_display_(/*86.51*/routes/*86.57*/.HomeController.accountDetails()),format.raw/*86.89*/("""">Account</a></li>
                                    
                                   
                                    
                                   <li  """),_display_(/*90.42*/if(title=="Login")/*90.60*/{_display_(Seq[Any](format.raw/*90.61*/("""class="active"""")))}),format.raw/*90.76*/(""">
                                        
                                       """),_display_(/*92.41*/if(user!=null)/*92.55*/{_display_(Seq[Any](format.raw/*92.56*/("""
                                   """),format.raw/*93.36*/("""<a href=""""),_display_(/*93.46*/routes/*93.52*/.LoginController.logout()),format.raw/*93.77*/("""">Logout </a>
                                   <a href=""""),_display_(/*94.46*/routes/*94.52*/.AdminController.adminControl()),format.raw/*94.83*/("""">Administrator Settings</a>
                                   """)))}/*95.37*/else/*95.41*/{_display_(Seq[Any](format.raw/*95.42*/("""
                                       """),format.raw/*96.40*/("""<a href=""""),_display_(/*96.50*/routes/*96.56*/.LoginController.login()),format.raw/*96.80*/("""">Login</a>
                                   """)))}),format.raw/*97.37*/("""                           
                               

                                   """),_display_(/*100.37*/if(user != null)/*100.53*/{_display_(Seq[Any](format.raw/*100.54*/("""
                                  
                                   
                                   """)))}/*103.37*/else/*103.41*/{_display_(Seq[Any](format.raw/*103.42*/("""
                                    """),format.raw/*104.37*/("""<li role="separator" class="divider"></li>
                                    <li><a href=""""),_display_(/*105.51*/routes/*105.57*/.HomeController.addCustomer()),format.raw/*105.86*/("""">Register </a></li>
                                   """)))}),format.raw/*106.37*/("""

                                   
                                 

                               """),format.raw/*111.32*/("""</ul>
                           </li>
                       </ul>
                   </div><!-- /.navbar-collapse -->
               </div><!-- /.container-fluid -->
           </nav>
       </div>
   <body>
"""),_display_(/*119.2*/content),format.raw/*119.9*/("""



         

       """),format.raw/*125.8*/("""<script src=""""),_display_(/*125.22*/routes/*125.28*/.Assets.versioned("javascripts/main.js")),format.raw/*125.68*/("""" type="text/javascript"></script>
   </body>
   <div class="push"></div>
</div>

<div class="footer" id="footer">
    <div class="container">
    
            <hr/>        
            <div class="row">
                <div class="col-sm-6">Furniture Co Footer</div>
                <div class="col-sm-6 ">
                        <a href=""""),_display_(/*137.35*/routes/*137.41*/.HomeController.Home()),format.raw/*137.63*/("""" class="fa fa-facebook"></a>
                        <a src="www.twitter.com" class="fa fa-twitter"></a>
                    </div>
            </div> 
        </div>
    </div> 
    

</footer>


</html>
"""))
      }
    }
  }

  def render(title:String,user:models.users.User,filter:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user,filter)(content)

  def f:((String,models.users.User,String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user,filter) => (content) => apply(title,user,filter)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 22 21:32:35 IST 2018
                  SOURCE: /media/sf_student/Finished/Finished Document/Furniture&Co/app/views/main.scala.html
                  HASH: 85ece9b9d6182978c285e99631e5ab97eb1e8292
                  MATRIX: 651->5|1000->22|1165->94|1193->96|1305->181|1320->187|1392->238|1811->630|1837->635|1925->696|1940->702|2003->743|2090->803|2105->809|2166->848|3120->1775|3135->1781|3180->1805|3525->2123|3540->2129|3585->2153|4025->2566|4040->2572|4087->2598|4183->2667|4198->2673|4244->2698|4339->2766|4354->2772|4400->2797|4495->2865|4510->2871|4559->2899|4934->3247|4949->3253|5002->3285|5230->3486|5253->3500|5292->3501|5361->3542|5398->3552|5413->3558|5460->3584|5677->3782|5690->3786|5729->3787|5814->3841|5874->3873|6244->4216|6267->4230|6306->4231|6406->4304|6419->4308|6449->4317|6478->4318|6561->4382|6574->4386|6613->4387|6681->4427|6756->4471|6818->4505|6960->4620|6975->4626|7028->4658|7225->4828|7252->4846|7291->4847|7337->4862|7447->4945|7470->4959|7509->4960|7573->4996|7610->5006|7625->5012|7671->5037|7757->5096|7772->5102|7824->5133|7908->5198|7921->5202|7960->5203|8028->5243|8065->5253|8080->5259|8125->5283|8204->5331|8329->5428|8355->5444|8395->5445|8523->5553|8537->5557|8577->5558|8643->5595|8764->5688|8780->5694|8831->5723|8920->5780|9053->5884|9291->6095|9319->6102|9369->6124|9411->6138|9427->6144|9489->6184|9859->6526|9875->6532|9919->6554
                  LINES: 24->5|29->6|34->7|36->9|40->13|40->13|40->13|45->18|45->18|46->19|46->19|46->19|47->20|47->20|47->20|62->35|62->35|62->35|67->40|67->40|67->40|73->46|73->46|73->46|74->47|74->47|74->47|75->48|75->48|75->48|76->49|76->49|76->49|84->57|84->57|84->57|87->60|87->60|87->60|88->61|88->61|88->61|88->61|91->64|91->64|91->64|93->66|95->68|101->74|101->74|101->74|103->76|103->76|103->76|103->76|104->77|104->77|104->77|105->78|106->79|109->82|113->86|113->86|113->86|117->90|117->90|117->90|117->90|119->92|119->92|119->92|120->93|120->93|120->93|120->93|121->94|121->94|121->94|122->95|122->95|122->95|123->96|123->96|123->96|123->96|124->97|127->100|127->100|127->100|130->103|130->103|130->103|131->104|132->105|132->105|132->105|133->106|138->111|146->119|146->119|152->125|152->125|152->125|152->125|164->137|164->137|164->137
                  -- GENERATED --
              */
          