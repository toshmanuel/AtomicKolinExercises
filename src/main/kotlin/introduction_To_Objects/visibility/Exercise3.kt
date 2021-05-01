package introduction_To_Objects.visibility

class Robot{
    private var x = 0
    private var y = 0
    private var size = 100

    private fun crossBoundary(coordinate: Int): Int{
        val inBounds = coordinate % size

        return if (inBounds < 0){
            size + inBounds
        }else{
            inBounds
        }
    }
    fun right(steps: Int) {
        if (steps > 0) {
            x += steps
            x = crossBoundary(x)
        }else
            println("steps argument must be positive, is $steps")
    }

    fun left(steps: Int) {
        if (steps > 0) {
            x -= steps
            x = crossBoundary(x)
        }else
            println("steps argument must be positive, is $steps")


    }

    fun down(steps: Int) {
        if (steps > 0) {
            y += steps
            y = crossBoundary(y)
        }else
            println("steps argument must be positive, is $steps")

    }

    fun up(steps: Int) {

        if (steps > 0) {
            y -= steps
            y = crossBoundary(y)
        }else
            println("steps argument must be positive, is $steps")
    }
    fun getLocation(): String = "($x, $y)"
}
fun main() {
    val robot = Robot()
    println(robot.getLocation())
    robot.up(1)
    println(robot.getLocation())
    robot.left(10)
    println(robot.getLocation())
    robot.down(-2)
    println(robot.getLocation())
    robot.right(0)
    println(robot.getLocation())
}