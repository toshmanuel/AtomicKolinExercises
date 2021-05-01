package progamming_Basics.expressions

fun f(first: Int, second: Int): Int =
    first + second

fun g(first: String, second: String): String = "$first $second"

fun h() =println("h()")

fun main() {
    val a = f(2, 3)
    val b = g("Boy", "girl")
    val c = h()

    println("Int")
    println("String")
    println("Unit")
}