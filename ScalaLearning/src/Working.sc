
import com.practice.hackerrank.Learning


object Working {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  var numbers = List(1,2,3,4)                     //> numbers  : List[Int] = List(1, 2, 3, 4)
  
  val total = numbers.foldRight(10)((c,e) => c+ e)//> total  : Int = 20
  
  val double = numbers.map{ element => element*2} //> double  : List[Int] = List(2, 4, 6, 8)
  // Map is internal iterator
  val learn = new Learning()                      //> learn  : com.practice.hackerrank.Learning = com.practice.hackerrank.Learning
                                                  //| @5f2050f6
  val fruit = learn.listReplication(3 ,List(1,2,3))
                                                  //> fruit  : List[Int] = List(1, 1, 1, 2, 2, 2, 3, 3, 3)
 val recursive = learn.reverseAListRecursively(List(1,2,3,4,5,6))
                                                  //> recursive  : List[Int] = List(6, 5, 4, 3, 2, 1)

	val numericComputation = learn.computequation(List(1,2,3,4) , List(4,5,6,7) , 10)
                                                  //> 4
                                                  //| 10000.0
                                                  //| 200000.0
                                                  //| 3000000.0
                                                  //| 4.0E7
                                                  //| numericComputation  : Double = 4.321E7

}