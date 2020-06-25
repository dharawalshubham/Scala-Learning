
// Scala - HIGHER ORDER FUNCTIONS
// Are those which can take functions as arguments and can return
// function as a result.

object HighOrder {
  def math(x:Double,y:Double,z:Double,f:(Double,Double,Double)=>Double):Double = f(x,y,z)
  def math2(x:Double,y:Double,z:Double,f:(Double,Double)=>Double):Double = f(f(x,y),z)
  def main(args: Array[String]){
    val result = math(30,40,60,(x,y,z)=>x min y min z)
    val result2 = math2(30,40,60,(x,y)=>x min y) // In this you can use a wild card to
    // make your code short. math2(30,40,60,_ min _)
    println(result)
    println(result2)
  }
}