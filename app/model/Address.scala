package model

/**
  * Created by tdudley on 18/11/2015.
  */
case class Address
  (val houseNumber : Int, val firstLine : String, val town : String, val postcode : String) {

}

object Address {

  var addresses = Set{
    Address(1, "High Street", "Stoke", "ST6 5TT"),
    Address(2, "High Street", "Stoke", "ST6 5TT"),
    Address(3, "High Street", "Stoke", "ST6 5TT"),
    Address(1, "High Street", "Stoke", "ST6 5TT")
  }

  def findAll = addresses.toList.sortBy(_.houseNumber)
}
