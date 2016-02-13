package com.my

class CollectionTest {
  
}

object CollStudy{
   def main(args:Array[String]){
  def getList():List[Int] = {
    List(1,2,3,4,100);
  }
  //list
  val list = List(1,2,3,4);
  
  val multi = list map { x => x*2 };
  println(multi);
  
  println(getList().foreach[Int]({
    x => println(x);
    x*2
  }))
  getList() forall {
    x => println("forall "+x);
    true
  }
  for(x <- getList()) println(x);
  
  //tuple
  val t = (1,2,3,4,"A",new CollectionTest(),1,1,1,1,1,1)
  println(t);
  println(t._11)
  //Set
  val s = Set(1,2,3,4,"ABCDE")
  s foreach {x=>println(x)}
  val ss:Set[Int] = Set[Int](1,2,3,3)
  println( ss map {x => println(x); x * 2 } )
  
  //Array
  val arr = new Array[String](3);
  arr(1) = "xxxxx";
  arr(2) = "yyyyy";
  arr(0) = "zzzzz";
  println(arr);
  arr map {x => x+"***"} foreach {x => println(x)};
  }
}