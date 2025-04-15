package com.example.calculator

import mainargs._

class SimpleCalculator {
  def add(a: Int, b: Int): Int = {
    a + b
  }
}

object SimpleCalculator {
  def apply(): SimpleCalculator = new SimpleCalculator()

  @main(doc = "Perform addition of two numbers")
  def add(
    @arg(
      short = 'a',
      doc =
        """First part of the sum"""
    )
    a: Int, 
    @arg(
      short = 'b',
      doc =
        """Second part of the sum"""
    )
    b: Int): Unit = {
    val result = SimpleCalculator().add(a, b)
    println(s"The result of adding $a and $b is: $result")
  }

  def main(args: Array[String]): Unit = ParserForMethods(this).runOrExit(args.toIndexedSeq)
}