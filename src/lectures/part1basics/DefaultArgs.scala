package lectures.part1basics

object DefaultArgs extends App {

  def trFact(n: Int, acc: Int = 1): Int =
    if(n <= 1) acc
    else trFact(n-1, n*acc)

  //val fact10 = trFact(10) default arg acc
  val fact10 = trFact(10,2)

  def savePicture(format: String="jpg",width: Int = 1920, height: Int = 1080):Unit = println("saving picture")
//  def savePicture(format: String="jpg",width: Int, height: Int):Unit = println("saving picture")
//  savePicture("jpg",800,600)
//  savePicture(800,600) default is not gonna work, compiler would confuse
  savePicture(width = 800)
  /*
  1. pass in every leading argument
  2. name the arguments
   */

  savePicture(height = 600,width = 800,format = "bmp")




}
