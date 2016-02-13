package com.caseclz

class OtherPattern {
  
}

case class Fool(name:String,age:Int,remark:String)

object OtherPattenMain extends App{
  val say:Any=>Unit = {
    case "hello"=>println("hello")
    case s:String => println("input a string"+s);
    case Fool(name,age,remark) => println(name+"-"+age+"-"+remark)
    case _ => println("????????")
  }
  //****** take apart variable from tuple *******
  val t = ("AAAA",123)
  val (str,num) = t;
  println(str);
  println(num)
  //******* take apart variable from case class *******
  val f = Fool("YGL",100,"Hello Case")
  val Fool(n,a,r) = f;
  println(n+","+a+","+r);
  say("hello");
  say(Fool("ygl",100,"doooo"))
  say("yahoo!!!!!")
  say(f)
  say(t)
}
