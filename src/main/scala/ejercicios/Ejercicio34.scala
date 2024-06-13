package ejercicios

import scala.io.StdIn._

/*
*  Write a program that reads an integer from the user. Then your program should
 display a message indicating whether the integer is even or odd.
 * */
object Ejercicio34 extends App {
  print("Ingresa un numero entero: ")
  val num = readInt()
  if (num % 2 == 0) {
    println(s"El numero $num es par")
  } else {
    println(s"El numero $num es impar")
  }
}
