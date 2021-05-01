package `Progamming Basics`.repetition

fun displayContent(contents: String) {
    var counter = 0
    while(counter < contents.length){

        println(contents[counter])
        counter++
    }
}

fun main(args: Array<String>) {
    displayContent("This is my Laptop")
}