package lectures.part1basics

object StringOps extends App {

  val str: String = "Hello, I am learning Scala"
//Java string utilities
  println(str.charAt(2))
  println(str.substring(7, 11))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ","-"))
  println(str.toLowerCase())
  println(str.toUpperCase())
  println(str.length)

//Scala utilities
  val aNumberString = "45"
  val aNumber = aNumberString.toInt
  println('a'+:aNumberString:+ 'z')
  println(str.reverse)
  println(str.take(2))

 //Scala-specific: String interpolator.

 //S-interpolators
  val name = "Hakki"
  val age = 21
  // it will work with s before double quates
  val greeting = s"Hello, my name is $name and I am $age years old"
  val anotherGreeting = s"Hello, my name $name and I will be turning ${age + 1} years old."
  println(anotherGreeting)

  //F- interpolators
  val speed = 1.2f
  val myth = f"$name%s can eat $speed%2.2f burgers per minute."
  println(myth)

  //raw-interpolator
  println(raw"This is a \n newline")
  val escaped = "This is a \n newline"
  println(escaped)



}
