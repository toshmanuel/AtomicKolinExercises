package introduction_To_Objects.properties

class Robot1{
    var x = 0
    var y = 0
    var size = 100

    fun crossBoundary(coordinate: Int): Int{
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