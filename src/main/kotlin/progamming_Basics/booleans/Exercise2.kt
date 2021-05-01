package progamming_Basics.booleans

fun showAnd(first: Boolean, second: Boolean) =
    println("$first && $second == ${first && second}")

fun showOr(first: Boolean, second: Boolean) =
    println("$first && $second == ${first || second}")

fun showTruthTable(){
    showAnd(first = true, second = true)
    showAnd(true, second = false)
    showAnd(first = false, second = true)
    showAnd(false, second = false)

    showOr(first = true, second =true)
    showOr(true, second = false)
    showOr(false, second = true)
    showOr(false, second = false)
}

fun main(args: Array<String>) {
    showTruthTable()
}