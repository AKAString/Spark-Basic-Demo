package com.qr.scala.basic

object fun {
  def my(f:(Int,Int)=>Int):Int=f(3,4)
  val fun = (a:Int,b:Int)=>a+b
  def main(args: Array[String]): Unit = {
    println(my(fun))
  }
}