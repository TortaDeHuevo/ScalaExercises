package ejercicios

import scala.io.StdIn._

/*
*  Writeaprogramthatreadsawavelengthfromtheuserandreportsitscolor.Display
 an appropriate error message if the wavelength entered by the user is outside of the
 visible spectrum.
 Exercise 55:Frequency
 * */
object Ejercicio54 extends App {
  print("Ingresa la longitud de ondas en nanometros(nm)de la que quieres saber el color: ")
  val wl = readInt
  val color = wl match {
    case wl if 380 to 449 contains wl => "Violeta"
    case wl if 450 to 494 contains wl => "Azul"
    case wl if 495 to 569 contains wl => "Verde"
    case wl if 570 to 589 contains wl => "Amarillo"
    case wl if 590 to 619 contains wl => "Naranja"
    case wl if 620 to 750 contains wl => "Red"
    case _ => "Esa longitud de onda no se encuentra dentro de el rango"
  }
  print(color)
}
