package com.knoldus

object Operation extends App {


// Operation Of Stack Class
  val ObjOne= new Stack
  ObjOne.push(10)
  ObjOne.push(20)
  ObjOne.push(30)
  ObjOne.push(40)
  ObjOne.push(50)
  println(ObjOne.peek)
  ObjOne.pop
  println(ObjOne.peek)

  println(ObjOne.isEmpty)

//Operation Of Queue Class
  val ObjTwo= new Queue
  ObjTwo.enqueue(10)
  ObjTwo.enqueue(20)
  ObjTwo.enqueue(30)

  println(ObjTwo.deque)

  println(ObjTwo.peek)
  println(ObjTwo.isEmpty)

  //Operation Of ListDemo Class
  val ObjThree= new ListDemo
  val newList= List[Int](20,30,40,50,60)
  val length= newList.length
  println("Last Element= "+ ObjThree.last(newList)  + "\nIndex Value Of Last Element= "+ (length-1))

   (ObjThree.tableOfNumber(2))

}
