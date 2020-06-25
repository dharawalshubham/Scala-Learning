package Inheritance

// SUBCLASS

class Rectangle(var length : Double , var breath : Double) extends Polygon {
  override def area : Double = length * breath  
    
}