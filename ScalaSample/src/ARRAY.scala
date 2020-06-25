
// ARRAYS in scala
import Array._

object ARRAY {
  val myarray: Array[Int] = new Array[Int](4) // index starts from 0
  val myarray2 = new Array[String](5)
  val myarray3 = Array(1,2,3,4,5,6)
  def main(args: Array[String]) {
    myarray(0) = 20
    myarray(1) = 40
    myarray(2) = 50
    myarray(3) = 60
    myarray2(0) = "My"
    myarray2(1) = "name"
    myarray2(2) = "is"
    myarray2(3) = "God"
    myarray2(4) = "son" 
    println(myarray)
    println(myarray2)
    println(myarray3)
    val result = concat(myarray , myarray3) // this will give error until you import
                                // array library
    for(x <- result){
      println(x)
    }
    for(z <- myarray3){
      println(z)
    }
    for(j <- myarray2){
      println(j)
    }
    for (i <- myarray) {
    println(i)
    }
  }
}