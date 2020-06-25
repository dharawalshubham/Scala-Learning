
// PARTIALLY APPLIED FUNCTIONS

object PAF {
  def main(args: Array[String]){
    val sum = (x:Int,y:Int,z:Int) => x + y + z // this is fully applied function
    println(sum(2,3,4))  // passes all 3 arguments.
  }
}