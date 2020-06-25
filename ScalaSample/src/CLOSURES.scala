// A closure is a function, whose return value depends on the value
// of one or more variables declared outside this function.

object CLOSURES {
  var number = 10
  val add = (x:Int)=>{
    number= x + number
    number
  }
  def main(args: Array[String]){
    number = 100
    println(add(30))
    print(number)
  }
}


// impure closure are "var"
// pure closure uses "val" that is value cannot be changed.