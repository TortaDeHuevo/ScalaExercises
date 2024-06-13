package ejercicios
import scala.io.StdIn._
/*
* Write a function named reverseLookup that finds all of the keys in a dictionary
 that map to a specific value. The function will take the dictionary and the value to
 search for as its only parameters. It will return a (possibly empty) list of keys from
 the dictionary that map to the provided value.
 Include a main program that demonstrates thereverseLookup function as part
 of your solution to this exercise. Your program should create a dictionary and then
 show that the reverseLookup function works correctly when it returns multiple
 keys, a single key, and no keys. Ensure that your main program only runs when
 the file containing your solution to this exercise has not been imported into another
 program*/
object Ejercicio128 extends App {
  // Crear un diccionario de ejemplo
  val diccionario = Map("a" -> 1, "b" -> 2, "c" -> 3, "d" -> 2)

  // Mostrar el diccionario
  println("Diccionario:")
  diccionario.foreach(println)

  // Buscar claves para un valor específico
  println("Ingresa el valor del cual quieres saber las key asociadas:")
  val valorBuscar = readInt()
  val clavesEncontradas = busquedaInversa(diccionario, valorBuscar)

  // Mostrar el resultado de la búsqueda
  println(s"\nClaves para el valor $valorBuscar:")
  if (clavesEncontradas.isEmpty) {
    println("No se encontraron claves para este valor.")
  } else {
    clavesEncontradas.foreach(println)
  }
}

def busquedaInversa(diccionario: Map[String, Int], valor: Int): List[String] = {
  diccionario.filter { case (_, v) => v == valor }.keys.toList
}
