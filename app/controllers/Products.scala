package controllers

import play.api.i18n.Messages
import play.api.mvc.{Action, Controller}
import play.api.data.Form
import play.api.data.Forms.{mapping, longNumber, nonEmptyText}
import play.api.i18n.Messages.Implicits._
import play.api.mvc.Flash
import play.api.Play.current

import models.Product

/**
  * Created by tdudley on 19/11/2015.
  */
class Products extends Controller {

  def list = Action { implicit request =>

    val products = Product.findAll

    Ok(views.html.products.list(products))
  }

  def show(ean: Long) = Action { implicit request =>
    Product.findByEan(ean).map { product =>
      Ok(views.html.products.details(product)) //Renders the product details page
    }.getOrElse(NotFound)  //404 Warning page
  }

  private val productForm: Form[Product] = Form(
    mapping(
      "ean" -> longNumber.verifying(
        "validation.ean.duplicate", Product.findByEan(_).isEmpty),
      "productName" -> nonEmptyText,
      "productDesc" -> nonEmptyText
    )(Product.apply)(Product.unapply)
  )

  def save = Action { implicit request =>
    val newProductForm = productForm.bindFromRequest()
    newProductForm.fold(
      hasErrors = { form =>
        Redirect(routes.Products.newProduct()).
          flashing(Flash(form.data) +
            ("error" -> Messages("validation.errors")))
      },
      success={newProduct =>
        Product.add(newProduct)
        val message = Messages("products.new.success", newProduct.productName)
        Redirect(routes.Products.show(newProduct.ean)).
          flashing("success" -> message)
      }
    )
  }

  def newProduct = Action { implicit request =>
    val form = if(request2flash.get("error").isDefined)
      productForm.bind(request2flash.data)
    else
      productForm

    Ok(views.html.products.editProduct(form))
  }
}
