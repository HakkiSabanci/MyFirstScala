package lectures.part2oop

object Inheritance extends App {


  sealed class Animal{
   def eat = println("nom nom nom")
    val creatureType = "wild"
  }
  class Cat extends Animal{
    def crunch = {
      eat
      println("crunchhh crunchhh")
    }
  }

  val cat = new Cat
  cat.crunch
  //cat.eat

  //constructors
  class Person(name: String, age: Int) {
    def this(name: String)= this(name,0)
  }
  class Adult(name: String, age: Int, idCard: String) extends Person(name)

  //overriding

  class Dog extends Animal {
    override val creatureType="domestic"
    override def eat = println("crunch crunch")
  }

  class Bird(override val creatureType: String) extends Animal{
  override def eat = {
    super.eat
    println("laps laps")
  }
  }


  val dog = new Dog
  dog.eat
  println(dog.creatureType)
  println(cat.creatureType)
  val bird = new Bird("Domestic")
  println(bird.creatureType)

  //type substitution (broad: Polymorphism)
  val unknownAnimal: Animal = new Bird("Eagle")
  println(unknownAnimal.creatureType)
  unknownAnimal.eat

  val unknownAnimal2: Animal = new Bird("Hawk")

  //overRIDING vs overLOADING


  //super

  //preventing overrides
  //1 - use final member
  //2 - use final on the entire class
  //3 - seal the class = extend classes in THIS FILE prevent extension in other files
}
