package ch2_basics_of_scala

/**
 * Created by BAM on 18-08-2016.
 */
object ScalaExceptions {
  def main(args: Array[String]) {
    try {
      val dig = 10;
      val div = dig / 0;
    } catch {
      case e =>
        println("Exception.......")
    }

    // case like switch case in java

    val name = "Dany"

    val ret = name match {
      case "Bahram" => 35
      case "Dany" => "Ikke født endnu"
      case "Diman" => 34
      case _ => -1
    }
    println(ret)

  }

}
