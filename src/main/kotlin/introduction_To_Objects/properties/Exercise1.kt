package introduction_To_Objects.properties

class X{
    val a = 3
    val b = 42
    var c = 0

    fun add(): Int{
        c = a + b
        return c
    }

}

fun main() {
    val num = X()

    println(num.add())

}