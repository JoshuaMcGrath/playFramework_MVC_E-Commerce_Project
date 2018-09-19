// @GENERATOR:play-routes-compiler
// @SOURCE:/media/sf_student/Finished/Finished Document/Furniture&Co/conf/routes
// @DATE:Sun Apr 22 21:32:34 IST 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
