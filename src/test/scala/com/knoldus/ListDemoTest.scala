package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class ListDemoTest extends AnyFlatSpec {

  "Last Element of list(10,20,30,40,50)" should "be 50" in{

    val listOne= new ListDemo
   assert( listOne.last(List(10,20,30,40,50)) == 50)

  }


}
