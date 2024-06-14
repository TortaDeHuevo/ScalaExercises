package ejercicios
/*
* Create a program that determines and displays the number of unique characters in a
 string entered by the user. For example, Hello, World! has 10 unique characters
 while zzz has only one unique character.Use a dictionary or set to solve this problem.
 * */
object Ejercicio134 {
  def main(args: Array[String]): Unit = {
    println("Ingrese una cadena:")
    val cadena = scala.io.StdIn.readLine().toLowerCase()

    val caracteresUnicos = contarCaracteresUnicos(cadena)

    println(s"La cadena '$cadena' tiene ${caracteresUnicos.size} caracteres únicos:")
    caracteresUnicos.foreach { case (caracter, count) =>
      println(s"'$caracter': $count")
    }
  }

  def contarCaracteresUnicos(cadena: String): Map[Char, Int] = {
    var contadorCaracteres = Map[Char, Int]()

    for (caracter <- cadena.filter(_.isLetterOrDigit)) {
      contadorCaracteres += (caracter -> (contadorCaracteres.getOrElse(caracter, 0) + 1))
    }

    contadorCaracteres
  }
}