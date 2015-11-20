package models

/**
  * Created by tdudley on 18/11/2015.
  */
case class Product(ean : Long, productName : String, productDesc : String)

object Product {

  var products = Set(
    Product(5010255079763L, "Red Gnome", "A Red Gnome"),
    Product(5018206244666L, "Blue Gnome", "A Blue Gnome"),
    Product(5018306332812L, "Yellow Gnome", "A Yellow Gnome")
  )

  def findAll = products.toList.sortBy(_.ean)
  def findByEan(ean: Long) = products.find(_.ean == ean)
  def add(product: Product){products = products + product}
}
