package progamming_Basics.functions

fun duplicate(x: String): String {
    return x + x
}

fun main(args: Array<String>) {
    val result = duplicate("John")
    println(result)
}