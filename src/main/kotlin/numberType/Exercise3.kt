package numberType

fun celsiusToFahrenheit(celsius: Double): Double =
    (celsius * 9/5.0) + 32

fun fahrenheitToCelsius(fahrenheit: Double): Double =
    (fahrenheit - 32) * (5 / 9.0)

fun main(args: Array<String>) {
    val fahrenheitResult = celsiusToFahrenheit(43.0)
    println(fahrenheitResult)

    val celsiusResult = fahrenheitToCelsius(43.0)
    println(celsiusResult)
}