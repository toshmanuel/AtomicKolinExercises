package introduction_To_Objects.lists

fun countOfElements(numbers: List<Int>, target: Int): Int{
    var counts = 0
    for (number in numbers) {
        if (number == target) counts++
    }

    return counts
}

fun main() {
    val numbers = ArrayList<Int>()
    numbers.add(2)
    numbers.add(2)
    numbers.add(2)
    numbers.add(2)
    numbers.add(4)
    numbers.add(21)
    numbers.add(22)
    numbers.add(7)
    numbers.add(102)
    numbers.add(216)
    numbers.add(222)

    val counts = countOfElements(numbers, 2)
    println(counts)
}