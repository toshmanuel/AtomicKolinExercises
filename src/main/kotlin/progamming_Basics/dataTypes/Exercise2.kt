package dataTypes

fun main(args: Array<String>) {
    val int: Int = 10
    val double: Double = 1.1
    val boolean: Boolean = false
    val string: String = "abc"
    val char: Char = 'a'


//    Can be Combined
    val v1: String = string + int
    val v2: String = string + double
    val v3: String = string + char
    val v4: String = string + boolean
    val v5: Double = double + int
    val v6: Double = int + double
    val v7: Char = char + int

//    Cannot Combine
//    val v8: Boolean = boolean + boolean
//    val v9: Boolean = int + boolean
//    val v10: Int = int + string
//    val v11: Double = double + string
//    val v12: Double = double + char

}