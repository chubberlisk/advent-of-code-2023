class Day01 {
    companion object {
        fun part1(artyCalVals: List<String>): Int = artyCalVals.sumOf { artyCalVal ->
            val listOfDigits = artyCalVal.filter { it.isDigit() }

            val firstDigit = listOfDigits.first()
            val lastDigit = listOfDigits.last()

            "${firstDigit}${lastDigit}".toInt()
        }

        fun part2(artyCalVals: List<String>): Int {
            val listOfInts = artyCalVals.map { it.toInt() }

            return listOfInts.first()
        }
    }
}

fun main() {
    val testInput = readInput("Day01_test")
    println("[Test Input] Sum of calibration values: ${Day01.part1(testInput)}")

    val puzzleInput = readInput("Day01")
    println("[Puzzle Input] Sum of calibration values: ${Day01.part1(puzzleInput)}")
}
