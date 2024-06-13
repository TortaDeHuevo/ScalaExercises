package ejercicios

import scala.io.StdIn._

/*
*The area of a triangle can be computed using the following formula, where b is the
 length of the base of the triangle, and h is its height:
 area = (b×h)/2
 Write a program that allows the user to enter values for b and h. The program
 shouldthencomputeanddisplaytheareaofatrianglewithbaselengthbandheighth*/
object Ejercicio21 extends App {
  print("Ingresa la base del triangulo: ")
  val b = readFloat()
  println()
  print("Ingresa la altura del triangulo: ")
  val h = readFloat()
  val r = (b * h) / 2
  println(s"El area de tu triangulo es de: $r")
}
