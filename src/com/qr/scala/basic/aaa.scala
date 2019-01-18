package com.qr.scala.basic

object aaa {
  def main(args: Array[String]): Unit = {
   val arr = Array(2,4,5);
   val xx=arr.map(x=>x*10)
   val xxx = arr.map(x=>x-10)
   println(xx.toBuffer)
   println(xxx.toBuffer)
    
  }
}