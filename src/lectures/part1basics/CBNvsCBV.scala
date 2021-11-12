package lectures.part1basics

object CBNvsCBV extends App {

  def calledByValue(x: Long): Unit = {
    println("by value: " + 4603115954200L)
    println("by value: " + 4603115954200L)
  }

  def calledByName(x: => Long): Unit = {
    println("by name: " + System.nanoTime())
    println("by name: " + System.nanoTime())
  }

  calledByValue(4603115954200L)
  calledByName(System.nanoTime())

  def infinite() : Int  = 1 + infinite()
  def printFirst( x : Int, y: => Int) = println(x)
 // printFirst(infinite(),34)
 printFirst(34,infinite())


}
