package com.caseclz

sealed abstract class Expr{
  def simplify():Expr={
    this match{
      case UnOp("-",UnOp("-",e)) => e
      case BinOp("+",e,Number(0))=> e
      case BinOp("*",e,Number(1))=> e
      case BinOp("*",x,y) if x==y => BinOp("*",x,Number(2))
      case _ => this
    }
  }
};
case class Var(name:String) extends Expr{
  override def toString():String=name
};
case class Number(num:Double) extends Expr{
  override def toString():String=num.toString()
};
case class UnOp(op:String,arg:Expr) extends Expr{
  override def toString():String=op+" "+arg
};
case class BinOp(op:String,left:Expr,right:Expr) extends Expr{
  override def toString():String = left +" "+op+" "+right
};
case class EE(name:String){
  var m = "eeee"
}

object SimpleMain extends App{
  def print(x:Expr) = {
    x match {
      case Var("x") => println("multiple operator");
      case Var("+") => println("plus operator");
      case Var("-") => println("substract operator");
      case other => println("unkonwn expr:"+other);
    }
  }
  
  print(BinOp("+",Number(1),Number(0)).simplify())
  print(BinOp("-",Var("x"),Var("y")).simplify())
  print(BinOp("*",Number(11),Number(12)).simplify())
  print(BinOp("*",Number(11),Number(11)).simplify())
}