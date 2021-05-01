package introduction_To_Objects.constructor

class Floating(private val d: Double) {

    override fun toString(): String = d.toString()

}

fun main() {
    val floating = Floating(3.0)
    println(floating)
}