package ejercicios

import scala.util.{Try, Success, Failure}

/*
*  Create a program that sums all of the numbers entered by the user while ignoring
 any lines entered by the user that are not valid numbers. Your program should dis
play the current sum after each number is entered. It should display an appropriate
 error message after any invalid input, and then continue to sum any additional num
bers entered by the user. Your program should exit when the user enters a blank
 line. Ensure that your program works correctly for both integers and floating point
 numbers.*/

object Ejercicio144 extends App {
  var suma = 0.0

  println("Ingrese números para sumar (deje en blanco para terminar):")
  var entrada = scala.io.StdIn.readLine()

  while (entrada != "") {
    Try(entrada.toDouble) match {
      case Success(numero) =>
        suma += numero
      case Failure(_) =>
        println("Error: Entrada no válida. Por favor, ingrese un número válido.")
    }

    entrada = scala.io.StdIn.readLine()
  }

  println(s"La suma total es: $suma")
}
