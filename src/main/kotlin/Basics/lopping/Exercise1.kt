package Basics.lopping

fun factorial(value: Int): Long{
    var total = 1L
    for (i in 1 until value){
        total *= i
    }
    return total
}

fun main(args: Array<String>) {
    println(factorial(13))
}