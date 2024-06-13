package ejercicios

import scala.io.StdIn._

/*
* Write a program that asks the user to enter the width and length of a room. Once
 the values have been read, your program should compute and display the area of the
 room. The length and the width will be entered as floating point numbers. Include
 units in your prompt and output message; either feet or meters, depending on which
 unit you are more comfortable working with.
*/
object Ejercicio3 extends App {
  println("Hola bienvenido!")
  print("Por favor ingresa el ancho de la habitacion en metros: ")
  val ancho = readFloat()
  println()
  print("Ingresa el largo de la habitacion en metros: ")
  val largo = readFloat()
  println()
  val res = ancho * largo
  println(s"El area de la habitacion es de $res metros") //Hacemos uso de la interpolacion de cadenas
}
