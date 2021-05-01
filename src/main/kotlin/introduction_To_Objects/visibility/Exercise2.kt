package introduction_To_Objects.visibility

class Robot1{
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
    fun getLocation(): String = "($x, $y)"
}
fun main() {
    val robot = Robot1()
    println(robot.getLocation())
    robot.up(1)
    println(robot.getLocation())
    robot.left(10)
    println(robot.getLocation())
}