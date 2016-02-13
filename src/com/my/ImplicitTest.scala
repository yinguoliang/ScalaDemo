package com.my

class ImplicitTest {
  def name = "xxx";
}
class SimpleObject{
  
}
object ExtendFunction{
  type S = String
  
  def he(s:S){
    println(s);
  }
  implicit class e1(s:SimpleObject){
    def retName = "SimpleObject"
  }
}
object ImplicitObject{
  val v:SimpleObject = {
    System.out.println("create SimpleObject");
    val r = new SimpleObject
    r
  }
  
  
  implicit class xxxget(s:String) {
    def prefix = "haha "+s;
    
    def gogo = "gogo! "+s;
  }
  
  implicit def addprefix(s:ImplicitTest) = "eh??? "+s;
  implicit val ssssssss = "llll";
  def hello(s:String)(ss:String)(implicit sss:String)=s+ss+sss;
  
  def main(args:Array[String]){
    println("___________________");
    
    println("xxxxxx".prefix);
    println("xxxxxx".gogo);
    println(new ImplicitTest()+"  will be transfered");
    
    println(hello("111")("ccc"));
    
    val so:SimpleObject = new SimpleObject
    
    import ExtendFunction._;
    println(so.retName);
    
//    println(ImplicitObject.v);
    
    
  }
}