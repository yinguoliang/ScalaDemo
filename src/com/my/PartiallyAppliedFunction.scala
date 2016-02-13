package com.my

object PartiallyAppliedFunction extends App{
  def someFun(a:String,b:Int,c:String,d:Int){
    println(a+"-"+b+"-"+c+"-"+d);
  }
  someFun("aaaa",1,"bbbb",2)
  
  val pf1 = someFun _ ;
  pf1("xxxx",1,"yyyy",2);
  
  val pf2 = someFun(_:String,_:Int,"Default",0)
  pf2("AAAA",2)
  
  val pf3 = pf2(_:String,0)
  pf3("hhh");
}