package `Progamming Basics`.booleans

fun and(first: Boolean, second: Boolean): Boolean =
    if (first) second else false

fun or(first: Boolean, second: Boolean): Boolean =
    if (first) true else second

fun main() {
    println(and(true, second = false))
    println(or(true, second = true))
}