class Location(override val xc:Int , override val yc:Int, zc:Int) extends Point(xc,yc){
  var z : Int = zc

  def move(dx: Int, dy: Int, zy:Int): Unit = {
    x = x + dx
    y = y + dy
    z = z + zy
    println("Point x location : " + x)
    println("Point y location : " + y)
    println("Point z location : " + z)
  }

}
