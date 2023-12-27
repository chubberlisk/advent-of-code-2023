import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class Day01Test : DescribeSpec({
    it("returns a calibration value") {
        Day01.part1(listOf("12")).shouldBe(12)
    }
})
