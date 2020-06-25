

object HelloWorld {
  def main(args: Array[String]): Unit = {
    val name = "Shubham"
    val age  = 21
    println(name + " is " + age + " years old" ) // Normal
    println(s"$name is $age years old" )  // s interpolator
    println(f"$name%s is $age%d years old") // f interpolator
    println(raw"hello /n world")   // raw interpolator
  }
}