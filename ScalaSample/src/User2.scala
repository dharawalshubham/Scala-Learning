
// AUXILARY CONTRUCTER - Alternative constructer
// you can define auxilary constructer as a method in the class with the 
// name "this" . Auxilary Constructer have always name "this" .
// Conditions with Auxilary Contructer -
// 1st - So a class can have many auxilary contructer but the all should
// have diffrent signature .
// 2nd - they must call the previously defined function 

class UserTwo(var name : String,var age:Int){
  def this(){
     this("Tom",32) // calling previous constructer and passing parameters.
  }
  def this(name : String){ // defining one more constructer with only one parameter
    this(name,32) // again calling previous constructer
  }
}

object User2 {
  def main(args: Array[String]){
    var user1 = new UserTwo("Shubham",22) // creating 1st instance
    var user2 = new UserTwo() // 2nd
    var user3 = new UserTwo("Shubham") // 3rd
  }
}