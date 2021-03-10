package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class StackTest extends AnyFlatSpec {

  "push" should "add element to the stack" in{
    val stackOne= new Stack
    stackOne.push(10)
    assert(!stackOne.isEmpty)
    assert(stackOne.peek == 10)
  }


  "pop" should "remove element from the stack" in{
    val stackOne= new Stack
    stackOne.push(10)

    val temp= stackOne.pop
    assert(temp == 10)
    assert(stackOne.isEmpty)

  }
  "Empty Stack" should "throw no such element exception, while accessing pop" in{
    val stackOne= new Stack
    assertThrows[NoSuchElementException]{
      val temp= stackOne.pop
    }

  }

}
