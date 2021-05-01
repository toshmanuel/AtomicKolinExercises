package Basics.repetition

fun repetitiveEvenSum(number : Int){
    if(number <= 0) return
    var total = 0
    var counter = 1
    while (counter <= number){
        if(counter % 2 == 0){
            total += counter
        }
        counter++
    }
    println(total)
}

fun main(args: Array<String>) {
    repetitiveEvenSum(12)
}