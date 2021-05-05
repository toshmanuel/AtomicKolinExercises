package introduction_To_Objects.variableLengthArguments

fun flatten(listOfLists: List<List<String>>): List<String>{
    val singleList = ArrayList<String>()
    for (list in listOfLists){
        singleList.addAll(list)
    }
    return singleList
}

fun main() {
    val listOfLists = listOf(listOf("a", "b"), listOf("c", "d"))
    val result = flatten(listOfLists)
    println(result)
}