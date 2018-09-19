// @GENERATOR:play-routes-compiler
// @SOURCE:/media/sf_student/Finished/Finished Document/Furniture&Co/conf/routes
// @DATE:Sun Apr 22 21:32:34 IST 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_1: controllers.HomeController,
  // @LINE:12
  AdminController_0: controllers.AdminController,
  // @LINE:14
  ShoppingCtrl_2: controllers.ShoppingCtrl,
  // @LINE:20
  Assets_3: controllers.Assets,
  // @LINE:45
  LoginController_4: controllers.LoginController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_1: controllers.HomeController,
    // @LINE:12
    AdminController_0: controllers.AdminController,
    // @LINE:14
    ShoppingCtrl_2: controllers.ShoppingCtrl,
    // @LINE:20
    Assets_3: controllers.Assets,
    // @LINE:45
    LoginController_4: controllers.LoginController
  ) = this(errorHandler, HomeController_1, AdminController_0, ShoppingCtrl_2, Assets_3, LoginController_4, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, AdminController_0, ShoppingCtrl_2, Assets_3, LoginController_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.Home(filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """about""", """controllers.HomeController.AboutUs"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """bathroom""", """controllers.HomeController.Bathroom(cat:Long ?= 3L, filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """kitchen""", """controllers.HomeController.Kitchen(cat:Long ?= 2L, filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """bedroom""", """controllers.HomeController.Bedroom(cat:Long ?= 1L, filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """livingroom""", """controllers.HomeController.LivingRoom(cat:Long ?= 4L, filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """adminControl""", """controllers.AdminController.adminControl(filter:String ?= "")"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateProductSubmit/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateProductSubmit(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """viewOrder/""" + "$" + """id<[^/]+>""", """controllers.ShoppingCtrl.viewOrder(id:String, filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addComment/""" + "$" + """id<[^/]+>""", """controllers.ShoppingCtrl.addComment(id:Long, filter:String ?= "")"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addCommentSubmit/""" + "$" + """id<[^/]+>""", """controllers.ShoppingCtrl.addCommentSubmit(id:Long, filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addProduct""", """controllers.HomeController.addProduct"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delProduct/""" + "$" + """id<[^/]+>""", """controllers.AdminController.deleteProduct(id:Long, filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addUser""", """controllers.HomeController.addUser"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addCustomer""", """controllers.HomeController.addCustomer"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addCustomerSubmit""", """controllers.HomeController.addCustomerSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delCustomer/""" + "$" + """email<[^/]+>""", """controllers.AdminController.deleteCustomer(email:String, filter:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateProduct/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateProduct(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateCustomer/""" + "$" + """email<[^/]+>""", """controllers.HomeController.updateCustomer(email:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """accountDetails""", """controllers.HomeController.accountDetails"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateCustomerSubmit/""" + "$" + """email<[^/]+>""", """controllers.HomeController.updateCustomerSubmit(email:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cancelOrder""", """controllers.ShoppingCtrl.cancelOrder(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """productListing/""" + "$" + """id<[^/]+>""", """controllers.HomeController.productListing(id:Long, filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """showBasket""", """controllers.ShoppingCtrl.showBasket(filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addToBasket/""" + "$" + """id<[^/]+>""", """controllers.ShoppingCtrl.addToBasket(id:Long, filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addOne/""" + "$" + """itemId<[^/]+>""", """controllers.ShoppingCtrl.addOne(itemId:Long, pid:Long, filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """removeOne/""" + "$" + """itemId<[^/]+>""", """controllers.ShoppingCtrl.removeOne(itemId:Long, filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """emptyBasket""", """controllers.ShoppingCtrl.emptyBasket(filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """placeOrder""", """controllers.ShoppingCtrl.placeOrder(filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """checkOut""", """controllers.ShoppingCtrl.checkOut(filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """search""", """controllers.HomeController.search(cat:Long ?= 0, filter:String ?= "")"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """checkOutSubmit""", """controllers.ShoppingCtrl.checkOutSubmit(filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.LoginController.login(filter:String ?= "")"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """loginSubmit""", """controllers.LoginController.loginSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.LoginController.logout"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addProductSubmit""", """controllers.HomeController.addProductSubmit"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addUserSubmit""", """controllers.HomeController.addUserSubmit"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_Home0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_Home0_invoker = createInvoker(
    HomeController_1.Home(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "Home",
      Seq(classOf[String]),
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_HomeController_AboutUs1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("about")))
  )
  private[this] lazy val controllers_HomeController_AboutUs1_invoker = createInvoker(
    HomeController_1.AboutUs,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "AboutUs",
      Nil,
      "GET",
      this.prefix + """about""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_Bathroom2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("bathroom")))
  )
  private[this] lazy val controllers_HomeController_Bathroom2_invoker = createInvoker(
    HomeController_1.Bathroom(fakeValue[Long], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "Bathroom",
      Seq(classOf[Long], classOf[String]),
      "GET",
      this.prefix + """bathroom""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_Kitchen3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kitchen")))
  )
  private[this] lazy val controllers_HomeController_Kitchen3_invoker = createInvoker(
    HomeController_1.Kitchen(fakeValue[Long], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "Kitchen",
      Seq(classOf[Long], classOf[String]),
      "GET",
      this.prefix + """kitchen""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_Bedroom4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("bedroom")))
  )
  private[this] lazy val controllers_HomeController_Bedroom4_invoker = createInvoker(
    HomeController_1.Bedroom(fakeValue[Long], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "Bedroom",
      Seq(classOf[Long], classOf[String]),
      "GET",
      this.prefix + """bedroom""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_LivingRoom5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("livingroom")))
  )
  private[this] lazy val controllers_HomeController_LivingRoom5_invoker = createInvoker(
    HomeController_1.LivingRoom(fakeValue[Long], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "LivingRoom",
      Seq(classOf[Long], classOf[String]),
      "GET",
      this.prefix + """livingroom""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_AdminController_adminControl6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adminControl")))
  )
  private[this] lazy val controllers_AdminController_adminControl6_invoker = createInvoker(
    AdminController_0.adminControl(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "adminControl",
      Seq(classOf[String]),
      "GET",
      this.prefix + """adminControl""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_HomeController_updateProductSubmit7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateProductSubmit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateProductSubmit7_invoker = createInvoker(
    HomeController_1.updateProductSubmit(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateProductSubmit",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """updateProductSubmit/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_ShoppingCtrl_viewOrder8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("viewOrder/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_viewOrder8_invoker = createInvoker(
    ShoppingCtrl_2.viewOrder(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "viewOrder",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """viewOrder/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_ShoppingCtrl_addComment9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addComment/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_addComment9_invoker = createInvoker(
    ShoppingCtrl_2.addComment(fakeValue[Long], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "addComment",
      Seq(classOf[Long], classOf[String]),
      "GET",
      this.prefix + """addComment/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_ShoppingCtrl_addCommentSubmit10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addCommentSubmit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_addCommentSubmit10_invoker = createInvoker(
    ShoppingCtrl_2.addCommentSubmit(fakeValue[Long], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "addCommentSubmit",
      Seq(classOf[Long], classOf[String]),
      "POST",
      this.prefix + """addCommentSubmit/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_HomeController_addProduct11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addProduct")))
  )
  private[this] lazy val controllers_HomeController_addProduct11_invoker = createInvoker(
    HomeController_1.addProduct,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addProduct",
      Nil,
      "GET",
      this.prefix + """addProduct""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_AdminController_deleteProduct12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delProduct/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminController_deleteProduct12_invoker = createInvoker(
    AdminController_0.deleteProduct(fakeValue[Long], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "deleteProduct",
      Seq(classOf[Long], classOf[String]),
      "GET",
      this.prefix + """delProduct/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_Assets_versioned13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned13_invoker = createInvoker(
    Assets_3.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_HomeController_addUser14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addUser")))
  )
  private[this] lazy val controllers_HomeController_addUser14_invoker = createInvoker(
    HomeController_1.addUser,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addUser",
      Nil,
      "GET",
      this.prefix + """addUser""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_HomeController_addCustomer15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addCustomer")))
  )
  private[this] lazy val controllers_HomeController_addCustomer15_invoker = createInvoker(
    HomeController_1.addCustomer,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addCustomer",
      Nil,
      "GET",
      this.prefix + """addCustomer""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_HomeController_addCustomerSubmit16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addCustomerSubmit")))
  )
  private[this] lazy val controllers_HomeController_addCustomerSubmit16_invoker = createInvoker(
    HomeController_1.addCustomerSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addCustomerSubmit",
      Nil,
      "POST",
      this.prefix + """addCustomerSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_AdminController_deleteCustomer17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delCustomer/"), DynamicPart("email", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminController_deleteCustomer17_invoker = createInvoker(
    AdminController_0.deleteCustomer(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "deleteCustomer",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """delCustomer/""" + "$" + """email<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_HomeController_updateProduct18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateProduct/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateProduct18_invoker = createInvoker(
    HomeController_1.updateProduct(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateProduct",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """updateProduct/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_HomeController_updateCustomer19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateCustomer/"), DynamicPart("email", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateCustomer19_invoker = createInvoker(
    HomeController_1.updateCustomer(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateCustomer",
      Seq(classOf[String]),
      "GET",
      this.prefix + """updateCustomer/""" + "$" + """email<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_HomeController_accountDetails20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("accountDetails")))
  )
  private[this] lazy val controllers_HomeController_accountDetails20_invoker = createInvoker(
    HomeController_1.accountDetails,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "accountDetails",
      Nil,
      "GET",
      this.prefix + """accountDetails""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_HomeController_updateCustomerSubmit21_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateCustomerSubmit/"), DynamicPart("email", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateCustomerSubmit21_invoker = createInvoker(
    HomeController_1.updateCustomerSubmit(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateCustomerSubmit",
      Seq(classOf[String]),
      "POST",
      this.prefix + """updateCustomerSubmit/""" + "$" + """email<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:31
  private[this] lazy val controllers_ShoppingCtrl_cancelOrder22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cancelOrder")))
  )
  private[this] lazy val controllers_ShoppingCtrl_cancelOrder22_invoker = createInvoker(
    ShoppingCtrl_2.cancelOrder(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "cancelOrder",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """cancelOrder""",
      """""",
      Seq()
    )
  )

  // @LINE:33
  private[this] lazy val controllers_HomeController_productListing23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("productListing/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_productListing23_invoker = createInvoker(
    HomeController_1.productListing(fakeValue[Long], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "productListing",
      Seq(classOf[Long], classOf[String]),
      "GET",
      this.prefix + """productListing/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:34
  private[this] lazy val controllers_ShoppingCtrl_showBasket24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("showBasket")))
  )
  private[this] lazy val controllers_ShoppingCtrl_showBasket24_invoker = createInvoker(
    ShoppingCtrl_2.showBasket(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "showBasket",
      Seq(classOf[String]),
      "GET",
      this.prefix + """showBasket""",
      """""",
      Seq()
    )
  )

  // @LINE:35
  private[this] lazy val controllers_ShoppingCtrl_addToBasket25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addToBasket/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_addToBasket25_invoker = createInvoker(
    ShoppingCtrl_2.addToBasket(fakeValue[Long], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "addToBasket",
      Seq(classOf[Long], classOf[String]),
      "GET",
      this.prefix + """addToBasket/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:36
  private[this] lazy val controllers_ShoppingCtrl_addOne26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addOne/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_addOne26_invoker = createInvoker(
    ShoppingCtrl_2.addOne(fakeValue[Long], fakeValue[Long], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "addOne",
      Seq(classOf[Long], classOf[Long], classOf[String]),
      "GET",
      this.prefix + """addOne/""" + "$" + """itemId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:37
  private[this] lazy val controllers_ShoppingCtrl_removeOne27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("removeOne/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_removeOne27_invoker = createInvoker(
    ShoppingCtrl_2.removeOne(fakeValue[Long], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "removeOne",
      Seq(classOf[Long], classOf[String]),
      "GET",
      this.prefix + """removeOne/""" + "$" + """itemId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:38
  private[this] lazy val controllers_ShoppingCtrl_emptyBasket28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("emptyBasket")))
  )
  private[this] lazy val controllers_ShoppingCtrl_emptyBasket28_invoker = createInvoker(
    ShoppingCtrl_2.emptyBasket(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "emptyBasket",
      Seq(classOf[String]),
      "GET",
      this.prefix + """emptyBasket""",
      """""",
      Seq()
    )
  )

  // @LINE:39
  private[this] lazy val controllers_ShoppingCtrl_placeOrder29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("placeOrder")))
  )
  private[this] lazy val controllers_ShoppingCtrl_placeOrder29_invoker = createInvoker(
    ShoppingCtrl_2.placeOrder(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "placeOrder",
      Seq(classOf[String]),
      "GET",
      this.prefix + """placeOrder""",
      """""",
      Seq()
    )
  )

  // @LINE:41
  private[this] lazy val controllers_ShoppingCtrl_checkOut30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("checkOut")))
  )
  private[this] lazy val controllers_ShoppingCtrl_checkOut30_invoker = createInvoker(
    ShoppingCtrl_2.checkOut(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "checkOut",
      Seq(classOf[String]),
      "GET",
      this.prefix + """checkOut""",
      """""",
      Seq()
    )
  )

  // @LINE:42
  private[this] lazy val controllers_HomeController_search31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search")))
  )
  private[this] lazy val controllers_HomeController_search31_invoker = createInvoker(
    HomeController_1.search(fakeValue[Long], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "search",
      Seq(classOf[Long], classOf[String]),
      "GET",
      this.prefix + """search""",
      """""",
      Seq()
    )
  )

  // @LINE:43
  private[this] lazy val controllers_ShoppingCtrl_checkOutSubmit32_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("checkOutSubmit")))
  )
  private[this] lazy val controllers_ShoppingCtrl_checkOutSubmit32_invoker = createInvoker(
    ShoppingCtrl_2.checkOutSubmit(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "checkOutSubmit",
      Seq(classOf[String]),
      "POST",
      this.prefix + """checkOutSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:45
  private[this] lazy val controllers_LoginController_login33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginController_login33_invoker = createInvoker(
    LoginController_4.login(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "login",
      Seq(classOf[String]),
      "GET",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )

  // @LINE:46
  private[this] lazy val controllers_LoginController_loginSubmit34_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("loginSubmit")))
  )
  private[this] lazy val controllers_LoginController_loginSubmit34_invoker = createInvoker(
    LoginController_4.loginSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "loginSubmit",
      Nil,
      "POST",
      this.prefix + """loginSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:47
  private[this] lazy val controllers_LoginController_logout35_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_LoginController_logout35_invoker = createInvoker(
    LoginController_4.logout,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "logout",
      Nil,
      "GET",
      this.prefix + """logout""",
      """""",
      Seq()
    )
  )

  // @LINE:48
  private[this] lazy val controllers_HomeController_addProductSubmit36_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addProductSubmit")))
  )
  private[this] lazy val controllers_HomeController_addProductSubmit36_invoker = createInvoker(
    HomeController_1.addProductSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addProductSubmit",
      Nil,
      "POST",
      this.prefix + """addProductSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:50
  private[this] lazy val controllers_HomeController_addUserSubmit37_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addUserSubmit")))
  )
  private[this] lazy val controllers_HomeController_addUserSubmit37_invoker = createInvoker(
    HomeController_1.addUserSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addUserSubmit",
      Nil,
      "POST",
      this.prefix + """addUserSubmit""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_Home0_route(params@_) =>
      call(params.fromQuery[String]("filter", Some(""))) { (filter) =>
        controllers_HomeController_Home0_invoker.call(HomeController_1.Home(filter))
      }
  
    // @LINE:7
    case controllers_HomeController_AboutUs1_route(params@_) =>
      call { 
        controllers_HomeController_AboutUs1_invoker.call(HomeController_1.AboutUs)
      }
  
    // @LINE:8
    case controllers_HomeController_Bathroom2_route(params@_) =>
      call(params.fromQuery[Long]("cat", Some(3L)), params.fromQuery[String]("filter", Some(""))) { (cat, filter) =>
        controllers_HomeController_Bathroom2_invoker.call(HomeController_1.Bathroom(cat, filter))
      }
  
    // @LINE:9
    case controllers_HomeController_Kitchen3_route(params@_) =>
      call(params.fromQuery[Long]("cat", Some(2L)), params.fromQuery[String]("filter", Some(""))) { (cat, filter) =>
        controllers_HomeController_Kitchen3_invoker.call(HomeController_1.Kitchen(cat, filter))
      }
  
    // @LINE:10
    case controllers_HomeController_Bedroom4_route(params@_) =>
      call(params.fromQuery[Long]("cat", Some(1L)), params.fromQuery[String]("filter", Some(""))) { (cat, filter) =>
        controllers_HomeController_Bedroom4_invoker.call(HomeController_1.Bedroom(cat, filter))
      }
  
    // @LINE:11
    case controllers_HomeController_LivingRoom5_route(params@_) =>
      call(params.fromQuery[Long]("cat", Some(4L)), params.fromQuery[String]("filter", Some(""))) { (cat, filter) =>
        controllers_HomeController_LivingRoom5_invoker.call(HomeController_1.LivingRoom(cat, filter))
      }
  
    // @LINE:12
    case controllers_AdminController_adminControl6_route(params@_) =>
      call(params.fromQuery[String]("filter", Some(""))) { (filter) =>
        controllers_AdminController_adminControl6_invoker.call(AdminController_0.adminControl(filter))
      }
  
    // @LINE:13
    case controllers_HomeController_updateProductSubmit7_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_updateProductSubmit7_invoker.call(HomeController_1.updateProductSubmit(id))
      }
  
    // @LINE:14
    case controllers_ShoppingCtrl_viewOrder8_route(params@_) =>
      call(params.fromPath[String]("id", None), params.fromQuery[String]("filter", Some(""))) { (id, filter) =>
        controllers_ShoppingCtrl_viewOrder8_invoker.call(ShoppingCtrl_2.viewOrder(id, filter))
      }
  
    // @LINE:15
    case controllers_ShoppingCtrl_addComment9_route(params@_) =>
      call(params.fromPath[Long]("id", None), params.fromQuery[String]("filter", Some(""))) { (id, filter) =>
        controllers_ShoppingCtrl_addComment9_invoker.call(ShoppingCtrl_2.addComment(id, filter))
      }
  
    // @LINE:16
    case controllers_ShoppingCtrl_addCommentSubmit10_route(params@_) =>
      call(params.fromPath[Long]("id", None), params.fromQuery[String]("filter", Some(""))) { (id, filter) =>
        controllers_ShoppingCtrl_addCommentSubmit10_invoker.call(ShoppingCtrl_2.addCommentSubmit(id, filter))
      }
  
    // @LINE:17
    case controllers_HomeController_addProduct11_route(params@_) =>
      call { 
        controllers_HomeController_addProduct11_invoker.call(HomeController_1.addProduct)
      }
  
    // @LINE:18
    case controllers_AdminController_deleteProduct12_route(params@_) =>
      call(params.fromPath[Long]("id", None), params.fromQuery[String]("filter", Some(""))) { (id, filter) =>
        controllers_AdminController_deleteProduct12_invoker.call(AdminController_0.deleteProduct(id, filter))
      }
  
    // @LINE:20
    case controllers_Assets_versioned13_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned13_invoker.call(Assets_3.versioned(path, file))
      }
  
    // @LINE:21
    case controllers_HomeController_addUser14_route(params@_) =>
      call { 
        controllers_HomeController_addUser14_invoker.call(HomeController_1.addUser)
      }
  
    // @LINE:22
    case controllers_HomeController_addCustomer15_route(params@_) =>
      call { 
        controllers_HomeController_addCustomer15_invoker.call(HomeController_1.addCustomer)
      }
  
    // @LINE:23
    case controllers_HomeController_addCustomerSubmit16_route(params@_) =>
      call { 
        controllers_HomeController_addCustomerSubmit16_invoker.call(HomeController_1.addCustomerSubmit)
      }
  
    // @LINE:24
    case controllers_AdminController_deleteCustomer17_route(params@_) =>
      call(params.fromPath[String]("email", None), params.fromQuery[String]("filter", None)) { (email, filter) =>
        controllers_AdminController_deleteCustomer17_invoker.call(AdminController_0.deleteCustomer(email, filter))
      }
  
    // @LINE:25
    case controllers_HomeController_updateProduct18_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_updateProduct18_invoker.call(HomeController_1.updateProduct(id))
      }
  
    // @LINE:26
    case controllers_HomeController_updateCustomer19_route(params@_) =>
      call(params.fromPath[String]("email", None)) { (email) =>
        controllers_HomeController_updateCustomer19_invoker.call(HomeController_1.updateCustomer(email))
      }
  
    // @LINE:27
    case controllers_HomeController_accountDetails20_route(params@_) =>
      call { 
        controllers_HomeController_accountDetails20_invoker.call(HomeController_1.accountDetails)
      }
  
    // @LINE:29
    case controllers_HomeController_updateCustomerSubmit21_route(params@_) =>
      call(params.fromPath[String]("email", None)) { (email) =>
        controllers_HomeController_updateCustomerSubmit21_invoker.call(HomeController_1.updateCustomerSubmit(email))
      }
  
    // @LINE:31
    case controllers_ShoppingCtrl_cancelOrder22_route(params@_) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_ShoppingCtrl_cancelOrder22_invoker.call(ShoppingCtrl_2.cancelOrder(id))
      }
  
    // @LINE:33
    case controllers_HomeController_productListing23_route(params@_) =>
      call(params.fromPath[Long]("id", None), params.fromQuery[String]("filter", Some(""))) { (id, filter) =>
        controllers_HomeController_productListing23_invoker.call(HomeController_1.productListing(id, filter))
      }
  
    // @LINE:34
    case controllers_ShoppingCtrl_showBasket24_route(params@_) =>
      call(params.fromQuery[String]("filter", Some(""))) { (filter) =>
        controllers_ShoppingCtrl_showBasket24_invoker.call(ShoppingCtrl_2.showBasket(filter))
      }
  
    // @LINE:35
    case controllers_ShoppingCtrl_addToBasket25_route(params@_) =>
      call(params.fromPath[Long]("id", None), params.fromQuery[String]("filter", Some(""))) { (id, filter) =>
        controllers_ShoppingCtrl_addToBasket25_invoker.call(ShoppingCtrl_2.addToBasket(id, filter))
      }
  
    // @LINE:36
    case controllers_ShoppingCtrl_addOne26_route(params@_) =>
      call(params.fromPath[Long]("itemId", None), params.fromQuery[Long]("pid", None), params.fromQuery[String]("filter", Some(""))) { (itemId, pid, filter) =>
        controllers_ShoppingCtrl_addOne26_invoker.call(ShoppingCtrl_2.addOne(itemId, pid, filter))
      }
  
    // @LINE:37
    case controllers_ShoppingCtrl_removeOne27_route(params@_) =>
      call(params.fromPath[Long]("itemId", None), params.fromQuery[String]("filter", Some(""))) { (itemId, filter) =>
        controllers_ShoppingCtrl_removeOne27_invoker.call(ShoppingCtrl_2.removeOne(itemId, filter))
      }
  
    // @LINE:38
    case controllers_ShoppingCtrl_emptyBasket28_route(params@_) =>
      call(params.fromQuery[String]("filter", Some(""))) { (filter) =>
        controllers_ShoppingCtrl_emptyBasket28_invoker.call(ShoppingCtrl_2.emptyBasket(filter))
      }
  
    // @LINE:39
    case controllers_ShoppingCtrl_placeOrder29_route(params@_) =>
      call(params.fromQuery[String]("filter", Some(""))) { (filter) =>
        controllers_ShoppingCtrl_placeOrder29_invoker.call(ShoppingCtrl_2.placeOrder(filter))
      }
  
    // @LINE:41
    case controllers_ShoppingCtrl_checkOut30_route(params@_) =>
      call(params.fromQuery[String]("filter", Some(""))) { (filter) =>
        controllers_ShoppingCtrl_checkOut30_invoker.call(ShoppingCtrl_2.checkOut(filter))
      }
  
    // @LINE:42
    case controllers_HomeController_search31_route(params@_) =>
      call(params.fromQuery[Long]("cat", Some(0)), params.fromQuery[String]("filter", Some(""))) { (cat, filter) =>
        controllers_HomeController_search31_invoker.call(HomeController_1.search(cat, filter))
      }
  
    // @LINE:43
    case controllers_ShoppingCtrl_checkOutSubmit32_route(params@_) =>
      call(params.fromQuery[String]("filter", Some(""))) { (filter) =>
        controllers_ShoppingCtrl_checkOutSubmit32_invoker.call(ShoppingCtrl_2.checkOutSubmit(filter))
      }
  
    // @LINE:45
    case controllers_LoginController_login33_route(params@_) =>
      call(params.fromQuery[String]("filter", Some(""))) { (filter) =>
        controllers_LoginController_login33_invoker.call(LoginController_4.login(filter))
      }
  
    // @LINE:46
    case controllers_LoginController_loginSubmit34_route(params@_) =>
      call { 
        controllers_LoginController_loginSubmit34_invoker.call(LoginController_4.loginSubmit)
      }
  
    // @LINE:47
    case controllers_LoginController_logout35_route(params@_) =>
      call { 
        controllers_LoginController_logout35_invoker.call(LoginController_4.logout)
      }
  
    // @LINE:48
    case controllers_HomeController_addProductSubmit36_route(params@_) =>
      call { 
        controllers_HomeController_addProductSubmit36_invoker.call(HomeController_1.addProductSubmit)
      }
  
    // @LINE:50
    case controllers_HomeController_addUserSubmit37_route(params@_) =>
      call { 
        controllers_HomeController_addUserSubmit37_invoker.call(HomeController_1.addUserSubmit)
      }
  }
}
