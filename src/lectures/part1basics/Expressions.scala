package lectures.part1basics

object Expressions extends App{


  val x =1+2//1+2 is an expression
  println(x)
  println(2+3+4)
  // + - * / & | ^ << >> >>>(right shift with zero extension)
  println(1==x)
  // == != > >= < <=
  println(!(1==x))
  // ! && ||

  var aVariable = 2
  aVariable +=3 // also works with -= *= /=
  println(aVariable)

  //Instruction (DO) vs Expressions

  //IF expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3 //IF expression not a if instruction
  println(aConditionedValue)

  var i =0
 val awhile =while(i<10){
    print(i+" ")
    i+=1
  }
  //PLEASE PLEASE DO NOT AGAIN DOOO NOOOTTT USE WHILE LOOOPS IN SCALA CODING
 println()
  //NEVER WRITE THIS AGAIN.
  //EVERYTHING in Scala is an Expression!
  val aWeirdValue = (aVariable=3) //unit == void
  println(aWeirdValue)
  //side effects: println(), whiles, reassigning

  //code blocks

  val aCodeBlock ={
    val y=0
    val z =y+1
    if(z>2) "hello" else "good bye"
  }
  println(aCodeBlock)

  //val anotherValue = z +1 => z is inside the aCodeBlock so cannot be use out side the code block.

  //1. difference between "hello world" vs println("hello world")?
 ///                        String            Unit
  //2.
  val someValue = {
    2<3
  }//someValue is a boolean

  //3.

  val someOtherValue = {
    if (someValue) 239 else 986
    42
  }//Int
  println(someOtherValue)


}
