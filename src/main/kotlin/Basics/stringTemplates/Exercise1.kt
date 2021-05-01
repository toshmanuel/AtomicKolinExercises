package Basics.stringTemplates


fun findMax(x: Int, y: Int): Int{
    return if (x > y) x else y
}

fun main(args: Array<String>) {

    val x = 12
    val y = 39
    val max = findMax(x, y)
    println("The maximum of $x and $y is $max")
}