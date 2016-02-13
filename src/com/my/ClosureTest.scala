package com.my

object ClosureTest extends App{
  var more = 1 ;
  def addMore(x:Int) = {
    x + more
  }
  
  println(addMore(10))
  more = 2;
  println(addMore(10))
}