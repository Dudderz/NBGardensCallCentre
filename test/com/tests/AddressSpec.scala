package com.tests

import org.scalatest._

import models.Address

/**
  * Created by tdudley on 18/11/2015.
  */
class AddressSpec extends TestBase {

  def addressEntityHouseNumberTest() : Unit = {
    "By initialising the Address house number it" should "set the address house number with a valid int" in{

      val address = new Address(1, "High Street", "Stoke-On-Trent", "ST5 6YY")

      address.houseNumber should be (1)
    }
  }

  def addressEntityFirstLineTest() : Unit = {
    "By initialising the Address first line it" should "set the first line address to a valid string" in {

      val address = new Address(1, "High Street", "Stoke-On-Trent", "ST5 6YY")

      address.firstLine should be("High Street")
    }
  }

  def addressEntityTownTest() : Unit = {
    "By initialising the Address town it" should "set the town to a valid string" in{

      val address = new Address(1, "High Street", "Stoke-On-Trent", "ST5 6YY")

      address.town should be ("Stoke-On-Trent")
    }
  }

  def addressEntityPostcodeTest() : Unit = {
    "By initialising the Address postcode it" should "set the town to a valid string" in{

      val address = new Address(1, "High Street", "Stoke-On-Trent", "ST5 6YY")

      address.postcode should be ("ST5 6YY")
    }
  }

  addressEntityHouseNumberTest
  addressEntityFirstLineTest
  addressEntityTownTest
  addressEntityPostcodeTest

}
