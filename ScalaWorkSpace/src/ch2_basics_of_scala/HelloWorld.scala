package ch2_basics_of_scala

/**
 * Created by BAM on 18-08-2016.
 */

object HelloWorld {


  def main(args: Array[String]) {
    testYilled()
  }

  def testYilled(): Unit = {
    p("simple for loop")
    line
    val books = List("Java", "Groovy", "Scala", "Ruby", "C#", "C++", "C")
    for (book <- books) println(book)

    line
    p("for loop with yield")

    val retVal= for {book <- books;if book.startsWith("C")} yield book
    p(retVal)

    line
    p("Using foreach with list")
   books.foreach(println)
  }

  def line()= println("----------------------------------------------------")
  def p(str:Any)=println(str)


}
