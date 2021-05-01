package `Progamming Basics`.numberType

fun millis(hour: Long = 0,  minute: Long = 0, second: Long = 0): Long =
    (hour * 60 * 60 * 1000) + (minute * 60 * 1000) + (second * 1000)

fun main(args: Array<String>) {
    val result = millis(hour=4, minute=60, second=58)
    println(result)
}