

object ForLOOP {
  def main(args: Array[String]) {
    for (i <- 1 to 5) { //syntax is for(var i <- range) // "to" is a method
      println("i is " + i) // statement
    }
    for (i <- 1.until(6)) { // not including the end.
      println(i)
    }

    // GIVING MULTIPLE RANGES IN FOR LOOP
    for (i <- 1.to(3); j <- 1.to(3)) {
      println("i is " + i + " j is " + j)
    }
    // ITERATING OVER A LIST USING FOR LOOP.
    var lst = List(1,2,3,4,56)
    for(i <- lst){
      println("Print Lst " + i)
    }
    
    // FILTERING DESIRED OUTPUT FROM LST
    var lst2 = List(1,2,3,4,5,6,7,8,9,10)
    for(i <- lst2 ; if i%2==0){
      println("EVEN numbers are " + i)
    }
  }

}             