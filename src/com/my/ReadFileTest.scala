package com.my

import scala.io.Source

class ReadFileTest {
  
}

object ReadFile extends App{
  val lines = Source.fromFile("d:/var/test.txt").getLines.toList
  var maxLen = 0
  for(line <- lines)
    maxLen = maxLen.max(line.length().toString().length())
  lines.foreach { x => {
      val space = maxLen - x.length.toString.length
      val padding = " " * space
      println(padding + x.length() + " | "+x)
      
  } }  
  
  
}