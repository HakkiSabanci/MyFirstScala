package lectures.part2oop

object Generics extends App {


  class MyList [+A] { //this generic class
    //use the type A
    def add[B >: A](element: B) : MyList[A] = ???
  /*
  A = Cat
  B = Dog = Animal

   */
  }

  class MyMap[Key, Value]


  val listOfIntegers = new MyList[Int]
  val listOfStrings = new MyList[String]

  //generic methods

  object MyList{
    def empty[A]: MyList[A] = ???
  }
  val emptyListOfIntegers = MyList.empty[Int]

  //variance Problem

  class Animal
  class Cat extends Animal
  class Dog extends Animal

  //1.yes List[Cat] extends List[Animal] = Covariance
  class CovariantList [+A]
  val animal: Animal = new Cat
  val animalList: CovariantList[Animal]=new CovariantList[Cat]
  //animalList.add(new Dog) ??? HARD QUESTION => we return a list of Animals

  //2. NO = Invariance

  class InvariantList[A]
  val invariantAnimalList : InvariantList[Animal] = new InvariantList[Animal]

  //3. Hell Nooo! Contravariance

  //class ContravariantList[-A]
  class Trainer[-A]
  val trainer: Trainer[Cat] = new Trainer[Animal]

  //bounded types
  class Cage[A <: Animal](animal: A)
  val cage = new Cage(new Dog)

  class car
  //generic type needs proper bounded type
  //val newCage = new Cage(new Car) it will throw exception cuz Cage only accept Animal types (bounded types)

  //expend MyList to be generic


}
