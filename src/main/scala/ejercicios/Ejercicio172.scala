object RunLengthEncoding {

  // Recursive function to perform run-length compression
  def compress(input: List[Char]): List[Any] = {
    input match {
      case Nil => Nil
      case head :: tail =>
        val (compressed, rest) = tail.span(_ == head)
        (head, compressed.length + 1) :: compress(rest)
    }
  }

  // Overloaded function for compressing a string
  def compress(input: String): List[Any] = compress(input.toList)

  def main(args: Array[String]): Unit = {
    println("Enter a string to compress:")
    val inputString = scala.io.StdIn.readLine().trim

    val compressedList = compress(inputString)

    println("Run-length encoded result:")
    println(compressedList)
  }
}
