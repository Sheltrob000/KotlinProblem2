fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)
    val subResult = subtract(thirdNumber, firstNumber)
    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")
    println("$thirdNumber + $firstNumber = $subResult")
}

fun add(int1: Int, int2: Int): Int {
    return int1 + int2
}

fun subtract(int1: Int, int2: Int): Int {
    return int1 - int2
}