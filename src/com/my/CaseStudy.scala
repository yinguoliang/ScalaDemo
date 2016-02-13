package com.my

trait TT;
class XX ;
case class AA(s:String) extends XX with TT;
case class BB(s:String) extends XX with TT;
case class CC(s:String) extends XX with TT;
class Print{
  def vvvp(s:Any){
    println(s);
  }
}

object Print{
  object InnerPrint{
    def ppp(s:Any){
      System.out.println("inner println"+s);
    }
  }
  def p(s:Any){
    println(s);
  }
}

object Main{
  def main(args:Array[String]){
    Print p "hello" 
    val v:Any = AA("a"); 
    
    v match {
      case AA("a") => {
        println("a"); 
        println("========");
      }
      case BB("b") => println("b");      
      case  _ => println("others");
    }
    
    ///伴生对象
    val p:Print = new Print
    p.vvvp("sss")
    Print p "ssss"
  }
}