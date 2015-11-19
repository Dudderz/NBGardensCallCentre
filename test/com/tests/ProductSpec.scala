package com.tests

import models.Product

/**
  * Created by tdudley on 18/11/2015.
  */
class ProductSpec extends TestBase{

  def productEntityIDTest() : Unit = {
    "By initialising the Product ID it" should "set a product ID with a valid integer" in {
      val productEntity : Product = new Product(1, "Red Gnome", "A Red Gnome", 10.0f, "Gnome")

      productEntity.productID should be (1)
    }
  }

  def productEntityNameTest() : Unit = {
    "By initialising the Product Name it" should "set the product name with a valid String" in{
      val productEntity : Product = new Product(1, "Red Gnome", "A Red Gnome", 10.0f, "Gnome")

      productEntity.productName should be ("Red Gnome")
    }
  }

  def productEntityDescTest() : Unit = {
    "By initialising the Product Description it" should "set the product description with a valid String" in{
      val productEntity : Product = new Product(1, "Red Gnome", "A Red Gnome", 10.0f, "Gnome")

      productEntity.productDesc should be ("A Red Gnome")
    }
  }

  def productEntityPriceTest() : Unit = {
    "By initialising the Product Price it" should "set the product price with a valid String" in {
      val productEntity: Product = new Product(1, "Red Gnome", "A Red Gnome", 10.0f, "Gnome")

      productEntity.productPrice should be(10.0f)
    }
  }

  def productEntityTypeTest() : Unit = {
    "By initialising the Product Type it" should "set the product type with a valid String" in{
      val productEntity : Product = new Product(1, "Red Gnome", "A Red Gnome", 10.0f, "Gnome")

      productEntity.productType should be ("Gnome")
    }
  }

  productEntityIDTest
  productEntityNameTest
  productEntityDescTest
  productEntityPriceTest
  productEntityTypeTest

}
