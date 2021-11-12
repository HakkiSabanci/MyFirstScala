package lectures.part2oop

object AnonymousClasses extends App{

  abstract class Animal {
    def eat: Unit

  }


  val funnyAnnimal: Animal = new Animal {
    override def eat: Unit = println("jajajjajajajaj")
  }

  println(funnyAnnimal.getClass)

}
