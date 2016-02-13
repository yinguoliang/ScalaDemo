package com.my
trait PFXXXXXX{
  def doSth:PartialFunction[Any, Unit];
}
class FunTestC extends PFXXXXXX{
  ///define a function
  def myfun1(){
    println("nothing");
  }
  def myfun2(x:Any,y:String){
    println(x+y);
  }
  //lambda
  val lambAdd = (x:Int,y:Int) => x + y + 1;
  //
  def rec:PartialFunction[Any, Unit] = {
    case "A" => println("aaaaaaaaaaa");
    case _ => println(".............");
  }
  def doSth = {
    case "A" => println("aaaaaaaaa");
    case _ => println("............");
  }
  
  
  def m(m:Any)= {
    println("............");
    m match {
    case "A" => println("you input a");
    case _ => println("default ");
    }
  }
  
  def call100(call:Int => Unit) = {
    call(100);
  }
}
object FunTest{
  def prints(x:Int){
    println(x);
  }
  def add(x:Int){
    println(x+200)
  }
  private val x = {
    println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    try{
      
    } catch {
      case ex:Exception => println(ex)
    }
    this
  }
  def main(args:Array[String]){
	  println(".........fun test........");
    var c = new FunTestC
    c.m("sssssssssss")
    c.call100 { prints }
    c.call100 { add }
    println(x)
  }
}