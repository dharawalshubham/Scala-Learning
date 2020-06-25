package Inheritance

// THIS IS A SUPER CLASS

class Polygon {
  def area : Double = 0.0  // default value of the area
}

object Polygon{
  def main(args: Array[String]){
    var poly = new Polygon
    var rect = new Rectangle(55.2,20.0)
    var tri  = new Triangle(20,60)
    printArea(rect)
    printArea(tri)
  }
  def printArea(p:Polygon){
    println(p.area)
  }
}