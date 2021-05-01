package introduction_To_Objects.classes

public class SomeClass{
    fun a() = println(42)
    private fun b() = a()
    fun c() = this.b()
}
