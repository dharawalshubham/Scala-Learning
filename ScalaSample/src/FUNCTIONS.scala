// FUNCTIONS IN SCALA.
// scala is a very flexible language as it allows us to declare
// funtions in various ways .

object FUNCTIONS {
  object Math { 
    def add(x: Int, y: Int): Int = {
      return x + y
      
    }
    def square(x : Int) = x*x  // We can apply Syntactical Sugar.
  }

  def subt(x: Int, y: Int): Int = {
    x - y
  }

  def multiply(x: Int, y: Int): Int = x * y

  def div(x: Double, y: Double) = x / y

  def main(args: Array[String]) {
    println("Addion is = " + Math.add(45,50))
    println( Math square 5) // Syntactical Sugar
    println("subtraction of given input is = " + subt(45, 50))
    println("multiplication of given input is = " + multiply(45, 50))
    println("division of given input is = " + div(45, 50))
  }
}