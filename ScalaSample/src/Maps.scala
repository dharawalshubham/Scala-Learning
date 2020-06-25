
// The Map class documentation describes a Map as an iterable sequence
// that consists of pairs of keys and values.
// Scala has both mutable and immutable Map classes.
// Creating a mutable Map
// To use the mutable Map class, first import it:
// collection of key-value pair
// muttable and immutable
// duplication not possible

object Maps {
  val school: Map[Int, String] =
    Map(123 -> "Shubham",
        456 -> "Dharawal")
  val states: Map[Int, String] = Map(
    999 -> "Alaska",
    888 -> "Illinois",
    908 -> "Kentucky")
  def main(args: Array[String]) {
    println(school)
    println(school(123))
    println(school.keys)
    // iterating over map
    for (i <- school) {
      print(i)
    }
    // iterating over map part 2
    school.keys.foreach { i =>
      println("keys " + i) // print key
      println("values " + school.keys) // print values
      println(school.contains(123)) // checking present or not
      
      // concatinating 2 map
      println(school ++ states)
    }
  }
}