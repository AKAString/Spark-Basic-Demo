package com.qr.scala.basic

object Block {
  def main(args: Array[String]): Unit = {
    val x= 0
    val result={
      if(x <= 0 ){
        -1
        5
      }else if(x>=1){
        "error"
      }else{
        1
      }
    }
    println(result)
  }
}