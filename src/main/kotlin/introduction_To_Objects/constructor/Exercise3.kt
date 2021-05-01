package introduction_To_Objects.constructor

class Robot1(private var x: Int, private var y: Int, private val size: Int ){


    private fun crossBoundary(coordinate: Int): Int{
        val inBounds = coordinate % size

        return if (inBounds < 0){
            size + inBounds
        }else{
            inBounds
        }
    }
    fun right(steps: Int) {
        x += steps
        x = crossBoundary(x)
    }

    fun left(steps: Int) {
        x -= steps
        x = crossBoundary(x)
    }

    fun down(steps: Int) {
        y += steps
        y = crossBoundary(y)
    }

    fun up(steps: Int) {
        y -= steps
        y = crossBoundary(y)
    }

    override fun toString(): String {
        return "(x=$x, y=$y)"
    }
}
fun main() {
    val robot = Robot1(2,4,100)
    println(robot.toString())
    robot.up(1)
    println(robot.toString())
    robot.left(10)
    println(robot.toString())
}