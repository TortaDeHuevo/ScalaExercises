package ejercicios
import scala.io.StdIn._
object Ejercicio113 extends App {
  println("Ingrese elementos separados por comas:")
  val entrada = readLine() // Leemos la entrada del usuario
  val elementos = entrada.split(",").map(_.trim).toList // Convertimos la entrada en una lista de elementos

  val listaFormateada = formatearLista(elementos) // Llamamos a la función para formatear la lista
  println("Lista formateada: " + listaFormateada) // Mostramos la lista formateada
}

def formatearLista(lista: List[String]): String = {
  lista match {
    case Nil => "" // Si la lista está vacía, devuelve una cadena vacía
    case x :: Nil => x // Si la lista contiene un solo elemento, devuelve ese elemento
    case x :: y :: Nil => s"$x y $y" // Si la lista contiene dos elementos, los une con "y"
    case _ => lista.init.mkString(", ") + s" y ${lista.last}" // Para más de dos elementos, une todos los elementos con comas, excepto el último que se une con "y"
  }
}