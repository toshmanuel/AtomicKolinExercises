package introduction_To_Objects.variableLengthArguments

fun printArgs(x: String, vararg y: Int) {
    println("$x${y.toList()}")
}

fun main() {
    printArgs("Numbers: ", 1, 2, 3, 4, 5, 6, 7, 8)
}