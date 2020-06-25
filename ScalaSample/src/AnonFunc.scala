
// Anonymous functions and Default value and More

object AnonFunc {
  // you can use operator as a function also # cool feature
  object Math {
    def +(x: Int, y: Int) = x + y
    def **(x: Int) = x
  }

  def main(args: Array[String]) {
    // IN SCALA FUNCTIONS ARE TREATED AS FIRST CLASS CITIZENS SO
    // WE CAN ASSIGN A FUNCTION TO A VARIABLE AND THIS WE CAN DO
    // USING "ANONYMOUS FUNCTIONS"
    val add = (x: Int, y: Int) => x + y
    println(add(300,500))
    println(Math.+(23, 23))
    println(Math ** 3)
  }
}