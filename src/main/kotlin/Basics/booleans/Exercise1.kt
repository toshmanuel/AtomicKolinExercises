package Basics.booleans

fun main(args: Array<String>) {
    val a = (178 +  131 > 209 + 99) && false
    val b = 1 > 2 || 1 < 2
    val c = (111 - 101 >= 10) && (11.0 > 10.99) && true

    println(a)
    println(b)
    println(c)
}