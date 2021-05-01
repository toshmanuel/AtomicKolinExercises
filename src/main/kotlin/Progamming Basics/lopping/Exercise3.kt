package `Progamming Basics`.lopping

fun sumEven(value: Int): Int{
    var total = 0
    for (i in 1..value){
        if (i % 2 ==0) total += i
    }
    return total
}

fun main(args: Array<String>) {
    println(sumEven(10))
}