package introduction_To_Objects.objects


fun intReversed(value: Int): Int =
    value.toString().reversed().toInt()

fun main() {
    println(intReversed(1234454))
}