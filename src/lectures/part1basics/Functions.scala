package lectures.part1basics

case object Functions extends App {
  //  functionName (parameter name:type)   :   returnType
  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  //if we dont specify the return type compiler figures out by the implementation
  def bFunction(a: String, b: Int) = {
    a + " " + b
  }

  println(aFunction("hello", 3))
  println(bFunction("goodbye", 2))

  //parameterless functions can be called by just the name
  def aParameterlessFunction(): Int = 42

  println(aParameterlessFunction())
  println(aParameterlessFunction)

  //BUT!! put a return type especially for recursive functions.
  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else (aString + " ") + aRepeatedFunction(aString, n - 1)
    //this is a recursive function because it calls itself
  }

  println(aRepeatedFunction("Hello", 3))
  //When you need loops use recursion

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  //we can define functions in functions in Scala

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n - 1)

  }

  println(aBigFunction(5))

  /*
1. A greeting functions ( name, age) ->
2. Factorial Functions 1* 2* 3* . . *n
3. A fibonacci functions
f(1)=1
f(2)=1
f(n)=f(n-1)+f(n-2)
4.Tests if a number is prime
 */


  def greeting(name: String, age: Int): String = {
    "Hi! my name is " + name + " and I am " + age + " years old!"
  }

  println(greeting("Amy", 21))

  def factorialFunction(n: Int): Int = {
    if (n <= 0) 1
    else n * factorialFunction(n - 1)
  }

  println(factorialFunction(5))

  def fibonacci(n: Int): Int =
    if (n <= 2) 1
    else fibonacci(n - 1) + fibonacci(n - 2)

  println(fibonacci(8))

  def isPrime(n: Int): Boolean = {

    def isPrimeUntil(t:Int):Boolean=
      if(t<=1) true
      else n % t !=0 && isPrimeUntil(t-1)


    isPrimeUntil(n/2)

  }
  println(isPrime(13))
  println(isPrime(1))
  println(isPrime(4))
  println(isPrime(16))

}