
// The Map class documentation describes a Map as an iterable sequence
// that consists of pairs of keys and values.
// Scala has both mutable and immutable Map classes.
// Creating a mutable Map
// To use the mutable Map class, first import it:
// collection of key-value pair
// muttable and immutable

//import scala.collection.mutable.Map // to use muttable map

object MAPclass {
  val states : Map[Int,String]= Map(
    123 -> "Alaska",
    456 -> "Illinois",
    789 -> "Kentucky"
  )
  def main(args: Array[String]){
     println(states)
  } 
}