package com.tests

import model.PaymentDetails

/**
  * Created by tdudley on 18/11/2015.
  */
class PaymentDetailsSpec extends TestBase {

  def paymentDetailsNameOnCardEntity() : Unit = {
    "By initialising the name on card it " should "set the Payment Details NameOnCard with a valid string" in {

      val paymentDetails = new PaymentDetails("Hugh Mann", "8899446622771166", "06/2016", 123)

      paymentDetails.nameOnCard should be("Hugh Mann")
    }
  }

  def paymentDetailsCardNumber() : Unit = {
    "By initialising the card number it" should "set the card number with a valid String" in {

      val paymentDetails = new PaymentDetails("Hugh Mann", "8899446622771166", "06/2016", 123)

      paymentDetails.cardNumber should be ("8899446622771166")
    }
  }

  def paymentDetailsExpiryDate() : Unit = {
    "By initialising the expiry date it" should "set the expiry name with a valid String" in{

      val paymentDetails = new PaymentDetails("Hugh Mann", "8899446622771166", "06/2016", 123)

      paymentDetails.expiryDate should be ("06/2016")
    }
  }

  def paymentDetailsCVVNumber() : Unit = {
    "By initialising the CVV number it" should "set the CVV number with a valid int" in {
      val paymentDetails = new PaymentDetails("Hugh Mann", "8899446622771166", "06/2016", 123)

      paymentDetails.CVVNumber should be (123)
    }
  }

  paymentDetailsNameOnCardEntity
  paymentDetailsCardNumber
  paymentDetailsExpiryDate
  paymentDetailsCVVNumber
}
