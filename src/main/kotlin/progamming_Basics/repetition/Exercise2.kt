package progamming_Basics.repetition

fun repetitiveSum(number : Int){
    if(number <= 0) return
    var total = 0
    var counter = 1
    while (counter <= number){
        total += counter
        counter++
    }
    println(total)
}

fun main(args: Array<String>) {
    repetitiveSum(12)
}