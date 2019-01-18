package com.qr.scala.basic

import scala.collection.mutable.ArrayBuffer



object Array {
  def main(args: Array[String]): Unit = {
    val ab = ArrayBuffer[Int]()
    ab += 1
    ab += (2,34,5)
   //ab += Array(6,4)
    println(ab)
  }
}