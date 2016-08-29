

package com.practice.hackerrank/**

import scala.annotation.tailrec

import scala.annotation.tailrec
 * @author Lalit
 */
class Learning(){

	//Given a list, repeat each element in the list amount of times.
	def listReplication(num:Int,arr:List[Int]):List[Int] = {
			var red : List[Int] = Nil
					var i=0
					for(i <- arr.iterator){            
						red = red ::: List.fill(num)(i)
					}
	red
	}

	def listReplication1(num:Int,arr:List[Int]):List[Int] = {
			arr.flatMap(x => List.fill(num)(x))    
	}

	// Filter a given array of integers and output only those values that are less than a specified value .
	def filterList(delim:Int,arr:List[Int]):List[Int] =  arr.filter( _ < delim )

			def filterList1(delim:Int,arr:List[Int]):List[Int] = {
		var red : List[Int] = Nil
				for(i <- arr.iterator){
					if(i < delim){
						red = i :: red
					}
				}
	red.reverse
	}

	//Reverse a list
	def reverseAListRecursively[A](l: List[A]) : List[A] = 
			l match{
			case h::tail => reverseAListRecursively(tail) ::: List(h)
			case _ => Nil
	}
// Tail Recursive method
   def reverse[A](l: List[A]): List[A] = {
			def _reverse(res: List[A], rem: List[A]): List[A] = rem match {
			case Nil => res
			case h :: tail => _reverse(h :: res, tail)
			}
			_reverse(Nil, l)
	}
   
   // Compute Equation
   def computequation(coefficients:List[Int],powers:List[Int],x:Double):Double =
   {
     def numerics = 
     for{
         (pow , coeff) <- ( powers zip coefficients)
     } yield coeff * scala.math.pow(x,pow)
     
     println(numerics.size)
     numerics.foreach { println }
     numerics.sum
      //Fill Up this function body
        // To compute the value of the function
        // For the given coefficients, powers and value of x
   }
   def isEven(number: Int) = number % 2 == 0
  
   def isOdd(number: Int) = !isEven(number)
  
   def sumOfOddElements(arr : List[Int]) : Int = arr.filter(isOdd).sum

}
