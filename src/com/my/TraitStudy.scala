package com.my

trait Speakable{
  def speak()
}

trait Runable

//***********
trait Workable

trait Cryable{
  def cry();
}
// define order 
trait Ord  {
  def < (that:Any) : Boolean ;
  def <= (that:Any) : Boolean = {
    (this < that) || this == that;
  }
  def > (that:Any):Boolean = !(this<=that);
  def >= (that:Any):Boolean = !(this<that);
}
class A {
  def say(){}
}
class B extends A{
  override def say(){
    super.say();
  }
}
class Person(s:String) extends Speakable with Runable with Workable with Ord{
   val name = "YYY"+s
   
   def speak() = {
     println("My Name is " + name)
   }
   
   def +(x:Person) =  new Person(this.name+x.name);
   
   def !(msg:Any)=println("Ha ha ! execute,"+msg)
   
   def <(that:Any):Boolean = {
     that.isInstanceOf[Person] && {
       val o = that.asInstanceOf[Person]
       this.name < o.name
     }
   }
   
   override def equals(that:Any):Boolean = {
     this.isInstanceOf[Person]  && {
       val o = that.asInstanceOf[Person]
       this.name == o.name
     }
   }
}

object TraitStudyMain{
  def main(args:Array[String]):Unit = {
     val p = new Person("ssss") with Cryable{
       def cry(){
       println(this)
       };
     }
     
     
     p.speak();
     p.cry();
     
     p cry
     
     val pp:Person = p+p
     
     pp speak
     
     pp ! p
     
     pp.!(pp)
     
     println(pp < p)
     println(pp <= p)
     println(pp > p)
     println(pp >= p)
     println(pp == p)
     println(p == p)
     
  }
}
