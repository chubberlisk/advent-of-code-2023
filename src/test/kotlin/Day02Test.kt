import Day02.Day02
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class Day02Test: DescribeSpec({

//  only 12 red cubes, 13 green cubes, and 14 blue cubes

    describe("Part 1: Calculate the sum of the IDs of possible games") {
        it("returns the sum of game IDs") {
            val gameRecord = listOf("Game 1: 14 blue; 12 red; 13 green", "Game 2: 14 blue; 12 red; 13 green")

            val sumOfGameRecord = Day02.part1(gameRecord)

            sumOfGameRecord.shouldBe(3)
        }

        it("recognises that a game with greater than 38 total cubes is impossible") {
            val gameRecord = listOf("Game 1: 15 blue; 12 red; 13 green", "Game 2: 14 blue; 12 red; 13 green")

            val sumOfGameRecord = Day02.part1(gameRecord)

            sumOfGameRecord.shouldBe(2)
        }

        it("recognises that a game with greater than 14 blue cubes is impossible") {
            val gameRecord = listOf("Game 1: 15 blue; 0 red; 0 green", "Game 2: 14 blue; 12 red; 13 green")

            val sumOfGameRecord = Day02.part1(gameRecord)

            sumOfGameRecord.shouldBe(2)
        }
    }
})
