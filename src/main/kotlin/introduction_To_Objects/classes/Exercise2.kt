package introduction_To_Objects.classes

class Giraffe{
    fun displayID() = println(toString().substringAfter("@"))
}

fun main() {

  val giraffe1 = Giraffe()
  val giraffe2 = Giraffe()
  val giraffe3 = Giraffe()
  giraffe1.displayID()
  giraffe2.displayID()
  giraffe3.displayID()

}