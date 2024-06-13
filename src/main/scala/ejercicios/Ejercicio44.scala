package ejercicios

import scala.io.StdIn._

/*
*  Writeaprogramthatreadsamonthanddayfromtheuser.Ifthemonthandday
 matchoneof theholidayslistedpreviouslythenyourprogramshoulddisplaythe
 holiday’sname.Otherwiseyourprogramshouldindicatethattheenteredmonthand
 daydonotcorrespondtoafixed-dateholiday
 * */
object Ejercicio44 extends App {
  println("Ingresa la fecha de la cual quieres saber si hay dia festivo o no")
  println("Ejemplo: 1 Enero o 12 Febrero")
  val fecha = readLine().toUpperCase()
  val diaFestivo = fecha match {
    case "1 ENERO" => "Día de año nuevo"
    case "1 JULIO" => "Día de Canada"
    case "25 DICIEMBRE" => "Navidad"
    case _ => "un dia que no hay celebracion oficial."
  }
  println(s"El ${fecha.toLowerCase()} es $diaFestivo")
}
