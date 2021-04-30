package inKeyWord


fun charCheck(char: Char): Boolean =
    char in 'a'..'z'

fun main(args: Array<String>) {
    println(charCheck('f'))
}