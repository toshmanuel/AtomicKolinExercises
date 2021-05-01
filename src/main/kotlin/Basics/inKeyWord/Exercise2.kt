package Basics.inKeyWord


fun sumsEven(value: Int): Int{
    var total = 0

    for (i in 0..value step 2) {
        total += i
    }


    return total
}

fun main(args: Array<String>) {
    println(sumsEven(5))
}