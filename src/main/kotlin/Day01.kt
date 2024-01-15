class Day01 {
    companion object {
        fun part1(artyCalVals: List<String>): Int = artyCalVals.sumOf { artyCalVal ->
            val listOfDigits = artyCalVal.filter { it.isDigit() }

            val firstDigit = listOfDigits.first()
            val lastDigit = listOfDigits.last()

            "${firstDigit}${lastDigit}".toInt()
        }

        fun part2(artyCalVals: List<String>): Int {
            val numbersToFind = Regex("(one|two|three|four|five|six|seven|eight|nine|[1-9])")

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

            val listOfInts = mutableListOf<Int>()

            for (artyCalVal in artyCalVals) {

                var firstNumber = numbersToFind.findAll(artyCalVal).first().groups.first()?.value
                var lastNumber = numbersToFind.findAll(artyCalVal).last().groups.first()?.value

                if(textToNumber.keys.contains(firstNumber)) {
                    firstNumber = textToNumber[firstNumber]
                }

                if(textToNumber.keys.contains(lastNumber)) {
                    lastNumber = textToNumber[lastNumber]
                }

                listOfInts.add("${firstNumber}${lastNumber}".toInt())
            }

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
