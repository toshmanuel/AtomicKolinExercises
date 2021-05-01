package introduction_To_Objects.properties

class Robot{
    private var x = 0
    private var y = 0


    fun right(steps: Int) {
        x += steps
    }

    fun left(steps: Int){
        if(x > 0){
            x -= steps
        }
    }

    fun down(steps: Int){
        y += steps
    }

    fun up(steps:Int){
        if (y > 0){
            y -= steps
        }
    }

    fun getLocation(): String = "($x, $y)"


}

fun main(args: Array<String>) {
    val robot = Robot()
    println(robot.getLocation())
    robot.right(1)
    println(robot.getLocation())
    robot.down(2)
    println(robot.getLocation())

}