package com.my

import scala.io.Source

class FunctionAndClosur {
  
}

object LongLines {
  def processFile(file:String,width:Int){
    def processLine(line:String){
      if(line.length() > width){
        println(file+"  :  "+line)
      }
    }
    var source = Source.fromFile(file);
    for(line <- source.getLines ){
      processLine(line)
    }
  }
  
}

object FunctionAdnClosureTest extends App{
  LongLines.processFile("d:/var/test.txt", 80)
  
  def literalFun = (x:Int,y:Int) => x + y; 
  println(literalFun(1,2))
  
  def fun2 = (x:Int) => x+1;
  println(fun2(11));
  
  def fun3 =  { x:Int => {println(x + 2)} };
  println(fun3(10))
  
  val list = List(1,2,3,4,5)
  list foreach {println}
  list foreach {x=>println(x)}
  list foreach (x=>println(x))
  println(list.filter(_>3))
  println(list.filter(x=>x>2))
  val fff = (_: Int) + (_: Int)
  val ff = (_:Int) + 2
  
  
}