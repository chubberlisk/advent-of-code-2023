import Day02.Day02
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class Day02Test: DescribeSpec({
    describe("Part 1: Calculate the sum of the IDs of possible games") {
        it("returns the sum of game IDs") {
            val gameRecord = listOf("Game 1: 14 blue; 12 red; 13 green", "Game 2: 14 blue; 12 red; 13 green")

            val sumOfGameRecord = Day02.part1(gameRecord)

            sumOfGameRecord.shouldBe(3)
        }

        it("returns only counts possible games") {
            val gameRecord = listOf("Game 1: 15 blue; 12 red; 13 green", "Game 2: 14 blue; 12 red; 13 green")

            val sumOfGameRecord = Day02.part1(gameRecord)

            sumOfGameRecord.shouldBe(2)
        }
    }
})
