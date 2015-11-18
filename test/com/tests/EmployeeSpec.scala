package com.tests

import model.EmployeeEntity

/**
  * Created by tdudley on 18/11/2015.
  */
class EmployeeSpec extends TestBase{

  def employeeEntityNameTest() : Unit = {
    "By initialising the Employee Name it" should "set the name to the valid String" in {
      val employeeEntity : EmployeeEntity = new EmployeeEntity(1, "Ben Back", "benback", "password")

      employeeEntity.employeeName should be ("Ben Back")
    }
  }

  def employeeEntityIDTest() : Unit = {
    "By initialising the Employee ID it" should "set the id to the valid Int" in {
      val employeeEntity : EmployeeEntity = new EmployeeEntity(1, "Ben Back", "benback", "password")

      employeeEntity.employeeID should be (1)
    }
  }

  def employeeEntityUsernameTest() : Unit = {
    "By initialising the Employee Username it" should "set the username to the valid String" in {
      val employeeEntity : EmployeeEntity = new EmployeeEntity(1, "Ben Back", "benback", "password")

      employeeEntity.username should be ("benback")
    }
  }

  def employeeEntityPasswordTest() : Unit = {
    "By initialising the Employee Password it" should "set the password to the valid String" in {
      val employeeEntity : EmployeeEntity = new EmployeeEntity(1, "Ben Back", "benback", "password")

      employeeEntity.password should be ("password")
    }
  }

  employeeEntityNameTest
  employeeEntityIDTest
  employeeEntityUsernameTest
  employeeEntityPasswordTest

}
