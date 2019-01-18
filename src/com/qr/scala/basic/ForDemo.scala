package com.qr.scala.basic

object ForDemo {
  def main(args: Array[String]): Unit = {
    for(i<-1 to 10)
      println(i)
      var arr = Array("a","b","c")
      println("----------------")
      for(i<-arr)
        println(i)
         println("----------------")
         for (i <- 1 to 3; j <- 1 to 3 if i != j)
      println((10 * i + j) + " ")
     println("----------------")
     val value = Array(1, 3, 4, 5, 6, 7, 8, 9);
    for (i <- value; if (i % 2 == 0))
      println(i)
      println("----------------")


  }
}