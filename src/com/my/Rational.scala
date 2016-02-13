package com.my
object Rational{
  implicit def intToRational(x:Int) = new Rational(x)
}
class Rational (n:Int,d:Int){
  require(d !=0 )
  
  def number = n
  def denom = d 
  def g = gcd(n,d)
  override def toString = if(d/g==1) (n/g).toString() else n/g + "/" + d/g
  
  def + (that : Rational):Rational = {
    new Rational(this.n * that.denom + that.number * this.d, this.denom * that.denom)
  }
  
  def ++ : Rational = this + new Rational(1)
  
  def +? : Rational = this + new Rational(2)
  def <-> : Rational = this + new Rational(3)
  def `+x` : Rational = this + this
  def this(n:Int) = this(n,1)
  def -(that:Rational):Rational = {
    new Rational(this.number*that.denom - that.number*this.denom,this.denom * that.denom)
  }
  private def gcd(a:Int,b:Int):Int = {
    if(b==0) a else gcd(b, a % b)
  }
  
}

object RationalTest extends App{
  val r = new Rational(1,2);
  val x = new Rational(1,3);
  val y = new Rational(1,6);
  val z = new Rational(2,6);
  println(r + x + y)
  println(z)
  println(z++)
  println(z+?)
  println(z<->)
  println(z +x )
  println(1 - z )
}