package com.my

class OptionTest {
  
}

object OptionTest extends App{
  val m = Map(
      "New England" -> "Patriots",
      "New York" -> "Jets",
      "Buffola" -> "Bills",
      "Miami" -> "Dolphins",
      "Los Angeles" -> null
    );
  
  println(m.get("Miami"));
  println(m.get("Miami").get);
  println(m.get("Los Angeles"));
  println(m.get("Los Angeles").get);
  println(m.get("Nothing"));
}