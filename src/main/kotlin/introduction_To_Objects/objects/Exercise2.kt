package introduction_To_Objects.objects

private fun palindrome(value: String): String =
    if (value.reversed()==value) "$value is a palindrome" else "$value is not a palindrome"

fun main(args: Array<String>) {

    println(palindrome("Bob".toLowerCase()))
}