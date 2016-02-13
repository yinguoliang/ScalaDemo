package com.my

import scala.collection.mutable.ArrayBuffer

abstract class IntQueue{
  def put(x:Int)
  def get():Int
}

class BasicIntQueue extends IntQueue{
  private val buf = new ArrayBuffer[Int]
  def put(x:Int)  {
    buf.+=(x)
  }
  def get():Int={
    buf.remove(0)
  }
}

trait Doubling extends IntQueue{
  abstract override def put(x:Int) = {
    println("double "+x)
    super.put(x*2)
  }
}
trait Increasing extends IntQueue{
  abstract override def put(x:Int)={
    println("inc "+x)
    super.put(x+1)
  }
}
trait Filtering extends IntQueue{
  abstract override def put(x:Int){
    println("Filter "+x)
    super.put(x)
  }
}
class AAAAA{
  private val buf = new ArrayBuffer[Int]
  def put(x:Int){
    buf += x
  }
}
class BBBBB extends AAAAA{
  override def put(x:Int){
    super.put(x*2)
  }
}
object QueueMain extends App{
  val q:IntQueue = new BasicIntQueue with Doubling with Increasing with Filtering
  q.put(10)
  //q.put(3)
  println(q.get());
 // println(q.get());
}