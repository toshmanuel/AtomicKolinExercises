package introduction_To_Objects.lists

fun anagram(word: String, word1: String): Boolean {
    return word.toList().sorted() == word1.toList().sorted()
}

fun main() {
    println(anagram("joy", "oyj"))

    println(anagram("mites", "times"))


    println(anagram("sword", "word"))
}