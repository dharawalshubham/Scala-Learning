
// SCALA CLASSES
// private can only be access inside of a class
// ------   getter    setter(you cannot set the value)
//   var      yes       yes
//   val      yes       no
//  default   no       no
// The "constructer" you define with the class is a primary class  

class User(private var name: String, val age: Int){
  def printName{
    println(name)
  }
}

object Classes {
  def main(args: Array[String]) {
    var user = new User("Shubham", 21) // Instance out of the class
    user.printName // accessing name variable
    println(user.age) // accessing age variable
    

  }
}
