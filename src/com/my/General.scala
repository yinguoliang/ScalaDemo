package com.my

trait Queue[A]{}

trait QueueA[+A]{}

trait QueueB[-A]{}


class AAAA{
  def apply(s:Any) = "This is AAA";
}

class BBBB extends AAAA

//////  http://fineqtbull.iteye.com/blog/477994
class Publication(val title:String)
class Book(title:String) extends Publication(title)
trait GetInfoAction[P >: Book,R <: AnyRef]{
  def apply(book:P):R
}

object Library{
  val books:Set[Book] =  Set(
        new Book("Programing in Scala"),
        new Book("Walden")
      )
      
  def printBookList(info:Book => AnyRef){
    assert(info.isInstanceOf[Function1[_,_]])
    for(book <- books){
      println(info(book))
    }
  }
  
  def printBookListByTrait[P >:Book ,R <: AnyRef](action:GetInfoAction[P,R]){
    for(book <- books){
      println(action(book))
    }
  }
  
}

/////// Genericity
class Reference[T]{
  private var content:T = _ ;
  def set(v:T) = {content = v} ;
  def get:T = content
}

object GeneralMain{
  def main(args:Array[String]){
    println("********** general study ***********");
    val aaa = new AAAA();
    println(aaa());
    def getTitle(p:Publication)=p.title;
    
    Library.printBookList( getTitle)
    
    Library.printBookListByTrait(new GetInfoAction[Publication,String]{
      def apply(p:Publication) : String = p.title;
    })
    
    
    val r = new Reference[Int];
    r.set(100)
    println(r.get)
    val b = new Reference[BBBB]
    b.set(new BBBB());
    println(b.get)
  }
}
