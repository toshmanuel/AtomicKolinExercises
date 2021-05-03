package introduction_To_Objects.exceptions

fun abort(message: String) {
    throw Exception(message)
}

fun main() {
    try{
        abort("message")
    }catch (e: Exception){
        e.message
    }
}


