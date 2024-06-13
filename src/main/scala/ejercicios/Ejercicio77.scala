package ejercicios

import scala.io.StdIn._

/*
*  Write a program that converts a binary (base 2) number to decimal (base 10). Your
 program should begin by reading the binary number from the user as a string. Then
 it should compute the equivalent decimal number by processing each digit in the
 binary number. Finally, your program should display the equivalent decimal number
 with an appropriate message
 * */
object Ejercicio77 {
  def main(args: Array[String]): Unit = {
    println("Ingrese un número binario (base 2):")
    val numeroBinario = readLine().trim

    // Verificar que el número ingresado sea binario
    if (!esBinario(numeroBinario)) { // Hacemos uso de la funcion es binario combinada con una negacion
      println("Error: El número ingresado no es un número binario válido.")
      return
    }

    // Calcular el número decimal equivalente
    val numeroDecimal = convertirBinarioADecimal(numeroBinario)

    // Mostrar el resultado
    println(s"El número decimal equivalente de $numeroBinario (base 2) es: $numeroDecimal")
  }

  // Función para verificar si una cadena es un número binario válido
  def esBinario(numero: String): Boolean = {
    numero.forall(digito => digito == '0' || digito == '1')
  }

  // Función para convertir un número binario a decimal
  def convertirBinarioADecimal(numeroBinario: String): Int = {
    // Usamos foldLeft para acumular el resultado
    numeroBinario.foldLeft(0)((acumulador, digito) => acumulador * 2 + digito.asDigit)
  }
}