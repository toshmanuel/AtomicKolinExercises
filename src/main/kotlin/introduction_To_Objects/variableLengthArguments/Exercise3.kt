package introduction_To_Objects.variableLengthArguments

fun listOfChunks(size: Int, vararg s: String): List<List<String>> {
    return s.toList().chunked(size)
}

fun main() {
    val result = listOfChunks(3, "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k")

    println(result)
}