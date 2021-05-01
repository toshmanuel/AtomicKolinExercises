package `Progamming Basics`.stringTemplates


fun show(i: Int, s: String, c: Char, d: Double): String =
    "Int: $i\nString: \"$s\"\nChar: '$c'\nDouble: $d"

fun main(args: Array<String>) {
    println(show(1, "Boys", 'a' -15, 56.74))

}