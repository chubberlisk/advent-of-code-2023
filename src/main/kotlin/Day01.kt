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
    // example 1 - it returns calibration value
    var testInput = readInput("Day01_tdd_test_1")
    check(Day01.part1(testInput) == 12)

    // example 2 - it returns the first and last digit combined
    testInput = readInput("Day01_tdd_test_2")
    check(Day01.part1(testInput) == 13)

    // example 3 -  it ignores letters
    testInput = readInput("Day01_tdd_test_3")
    check(Day01.part1(testInput) == 13)

    // example 4 - it handles multiple arty calibration values and returns the sum of their combined first and last digits
    testInput = readInput("Day01_tdd_test_4")
    check(Day01.part1(testInput) == 37)

    // example 5 - it handles arty calibration with a single digit only
    testInput = readInput("Day01_tdd_test_5")
    check(Day01.part1(testInput) == 48)

    // example 6 - it passes initial tests
    testInput = readInput("Day01_test")
    check(Day01.part1(testInput) == 142)

    // example 7 - it gives the correct answer
    testInput = readInput("Day01")
    println("Calibration Value: ${Day01.part1(testInput)}")
}
