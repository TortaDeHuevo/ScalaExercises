package ejercicios

import scala.io.StdIn._

/*
*  In this exercise you will create a program that computes the average of a collection
 of values entered by the user. The user will enter 0 as a sentinel value to indicate
 that no further values will be provided. Your program should display an appropriate
 error message if the first value entered by the user is 0
 * */
object Ejercicio61 {
  def main(args: Array[String]): Unit = {
    println("Ingrese los valores para calcular el promedio (ingrese 0 para terminar):")

    var suma = 0.0 // Acumula la suma de los valores ingresados
    var cantidad = 0 // Cuenta los valores validos que se han ingresado

    var valor = readInt()

    // Manejo especial si el primer valor ingresado es 0
    if (valor == 0) {
      println("Error: El primer valor no puede ser 0.")
      return
    }

    // Lee los valores hasta que se ingrese 0
    while (valor != 0) {
      suma += valor //Se realiza la suma en asignacion
      cantidad += 1
      valor = readInt()
    }

    // Calcular el promedio si se ingresaron valores válidos
    val promedio = suma / cantidad
    println(s"El promedio de los valores ingresados es: $promedio")

  }
}