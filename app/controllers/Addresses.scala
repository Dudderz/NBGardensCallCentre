package controllers

import play.api.mvc.{Action, Controller}
import models.Address

/**
  * Created by tdudley on 19/11/2015.
  */
class Addresses extends Controller {

  def list = Action {implicit  request =>

    val addresses = Address.findAll

    Ok(views.html.addresses.list(addresses))
  }

}
