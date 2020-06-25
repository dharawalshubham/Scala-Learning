
// TUPLES in scala

// A tuple is a neat class that gives you a simple way to store heterogeneous
// (different) items in the same container.
// Scala tuples can contain between two and 22 items, and they’re
// useful for those times when you just need to combine a few things
// together
// Technically, Scala 2.x tuples aren’t collections classes, they’re
// just a convenient little container. Because they aren’t a
// collection, they don’t have methods like map, filter, etc.
// Tuples are also immutable
// Tuple4 because it contains 4 elements . Same for Tuple5
 // Upto Tuple22 is possible

object Tuples {
  val mytuple = (10, 2.34, "hello", true)
  val mytuple2 = new Tuple4(10, 2.34, "hello", true)
  val mytuple3 = new Tuple6(10, 2.34, "hello", true,"world",(2,3))
  def main(args: Array[String]) {
    println(mytuple)
    println(mytuple._1) // to access 1st element
    println(mytuple._2)
    println(mytuple3._6) // tuple in side tuple
    println(mytuple3._6._1) // fetching value inside tuple
    
    // Iterating Over Tuples
    mytuple.productIterator.foreach{
      i => println(i)
        
    }
  }
}