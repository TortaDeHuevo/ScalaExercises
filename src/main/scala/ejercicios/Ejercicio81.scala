package ejercicios

import scala.io.StdIn._
import scala.math.sqrt

/*
* Write a function that takes the lengths of the two shorter sides of a right triangle as
 its parameters. Return the hypotenuse of the triangle, computed using Pythagorean
 theorem, as the function’s result. Include a main program that reads the lengths of
 the shorter sides of a right triangle from the user, uses your function to compute the
 length of the hypotenuse, and displays the result
 * */
object Ejercicio81 {

  def main(args: Array[String]): Unit = {
    println("Ingrese la longitud del lado más corto 1 del triángulo rectángulo:")
    val lado1 = readLine().toDouble

    println("Ingrese la longitud del lado más corto 2 del triángulo rectángulo:")
    val lado2 = readLine().toDouble

    val hipotenusa = calcularHipotenusa(lado1, lado2)
    println(s"La longitud de la hipotenusa es: $hipotenusa")
  }

  // Definición de la función para calcular la hipotenusa
  def calcularHipotenusa(lado1: Double, lado2: Double): Double = {
    sqrt(lado1 * lado1 + lado2 * lado2) //Sacamos la operacion inversa de c² que es la raiz cuadrada ya que la formula es a²+b²=c²
  }
}