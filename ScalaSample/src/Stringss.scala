

object Stringss {
  var num1 = 75
  var num2 = 67.67
  val str1: String = "Hello"
  val str2: String = " Shubham"
  def main(args: Array[String]) {
    println(str1)
    println(str1.concat(str2))
    println(str1 + str2)
    print("(%d -- %f -- %s -- %s)".format(num1, num2, str1, str2))
  }
}