package com.qr.scala.basic

object MyInvoke {
  
  def Demo1(){
    def m1(f:(Int,Int)=>Int):Int = {
    f(2,6)
  }
  val f1 = (x:Int,y:Int) => x+y
  
  val f2 = (m:Int,n:Int) => m*n
  
  println(m1(f1))
   println(m1(f2))
  }
  
  def Demo2(){
    def aa(a:Int)={
      2
    }
    val f=aa _
    
    println(f(3))
  }
  
  def main(args: Array[String]): Unit = {
    //Demo1()
    Demo2()
  }
}