
// map, flatMap, flatten and filter.

// map() is a higher order function.
// Every collection object has the map() method.
// map() takes some function as a parameter.
// map() applies the function to every element of the source collection.
// map() returns a new collection of the same type as the source collection.
// simple we use map() to iterate over collection
// ___________________________________________________________________________
// The flatten method will collapse the elements of a collection to create 
// a single collection with elements of the same type
// The flatten function is applicable to both Scala's
// Mutable and Immutable collection data structures.
// ________________________________________________________________________
// In Scala, flatMap() method is identical to the map() method, but the only
// difference is that in flatMap the inner grouping of an item is removed
// and a sequence is generated. It can be defined as a blend of map method
// and flatten method. 


object HighOrderMethod {
  val list1 = List(1, 2, 3, 4)
  val maps: Map[Int, String] = Map(123 -> "AAA", 567 -> "BBB")
  val lists2 = List(List(1,2,3),List(4,5,6))
  val name = Seq("Nidhi", "Singh")
  def main(args: Array[String]) {
    // USING map
    println(list1.map(_ * 2))  // will give a new list
    println(list1.map(x => x*2))
    println(list1.map(x => "HEY " + x))
    println(list1.map(x => "HEY " * x))
    println(maps.map(x => "HEY " + x))
    println(maps.mapValues(x => "HEY " + x))
    println("hello".map(_.toUpper))
    // USING flatten()
    println(lists2.flatten)  // merged
    
    // USING flatmap()
    // Applying map() then flatten() then combine( flatmap() )

    val result1 = name.map(_.toLowerCase) // Output = List(nidhi, singh)
    val result2 = result1.flatten  // Output = List(n,i,d,h,i,s,i,n,g,h)
    
    // let’s apply flatMap() directly on the given sequence.
    val result3 = name.flatMap(_.toLowerCase) // List(n,i,d,h,i,s,i,n,g,h)    
    
  }
}