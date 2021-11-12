package lectures.part2oop

import scala.language.postfixOps

object MethodNotations extends App {

  class Person(val name:String, favoriteMovie: String, val age: Int = 0){

    def likes(movie:String):Boolean = movie ==favoriteMovie
    def +(person: Person):String = s"${this.name} is hanging out with ${person.name}"
    def +(nickName:String) : Person= new Person(s"$name ($nickName)",favoriteMovie)

    //putting space between column and method name is important. With no space compiler thins def name is with column
    def unary_! : String = s"$name, what the heck?"
    def unary_+ : Person = new Person(name, favoriteMovie, age+1)
    def isAlive: Boolean = true
    def learns(thing: String) = s"$name is learning $thing"
    def learnsScala = this learns "Scala"

    def apply(): String = s"Hi, my name is $name and I like $favoriteMovie"
    def apply(n: Int): String=s"$name watched $favoriteMovie $n times."

  }


  val mary = new Person("Mary","Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception")//equivalent
  //infix notation = operator notation (syntactic sugar)

  //"operators" in Scala
  val tom = new Person("Tom", "Fight Club")
  println(mary + tom)
  println(mary.+(tom))

  //All Operators are methods
  //AKKA actors have ! ?

  //PREFIX NOTATION
  // val x = -1 //equivalent with 1.unary_-
  val y = 1.unary_-
  //unary_ prefix only works with - + ~ !

  println(!mary)
  println(mary.unary_!)

  //POSTFIX NOTATION

  //postfix notation only available for method without parameter
  println(mary.isAlive)
  println(mary isAlive)


  //APPLY
  println(mary.apply())
  println(mary()) //equivalent

  /*
  1. Overload the + operator
      mary+"the rockstar" => new person "Mary(the rockstar)"
  2. Add an age to the Person class
      Add a unary + operator=> new person with the age + 1
      +mary => mary with the age incrementer
  3. Add a "learnes" method in the Person class=> "Mary learn Scala"
      Add a learnsScala method, calls learns method with Scala
      Use it in postfix notation
  4. Overload the apply method
      mary.apply(2) => "Marry watched Inception 2 times"

   */

  println((mary+ "rockstar")())
  println((mary+ "rockstar").apply())

  println((+mary).age)
  println(mary learnsScala)
  println(mary(10))
}
