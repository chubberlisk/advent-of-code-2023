import Day02.Day02
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class Day02Test: DescribeSpec({
    describe("Part 1: Calculate the sum of the IDs of possible games") {


        it("Returns the sum of game IDs") {
            val gameRecord = listOf("Game 1: 14 blue; 12 red; 13 green")

            val sumOfGameRecord = Day02.part1(gameRecord)

            sumOfGameRecord.shouldBe(1)
        }



    }

})
