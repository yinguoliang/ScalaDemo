package com.my

import java.io.File
import java.io.PrintWriter
import java.util.Date

class NewControlStructure {
  
}
object NewControlStructure extends App{
  def twice(op:Double=>Double,x:Double) = op(op(x))
  println(twice(_+1 ,5))
  
  def withPrinterWriter(file:File,op:PrintWriter=>Unit){
    val w = new PrintWriter(file)
    try{
      op(w)
    }finally{
      w.close()
    }
  }
  withPrinterWriter(new File("d:/var/test.txt"),_.println(new Date))
  
  def withPrinterWriterCurried(file:File)(op:PrintWriter=>Unit){
    val w = new PrintWriter(file)
    try{
      op(w)
    }finally{
      w.close()
    }
  }
   withPrinterWriterCurried 
   { 
     new File("d:/var/test.txt") 
   }
   {
     _.println(new Date)
   }
}
