package lectures.part1basics

object ValuesVariablesTypes extends App{

  val x = 42 // val x: Int = 42

  println(x)

  //types of vals are optional
  //compiler can infer types
  //VALS ARE IMMUTABLE

  val aString: String = "hello"
  val anotherString = "goodbye"

  val aBoolean: Boolean = true
  val bBoolean = false;
  val aChar: Char = 'a'
  val anInt: Int = x
  val aShort: Short = 2546
  val aLong: Long = 123456789123456L
  val aFloat: Float = 2.0f
  val asDouble: Double =3.14

  //variables

  var aVariable: Int = 4
  aVariable=6 // side effects


}
