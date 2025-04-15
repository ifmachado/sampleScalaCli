package com.example.calculator

import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers
import org.scalatest.BeforeAndAfterAll
import org.scalatest.BeforeAndAfterEach

class SimpleCalculatorSpec extends AnyWordSpec with Matchers with BeforeAndAfterAll with BeforeAndAfterEach {

  private var calculator: SimpleCalculator = _

  override def beforeEach(): Unit = {
    calculator = new SimpleCalculator
  }

  "SimpleCalculator" when {
    "performing addition" should {
      "return the correct sum for positive numbers" in {
        val result = calculator.add(3, 5)
        result shouldEqual 8
      }

      "return the correct sum for negative numbers" in {
        val result = calculator.add(-3, -5)
        result shouldEqual -8
      }

      "return the correct sum for a positive and a negative number" in {
        val result = calculator.add(10, -4)
        result shouldEqual 6
      }

      "return the correct sum when adding zero" in {
        val result1 = calculator.add(0, 5)
        result1 shouldEqual 5

        val result2 = calculator.add(7, 0)
        result2 shouldEqual 7
      }
    }
  }
}