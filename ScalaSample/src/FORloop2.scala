
 // FOR LOOP AS AN EXPRESSION.

object FORloop2 {
  def main(args: Array[String]){
    val lst = List(1,2,3,4,5,6,7)
    val result = for{i <- lst}yield{
      i*i
    }
    println(result)
  }
}


// In scala unline python and ruby , yield is part of for comprehensions.