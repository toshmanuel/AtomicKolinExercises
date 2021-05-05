package introduction_To_Objects.sets

fun checkUnique(value: String): Boolean {
    val valueSet = value.toSet()

    return value.length == valueSet.size
}

fun main() {
    println(checkUnique("Horror"))

    println(checkUnique("war"))
}