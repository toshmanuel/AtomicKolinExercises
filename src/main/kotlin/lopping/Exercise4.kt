package lopping

fun showHalfTriangle(value: Int){
    for (i in 1..value){
        for (j in 1..i){
            print("#")
        }
        println()
    }
}

fun main(args: Array<String>) {
    showHalfTriangle(5)
}