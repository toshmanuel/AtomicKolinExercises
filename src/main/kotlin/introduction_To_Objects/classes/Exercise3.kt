package introduction_To_Objects.classes

class Robot{
    fun right(steps: Int){
        println("Right $steps steps")
    }

    fun left(steps: Int){
        println("Left $steps steps")
    }

    fun down(steps: Int){
        println("Down $steps steps")
    }

    fun up(steps: Int){
        println("Up $steps steps")
    }

}

fun main() {
    val roboCop = Robot()
    roboCop.up(5)
    roboCop.left(10)
    roboCop.down(8)
    roboCop.right(40)

}