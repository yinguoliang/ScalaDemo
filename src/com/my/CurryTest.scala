package com.my

class CurryTest {
  
}

object CurryObject extends App{
  
  def curriedSum(x:Int)(y:Int) = x + y
  println(curriedSum(1)(3))
  
  def first(x:Int) = (y:Int)=>x+y
  println(first(1)(2))
  val f = first(1)
  println(f(2))
  
  def funfun(x:String)={
    val f = (y:String)=>x+y;
    f
  }
  val fun = funfun("H");
  println(fun("A"))
  
}