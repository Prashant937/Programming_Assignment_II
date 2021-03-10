package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class QueueTest extends AnyFlatSpec {

  "enqueue" should "add element to the stack" in{
    val queueOne= new Queue
    queueOne.enqueue(10)
    assert(!queueOne.isEmpty)
    assert(queueOne.peek == 10)
  }


  "dequeue" should "remove element from the stack" in{
    val queueOne= new Queue
    queueOne.enqueue(10)

    val temp= queueOne.deque
    assert(temp == 10)
    assert(queueOne.isEmpty)

  }

  "Empty Queue" should "throw no such element exception, while accessing dequeue" in{

    val queueOne= new Queue

    assertThrows[NoSuchElementException]{
      val temp= queueOne.deque
    }

  }


}
