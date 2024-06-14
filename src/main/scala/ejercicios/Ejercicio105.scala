package ejercicios

import scala.collection.mutable.ListBuffer
import scala.io.StdIn._

/*
*  Write a program that reads integers from the user and stores them in a list. Use 0 as
 a sentinel value to mark the end of the input. Once all of the values have been read
 your program should display them (except for the 0) in reverse order, with one value
 appearing on each line.
 * */
object Ejercicio105 extends App {
  val numeros = ListBuffer[Int]() // Creamos una lista mutable para almacenar los números
  var num = -1 // Inicializamos num con un valor diferente de 0 para poder ingresar al bucle

  // Leer números hasta que se ingrese 0
  while (num != 0) {
    println("Ingrese un número entero (0 para terminar): ")
    num = readInt()
    if (num != 0) {
      numeros += num // Agregar el número a la lista con el operador de asignacion
    }
  }

  // Imprimir los números en orden inverso
  println("Los números ingresados en orden inverso son:")
  for (i <- numeros.reverse) { //Aplicamos el metodo reverse para ordenar los elementos de forma inversa.
    print(s"$i, ")
  }
}
