package ejercicios

import scala.util.Random
import scala.io.Source

/*
*   While generating a password by selecting random characters generally gives a rela
tivelysecurepassword,italsogenerallygivesapasswordthatisdifficulttomemorize.
 As an alternative, some systems construct a password by taking two English words
 and concatenating them. While this password isn’t as secure, it is much easier to
 memorize.
 Write a program that reads a file containing a list of words, randomly selects two
 of them, and concatenates them to produce a new password. When producing the
 password ensure that the total length is between 8 and 10 characters, and that each
 word used is at least three letters long. Capitalize each word in the password so that
 the user can easily see where one word ends and the next one begins. Display the
 password for the user
 * */
object Ejercicio151 {
  def main(args: Array[String]): Unit = {
    // Leer el archivo de palabras
    val palabras = Source.fromFile("palabras.txt").getLines().toList

    // Filtrar palabras con al menos tres letras
    val palabrasFiltradas = palabras.filter(_.length >= 3)

    // Seleccionar dos palabras al azar
    val random = new Random
    val palabra1 = seleccionarPalabraAleatoria(palabrasFiltradas, random)
    val palabra2 = seleccionarPalabraAleatoria(palabrasFiltradas, random)

    // Concatenar las palabras y convertirlas a mayúsculas
    val contraseña = (palabra1.toUpperCase() + palabra2.toUpperCase()).take(8 + random.nextInt(3))

    println(s"La contraseña generada es: $contraseña")
  }

  def seleccionarPalabraAleatoria(palabras: List[String], random: Random): String = {
    val indice = random.nextInt(palabras.length)
    palabras(indice)
  }
}
