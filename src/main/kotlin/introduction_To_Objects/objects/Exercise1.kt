package introduction_To_Objects.objects

fun palindrome(value: String): String =
    if (value.reversed()==value) "$value is a palindrome" else "$value is not a palindrome"

fun main(args: Array<String>) {

    println(palindrome("hannah"))
}
