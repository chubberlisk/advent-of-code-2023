import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class Day01Test : DescribeSpec({
    describe("Part 1") {
        it("returns the sum of calibration values") {
            val artyCalibrationValues = listOf("12")

            val sumOfCalibrationValues = Day01.part1(artyCalibrationValues)

            sumOfCalibrationValues.shouldBe(12)
        }

        it("returns the first and last digit combined") {
            val artyCalibrationValues = listOf("123")

            val sumOfCalibrationValues = Day01.part1(artyCalibrationValues)

            sumOfCalibrationValues.shouldBe(13)
        }

        it("ignores letters") {
            val artyCalibrationValues = listOf("a1abc2xyz3a")

            val sumOfCalibrationValues = Day01.part1(artyCalibrationValues)

            sumOfCalibrationValues.shouldBe(13)
        }

        it("returns the sum of multiple arty calibration values") {
            val artyCalibrationValues = listOf("1abc2", "pqr3stu8vwx", "a1b2c3d4e5f")

            val sumOfCalibrationValues = Day01.part1(artyCalibrationValues)

            sumOfCalibrationValues.shouldBe(65)
        }

        it("returns a single digit calibration value as a two-digit number") {
            val artyCalibrationValues = listOf("treb7uchet")

            val sumOfCalibrationValues = Day01.part1(artyCalibrationValues)

            sumOfCalibrationValues.shouldBe(77)
        }
    }
})
