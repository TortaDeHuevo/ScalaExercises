package ejercicios
import scala.io.StdIn._
/*
*  In this exercise you will create a function named nextPrime that finds and returns
 the first prime number larger than some integer, n. The value of n will be passed to
 the function as its only parameter. Include a main program that reads an integer from
 the user and displays the first prime number larger than the entered value. Import
 and use your solution to Exercise 92 while completing this exercise
 * */
object Ejercicio93 extends App {
  println("Ingrese un número entero:")
  val numero = readInt()

  val siguientePrimo = nextPrime(numero)
  println(s"El primer número primo mayor que $numero es: $siguientePrimo")
}

// Función para verificar si un número es primo
def esPrimo(num: Int): Boolean = {
  if (num <= 1) {
    false
  } else if (num == 2) {
    true
  } else { //Esta opcion es para numeros que son mayores a 2
    !(2 until num).exists(x => num % x == 0) //El until define un rango excluyendo el ultimo numero
    /*
    * Creamos un rango y despues hacemos uso de una funcion anonima que nos permite recibir un
    * parametro x tal que num % x == 0, si la condicion se cumple entonces retorna True, finalmente
    negamos el resultado ya que esa condicion verificaria si el numero es par.
     */
  }
}

// Función para encontrar el siguiente número primo mayor que n
def nextPrime(n: Int): Int = {
  var next = n + 1 // Aqui aseguramos que el numero ingresado si es primo no se evalue en el ciclo debajo
  while (!esPrimo(next)) {
    next += 1
  }
  next //Valor final
}