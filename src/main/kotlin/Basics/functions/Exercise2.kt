package Basics.functions

fun sumDouble(x: Double, y:Double, z:Double): Double {
    return x + y + z
}

fun main(args: Array<String>) {
    val result = sumDouble(1.1, 2.4, 2.5)
    println(result)
}