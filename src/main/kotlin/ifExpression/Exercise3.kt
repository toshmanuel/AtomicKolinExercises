package ifExpression

fun findMax(x: Int, y: Int): Int {
    return if (x > y) x else y
}

fun main(args: Array<String>) {
    var result = findMax(12, 45)
    println(result)
    result = findMax(-5, -100)
    println(result)
}