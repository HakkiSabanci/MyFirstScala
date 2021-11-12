package lectures.part2oop

case object Objects extends App{

  //SCALA DOES NOT HAVE CLASS-LEVEL FUNCTIONALITY ("static")

  object Person{ //type + its only instance
    //"static"/"class" - level functionality
    val N_EYES = 2
    def canFly: Boolean = false

    //factory method
    def apply(mother: Person, father: Person): Person = new Person("Bobby")
  }
  class Person(val name: String){
    //instance-level functionality
  }
  //COMPANIONS ===>> Class and object have same name

  println(Person.N_EYES)
  println(Person.canFly)

  //Scala object = SINGLETON INSTANCE
  val mary = Person
  val John = Person
  println(mary==John)

  val adam = new Person("Adam")
  val sue = new Person("Sue")
  println(adam==sue)

 // val bobby = Person.apply(adam,sue)
  val bobby = Person(adam,sue)

  //Scala Application = Scala object with
  //def main(args: Array[String]) : Unit

  /* def main(args: Array[String]) : Unit = {
    println(Person.N_EYES)
    println(Person.canFly)
  }
  same thing with extend App...
  */
}
