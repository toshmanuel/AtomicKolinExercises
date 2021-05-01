package introduction_To_Objects.visibility

class Alien(val name: String, val species: String, private var planet: String){
    fun movePlanet(planetToMove: String){
        this.planet = planetToMove
    }

    public override fun toString(): String {
        return "Alien $name, $species: $planet"
    }
}

fun main() {
    val alien1 = Alien("Arthricia", "Cat", "PurgePlanet")
    val alien2 = Alien("Dale", "Giant", "Gearworld")

    println("Before moving aliens")
    println()
    println(alien1)
    println(alien2)

    alien1.movePlanet("Earth C-137")
    alien2.movePlanet("Parblesnops")

    println()
    println("After moving aliens")
    println()
    println(alien1)
    println(alien2)
}

