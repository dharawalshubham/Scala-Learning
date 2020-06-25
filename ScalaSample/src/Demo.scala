// SCALA IF ELSE

object Demo {
  def main(args: Array[String]) {
    val age = 18
    if (age == 18) {
      println("True")
    } else {
      println("False")
    }
    
    // Can be done by this way also
    
    val response = if(age == 18)"True" else"False"
      println(response)
     
    // Can be done by this way also
      println(if(age == 18)"True" else"False")
      
  }
}