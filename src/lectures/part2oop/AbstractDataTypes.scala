package lectures.part2oop

object AbstractDataTypes extends App {

  //abstract
  //abstract classes can have abstract or non abstract members

  abstract class Animal {
    val creatureType: String = "wild"

    def eat: Unit

  }

  class Dog extends Animal{
    override val creatureType: String = "K9"

    override def eat: Unit = println("Crunch Crunch Crunch")

  }

  //traits
  //Can have abstract and non abstract members also

  trait Carnivore {

    def eat(animal: Animal):Unit
    val preferredMeal: String = "fresh meat"
  }

  class Crocodile extends Animal with Carnivore{
    override val creatureType: String = "Croc"

    def eat: Unit = "nomnomnom"

    def eat(animal: Animal): Unit = println(s"I'm a croc and I'm eating ${animal.creatureType}")

  }

  val dog = new Dog
  val croc = new Crocodile
  croc.eat(dog)

  //traits vs abstract classes
  //1- Traits do not havew constructor parameters
  //2- multiple traits may be inherited by the same class
  //3- traits a= behaviour, abstract class = "thing"
}
