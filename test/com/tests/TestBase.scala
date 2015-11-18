package com.tests

import org.scalatest._

/**
  * Created by tdudley on 17/11/2015.
  */
abstract class TestBase extends FlatSpec with Matchers with OptionValues
with Inside with Inspectors{

}
