package controllers

import play.api._
import play.api.mvc._

/**
 * @author tdudley
 */
class Application extends Controller {
  
  def index = Action{
    Ok(views.html.index("Hello world"))
  }
  
  def hello(name : String) = Action {
    Ok(views.html.hello(name))
  }

  
}