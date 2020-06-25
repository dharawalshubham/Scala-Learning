

object WhileDowhile {
  def main(args: Array[String]){
    var x = 0
    while(x < 10){   // Execute until this becomes false
      println(" x is " + x)
      x+=1
    }
    var y = 0
    do{
      println("y is " + y)
      y+=1
    }while(y < 10)
  }
}