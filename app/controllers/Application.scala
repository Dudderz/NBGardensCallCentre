package controllers

import play.api._
import play.api.mvc.{Action, Controller}

/**
 * @author tdudley
 */
class Application extends Controller {
  
  def index = Action{
    //Ok(views.html.index("Hello world"))
    //Redirect(routes.Addresses.list())
    Redirect(routes.Products.list())
  }
  
  def hello(name : String) = Action {
    Ok(views.html.hello(name))
  }
}