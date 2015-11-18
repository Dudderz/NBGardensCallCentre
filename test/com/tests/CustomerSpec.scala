package com.tests

import model.{PaymentDetails, Customer, Address}

/**
  * Created by tdudley on 18/11/2015.
  */
class CustomerSpec extends TestBase{

  def customerEntityIDTest() : Unit = {
    "By initialising the Customer ID it" should "set the customer ID with a valid integer" in{

      val customer = new Customer(1, "Hubert Catch",null ,null ,2500)

      customer.customerID should be (1)

    }
  }

  def customerEntityNameTest() : Unit = {
    "By initialising the Customer Name it" should "set the customer name with a valid string" in{

      val customer = new Customer(1, "Hubert Catch", null , null ,2500)

      customer.customerName should be ("Hubert Catch")

    }
  }

  def customerEntityAddressTest() : Unit = {
    "By initialising the Customer Address it" should "set the customer address with a valid address" in{

      val address = new Address(1, "High Street", "Stoke-On-Trent", "ST5 6YY")

      val customer = new Customer(1, "Hubert Catch", address , null,2500)

      customer.customerAddress should not be (null)

    }
  }

  def customerEntityPaymentDetailsTest() : Unit = {
    "By initialising the Customer Payment Details it" should "set the customer Payment Details with a valid Payment Details" in{

      val paymentDetails = new PaymentDetails("Hugh Mann", "8899446622771166", "06/2016", 123)

      val customer = new Customer(1, "Hubert Catch", null , paymentDetails ,2500)

      customer.customerPaymenetDetails should not be (null)

    }
  }

  def customerEntityCreditTest() : Unit = {
    "By initialising the Customer Credit it " should "set the customer credit with a valid float" in{

      val customer = new Customer(1, "Hubert Catch", null , null ,2500)

      customer.customerCreditUsed should be (2500)

    }
  }

  customerEntityIDTest
  customerEntityNameTest
  customerEntityAddressTest
  customerEntityPaymentDetailsTest
  customerEntityCreditTest

}
