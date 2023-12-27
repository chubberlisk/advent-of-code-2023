class Day01 {
    companion object {
        fun part1(artyCalVals: List<String>): Int {
            return artyCalVals.sumOf { artyCalVal ->
                val listOfDigits = artyCalVal.filter { it.isDigit() }

                val firstDigit = listOfDigits.first()
                val lastDigit = listOfDigits.last()

                "${firstDigit}${lastDigit}".toInt()
            }
        }
    }
}

fun main() {
    val testInput = readInput("Day01")
    println("Sum of calibration values: ${Day01.part1(testInput)}")
}
