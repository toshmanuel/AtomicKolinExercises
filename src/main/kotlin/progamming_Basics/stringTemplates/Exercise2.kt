package progamming_Basics.stringTemplates

fun record(index: Int, status: String, message: String): String =
    "$index [$status] $message\n"

fun main(args: Array<String>) {
   val result = record(1, "OKAY", "This is working well")
   val result1 = record(2, "BAD", "This line is broken")
    println(result)
    println(result1)
}