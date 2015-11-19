package models

/**
  * Created by tdudley on 18/11/2015.
  */
case class Product(ean : Long, productID : Int, productName : String, productDesc : String,
              productPrice : Float, productType : String)

object Product {

  var products = Set(
    Product(5010255079763L, 1,  "Red Gnome", "A Red Gnome", 10, "Gnome"),
    Product(5018206244666L, 1,  "Blue Gnome", "A Blue Gnome", 10, "Gnome"),
    Product(5018306332812L, 1,  "Yellow Gnome", "A Yellow Gnome", 10, "Gnome")
  )

  def findAll = products.toList.sortBy(_.ean)
  def findByEan(ean: Long) = products.find(_.ean == ean)
}
