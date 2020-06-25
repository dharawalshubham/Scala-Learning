// Reduce:  Reduce function is applied on collection data structure in scala
// that contains lists, sets, maps, sequence and tuples. Parameter in the 
// reduce function is a binary operation which merges all the elements from
// the collection and returns a single value.. The first two values is
// combined with the binary operation and the resultant of that operation 
// combines with the next value of the collection and atlast we obtain a
// single value.
// Reduce can only return the value of the same type .
//--------------------------------------------------------------------------

// Fold : Same as Reduce . BUT , fold allows us to define an initial value
//  fold can also manage empty collections.If the collection is empty, 
// the value initialized becomes the final answer
//  we can also return a different value from the set of collection
// using initial value of some other datatype. 
// ------------------------------------------------------------------------
 
// Scan : Scan function takes the binary operation as parameter and returns
// the value for each element in collection for that operation. It returns
// each iteration for that binary operator in the collection. In scan also
// we can define the initial value.


object  ReduceFoldScan {
  // Scala program sum of elements , minimum and maximum  
  // using reduce function  
  val seq_elements: Seq[Double] = Seq(3.5, 5.0, 1.5) 
  def main(args: Array[String]){
    val sum: Double = seq_elements.reduce((a, b) => a + b) 
    println(sum)
    val maximum : Double = seq_elements.reduce(_ max _) 
    println(s"Maximum element = $maximum") 
    val minimum : Double = seq_elements.reduce(_ min _)
    println(s"Minimum element = $minimum") 
    // USING FOLD
    val sum2: Double = seq_elements.fold(0.0)((a, b) => a + b)// initial = 0.0
        println(s"Sum of elements = $sum2") 
        
    // concatenate string
    
    val str_elements: Seq[String] = Seq("hello","hello", "For", "hello") 
    val concat: String = str_elements.fold("")((a, b) => a + " " + b) 
     println(s"After concatenation = $concat") 
     
    //  using scan
     
      val numbers: Seq[Int] = Seq(4, 2, 1, 6, 9)
    
      val iterations: Seq[Int] = numbers.scan(0)(_ + _) 
       println("Running total of all elements" + s"in the collection = $iterations") 
  }
}