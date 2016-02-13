package com.my
class PFTTT{
  val addExp = (x:Int) => {
    var y = x+1;
    y + 1;
  }
  val subExp: Int=> Int = {
    case 1 => 1;
    case _ => 0;
  }
  val defaultVal:Option[Int] => Int = {
    case Some(ppp) => ppp;
    case None => 0;
  }
  
  def one:PartialFunction[Int,String] = {
    case 1 => "one";
  }
  def two:PartialFunction[Int,String] = {
  case 2 => "two";
  }
  def otherNum:PartialFunction[Int,String]={
    case _ => "other number"
  }
  def pfFun:PartialFunction[Any,Unit]={
    case "AA" => println("AAAAAA");
    case _ => Unit
  }
  def caseFun(x:Any):Unit = {
    x match {
      case "AA" => println("AAAAA");
    }
  }
}
object PFMain{
  def main(args:Array[String]){
    println("********* hello pf **********")
    val pf:PFTTT= new PFTTT
    println(pf.defaultVal(None))
    println(pf.defaultVal(Some(10)))
    println(pf.addExp(10));
    println("------ partial function(accept specific parameter) -------");
    println(pf.one(1));
    println(pf.two(2));
    println(pf.otherNum(3));
    println("------ mixin partial function --------");
    val pp = pf.one orElse pf.two orElse pf.otherNum
    println(pp(1))
    println(pp(2))
    println(pp(3))
    println(pp.isDefinedAt(10))
    println("------ test partial function-------");
    pf.pfFun("AA");
    pf.pfFun("NN");
    pf.caseFun("AA");
    
  }
}