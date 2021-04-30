package ifExpression

fun checkSign(x: Int): String {
    return if (x == 0) "zero"
    else if (x < 0) "negative"
    else "positive"
}

fun main(args: Array<String>) {
    val result = checkSign(45)
    val result1 = checkSign(-45)
    val result2 = checkSign(0)
    println(result)
    println(result1)
    println(result2)

}