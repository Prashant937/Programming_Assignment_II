package com.knoldus

import scala.annotation.tailrec

class ListDemo {

  @tailrec final def last(listOfInteger: List[Int]): Int = {

    listOfInteger match {
      case x :: Nil => x
      case x :: remainingElement => last(remainingElement)
    }
  }

  def tableOfNumber(number: Int): Unit = {
    for (iteration <- 1 to 10) {
      println(number + "*" + iteration + "=" + number * iteration)
    }
  }
}
