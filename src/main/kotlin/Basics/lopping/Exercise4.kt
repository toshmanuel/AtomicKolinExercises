package Basics.lopping

fun showHalfTriangle(value: Int){
    for (i in 1..value){
        repeat(i){
            print("#")
        }
        println()
    }
}

fun main(args: Array<String>) {
    showHalfTriangle(5)
}