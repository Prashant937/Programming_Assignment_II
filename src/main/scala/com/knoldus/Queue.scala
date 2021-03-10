package com.knoldus

import scala.collection.mutable.ListBuffer


class Queue{
var queue = new ListBuffer[Int]

  // It will add element to end of the list
  def enqueue(value:Int)={
    queue += value
  }

  // It will delete element from the end of the list
  def deque: Int ={
    val dequeValue = queue.head
    queue = queue.drop(1)

    dequeValue
  }

  // It will provide the last element
  def peek={
    queue.last
  }

  // It will check the queue whether it is empty or not.
  def isEmpty ={
    queue.isEmpty
  }
}

