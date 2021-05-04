package introduction_To_Objects.lists

fun findMax(numbers: List<Int>): Int{

    var max = numbers[0]
    for(i in 1 until numbers.size){
        if(numbers[i] >= max){
            max = numbers[i]
        }
    }
    return max
}


fun main() {

    val numbers = ArrayList<Int>()
    numbers.add(2)
    numbers.add(4)
    numbers.add(21)
    numbers.add(22)
    numbers.add(7)
    numbers.add(102)
    numbers.add(216)
    numbers.add(222)

    val max = findMax(numbers)
    println(max)
}