
import com.my._;
import java.util.Date

class SpecificClass extends AbstractClass{
  def hi = "helo";
  
  def age = 100;
  
  def birth = new Date();
  
  def string() : String = {
    return hi+"-"+age+"-"+birth;
  }
}

object Hello {
  var i:Int = _ ;
  var l:Long = _ ;
  var s:SpecificClass = _;
  def helloFunction = println("hello world");
  def add(x:Int,y:Int) = x+y;
  def max(x:Int,y:Int):Int = {
    if(x>y) x;
    y;
  }
  def v(p:Int):Int = {
    p match{
      case 1 => 100;
      case 2 => 200;
      case _ => 0;
    }
  }
  def main(args:Array[String]){
    println("Hello Scala!!!");
    helloFunction;
    println(add(3,4));
    println(max(3,4)) ;
    println(new SpecificClass().string());
    println(i);
    println(l);
    println(s);
    
    
    
  }
}