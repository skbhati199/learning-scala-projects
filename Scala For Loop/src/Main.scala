object Main {
  def main(args: Array[String]): Unit = {
//    println("Hello world!")

    var a = 0
    var b= 0
    for (a <- -1 to 3 ; b <- -1 to 3) {
      println("Value of a is " + a)
      println("Value of b is " + b)
    }
  }
}