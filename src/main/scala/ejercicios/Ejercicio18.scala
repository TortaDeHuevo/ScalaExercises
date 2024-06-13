package ejercicios

import scala.io.StdIn._

/*
 * The volume of a cylinder can be computed by multiplying the area of its circular
 * base by its height. Write a program that reads the radius of the cylinder, along with
 * its height, from the user and computes its volume. Display the result rounded to one
 * decimal place.
 */

object Ejercicio18 extends App {
  print("Ingresa el radio del cilindro: ")
  val r = readFloat()
  println()
  print("Ingresa la altura de tu cilindro: ")
  val h = readFloat()
  var res = volumeOfCylinder(r, h)
  res = BigDecimal(res).setScale(1, BigDecimal.RoundingMode.HALF_UP).toDouble //Redondea un numero a un cierto numero de cifras
  println(s"El volumen del cilindro es: $res")
}

def volumeOfCylinder(r: Float, h: Float, pi: Double = Math.PI): Double = { //Creamos una funcion que calcula el volumen del cilindro
  r * r * pi * h
}
