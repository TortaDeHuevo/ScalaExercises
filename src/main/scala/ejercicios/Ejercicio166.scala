package ejercicios
/*
*In Exercise 78 you wrote a program that used a loop to convert a decimal number
 to its binary representation. In this exercise you will perform the same task using
 recursion.
 Write a recursive function that converts a non-negative decimal number to binary.
 Treat 0 and 1 as base cases which return a string containing the appropriate digit. For
 all other positive integers, n, you should compute the next digit using the remainder
 operator and then make a recursive call to compute the digits of n // 2. Finally, you
 should concatenate the result of the recursive call (which will be a string) and the
 next digit (which you will need to convert to a string) and return this string as the
 result of the function.
 Write a main program that uses your recursive function to convert a non-negative
 integer entered by the user from decimal to binary. Your program should display an
 appropriate error message if the user enters a negative value.
 * */
object Ejercicio166 extends App {
  println("Ingrese un número decimal no negativo:")
  val decimal = scala.io.StdIn.readInt()

  if (decimal >= 0) {
    val binario = convertirABinario(decimal)
    println(s"El número binario correspondiente es: $binario")
  } else {
    println("Error: Por favor, ingrese un número decimal no negativo.")
  }
}

def convertirABinario(decimal: Int): String = {
  if (decimal == 0) {
    "0"
  } else if (decimal == 1) {
    "1"
  } else {
    convertirABinario(decimal / 2) + (decimal % 2).toString
  }
}
