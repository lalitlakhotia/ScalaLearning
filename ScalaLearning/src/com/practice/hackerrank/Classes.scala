package com.practice.hackerrank

/**
 * @author Lalit
 */
object Classes {
  def main(args: Array[String]) {
  val learn = new Learning()
   val red = learn.listReplication(3, List(1,4,3))
  // red.foreach(println)
   
   val red1 = learn.listReplication1(3, List(1,4,3))
 //  red1.foreach(println)
   
    val res = learn.filterList1(3, List(1,-42,4,3,-42))
   res.foreach(println)
  }
}