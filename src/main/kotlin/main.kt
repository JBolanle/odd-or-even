fun main() {
    println("Odd or Even Calculator")
    println("Please enter a number: ")

    val userNumber = readLine() ?: "0" //?: sets value to string 0 if null
    val parsedNumber = try { // try to convert userNumber to Int to prevent crash
        userNumber.toInt()
    } catch (e: Exception) {
        0
    }

    oddOrEven(parsedNumber)
    if (oddOrEven(parsedNumber)) {
        println("The number $parsedNumber is even.")
    } else {
        println("The number $parsedNumber is odd.")
    }

}

fun oddOrEven(number: Int) : Boolean {
    return (number % 2) == 0
}