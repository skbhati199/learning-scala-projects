object Main {

  // Example 1
  private def printString(args: String*): Unit = {
    var i: Int = 0
    for (arg <- args) {
      println("Arg Value [ " + i + " ] = " + arg)
      i = i + 1
    }
  }

  def factorial(n: BigInt): BigInt = {
    if (n <= 1) {
      1
    } else {
      n * factorial(n - 1)
    }
  }

  def main(args: Array[String]): Unit = {
    // Example 1
    //    printString("Hello world!", "Java", "Scala")

    for (i <- 1 to 10) {
      println("Factorial of " + i + " : = " + factorial(i))
    }
  }
}