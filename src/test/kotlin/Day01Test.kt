import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class Day01Test : DescribeSpec({
    describe("Part 1") {
        it("returns the sum of calibration values") {
            val artyCalibrationValues = listOf("12")

            val sumOfCalibrationValues = Day01.part1(artyCalibrationValues)

            sumOfCalibrationValues.shouldBe(12)
        }

        it("uses only the first and last digit combined for a calibration value") {
            val artyCalibrationValues = listOf("123")

            val sumOfCalibrationValues = Day01.part1(artyCalibrationValues)

            sumOfCalibrationValues.shouldBe(13)
        }

        it("ignores letters for a calibration value") {
            val artyCalibrationValues = listOf("a1abc2xyz3a")

            val sumOfCalibrationValues = Day01.part1(artyCalibrationValues)

            sumOfCalibrationValues.shouldBe(13)
        }

        it("uses the single digit for the first and last digit of a calibration value") {
            val artyCalibrationValues = listOf("treb7uchet")

            val sumOfCalibrationValues = Day01.part1(artyCalibrationValues)

            sumOfCalibrationValues.shouldBe(77)
        }

        it("returns the sum of multiple arty calibration values") {
            val artyCalibrationValues = listOf("11", "22", "33")

            val sumOfCalibrationValues = Day01.part1(artyCalibrationValues)

            sumOfCalibrationValues.shouldBe(66)
        }
    }
})
