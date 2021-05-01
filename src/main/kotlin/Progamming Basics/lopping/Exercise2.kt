package `Progamming Basics`.lopping


fun sumOfFactorial(value: Int): Long{
    var total = 0L
    for (i in 1 .. value){
        total += factorial(i)
    }
    return total
}


fun main(args: Array<String>) {
    println(sumOfFactorial(10))
}