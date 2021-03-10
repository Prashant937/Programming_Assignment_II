package com.knoldus

import scala.collection.mutable.ListBuffer

class Stack {

  private var stack= new ListBuffer[Int]

  // It will append new element to the end of the list
  def push(value:Int): Unit ={
    stack += value
  }
  // It will pop up the last list element
  def pop : Int={
    val pop = stack.last
    stack.remove(stack.length-1)

    pop
  }
  // It will Check for the last element of the list
  def peek= stack.last

  // It will check whether the list is empty or not.
  def isEmpty ={
    stack.isEmpty
  }
}
