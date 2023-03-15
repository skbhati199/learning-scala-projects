import scala.util.control.Breaks

object Main {
  def main(args: Array[String]): Unit = {
//    println("Hello world!")

    var a = 0
    var b = 0
    var numList = List(12,121,12,1212,1233425)
    var numList2 = List(11,22,33,44)
    val loop = new Breaks;
    val inner  = new Breaks
    loop.breakable{
      for (a <- numList){
        println("Value of a is " + a)

        inner.breakable{
          for (b <- numList2){
            for (b <- numList2){
              println("Value of b is " + a)
              if (b == 22){
                inner.break()
              }
            }
          }
        }
      }
    }
  }
}