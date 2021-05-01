package `Progamming Basics`.inKeyWord

fun alphabets(): String{
    var s = ""
    for (c in 'a'..'z') {
        s += c
    }

    return s
}

fun main(args: Array<String>) {
    println(alphabets())
}