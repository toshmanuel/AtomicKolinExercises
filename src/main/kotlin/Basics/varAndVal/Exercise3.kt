package varAndVal

fun main(args: Array<String>) {
    var a = "World"
    var b = "Hello"
    val c = b
    b = a
    a = c

    println(a)
    println(b)
}