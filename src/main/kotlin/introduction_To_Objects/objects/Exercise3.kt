package introduction_To_Objects.objects

fun isPalindrome(value: String): Boolean =
    value == value.reversed()

fun isPalidromeWithoutSpecial(value: String): Boolean {
    var withoutSpecial = ""

    for (i in value){
        if(i in 'a'.. 'z' || i in 'A'..'Z'){
            withoutSpecial+= i
        }
    }
    return isPalindromeIgnoreCase(withoutSpecial)
}

fun isPalindromeIgnoreCase(value: String): Boolean =
    isPalindrome(value.toLowerCase())

fun main() {
    println(isPalidromeWithoutSpecial("Madam I'm Adam"))
}