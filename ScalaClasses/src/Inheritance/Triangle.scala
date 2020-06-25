package Inheritance

// SUB CLASS

class Triangle(var height : Double , var breath : Double) extends Polygon {
  override def area : Double = height * breath / 2
}