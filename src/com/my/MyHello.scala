package com.my

trait MyMark

trait Sayable{
  def say();
  def noo():String = {
    "hhhhh";
  };
}
abstract class AbstractClass

class Animal

class MyHello extends Animal with Sayable{
  def say()=println("hello "+this.getClass);
}


object MainClass{
  def main(args:Array[String]){
    println("hello myclass");
    val hello = new MyHello();
    hello.say();
    println(hello.noo());
  }
}