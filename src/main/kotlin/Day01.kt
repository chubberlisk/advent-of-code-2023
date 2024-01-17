class Day01 {
    companion object {
        fun part1(artyCalVals: List<String>): Int = artyCalVals.sumOf { artyCalVal ->
            val listOfDigits = artyCalVal.filter { it.isDigit() }

            val firstDigit = listOfDigits.first()
            val lastDigit = listOfDigits.last()

            "${firstDigit}${lastDigit}".toInt()
        }

        fun part2(artyCalVals: List<String>): Int {
            val numbersToFind = Regex("(?=(one|two|three|four|five|six|seven|eight|nine|[1-9]))")

            val textToNumber = mapOf(
                "one" to "1",
                "two" to "2",
                "three" to "3",
                "four" to "4",
                "five" to "5",
                "six" to "6",
                "seven" to "7",
                "eight" to "8",
                "nine" to "9"
            )

            return artyCalVals.sumOf { artyCalVal ->

                var firstNumber = numbersToFind.findAll(artyCalVal).first().destructured.toList().firstOrNull()
                var lastNumber = numbersToFind.findAll(artyCalVal).last().destructured.toList().firstOrNull()

                if(textToNumber.keys.contains(firstNumber)) {
                    firstNumber = textToNumber[firstNumber]
                }

                if(textToNumber.keys.contains(lastNumber)) {
                    lastNumber = textToNumber[lastNumber]
                }

                "${firstNumber}${lastNumber}".toInt()
            }
        }
    }
}

fun main() {
    println("Part 1")
    println("======")
    val partOneTestInput = readInput("Day01_test")
    println("[Test Input] Sum of calibration values: ${Day01.part1(partOneTestInput)}")

    val partOnePuzzleInput = readInput("Day01")
    println("[Puzzle Input] Sum of calibration values: ${Day01.part1(partOnePuzzleInput)}")

    println()
    println("Part 2")
    println("======")
    val partTwoTestInput = readInput("Day01_Part2_test")
    println("[Test Input] Sum of calibration values: ${Day01.part2(partTwoTestInput)}")

    val partTwoPuzzleInput = readInput("Day01")
    println("[Puzzle Input] Sum of calibration values: ${Day01.part2(partTwoPuzzleInput)}")
}
