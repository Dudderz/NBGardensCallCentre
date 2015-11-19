package models

/**
  * Created by tdudley on 18/11/2015.
  */

//Model class
case class Address (houseNumber : Int, firstLine : String, town : String, postcode : String)

//Data access object
object Address {

  var addresses = Set(
    Address(1, "High Street", "Stoke", "ST6 5TT"),
    Address(2, "High Street", "Stoke", "ST6 5TT"),
    Address(3, "High Street", "Stoke", "ST6 5TT"),
    Address(1, "High Street", "Stoke", "ST6 5TT")
  )

  //finder function
  def findAll = addresses.toList.sortBy(_.houseNumber)
}