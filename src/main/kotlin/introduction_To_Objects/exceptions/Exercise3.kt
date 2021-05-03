package introduction_To_Objects.exceptions

fun repeatChar(char: Char, n: Int): String {
    if(n < 0){
        throw IllegalArgumentException("Count cannot be less than zero")
    }
    var s = ""
    for (c in 1.. n ){
        s += char
    }
    return s
}

fun main() {
    println(repeatChar('3', 3))

    try {
        repeatChar('3', -4)
    }catch(e: IllegalArgumentException){
        println(e.message)
    }
}