package Day02

class Day02 {
    companion object {
        fun part1(gameRecord: List<String>): Int {
            val maxCubesForEachColour = mapOf(
                "blue" to 14,
                "red" to 12,
                "green" to 13
            )

            return gameRecord.sumOf { game ->
                val cubes = game.split(": ").last()
                val cubeSubsets = cubes.split("; ") // ["15 blue", "14 yellow"]

                val cubeMap = cubeSubsets.map {
                    it.split(" ").last() to it.split(" ").first().toInt()
                }.toMap()

                if (cubeMap["blue"] != null && cubeMap.getValue("blue") > maxCubesForEachColour.getValue("blue")) {
                    0
                } else if (cubeMap["red"] != null && cubeMap.getValue("red") > maxCubesForEachColour.getValue("red")) {
                    0
                } else if (cubeMap["green"] != null && cubeMap.getValue("green") > maxCubesForEachColour.getValue("green")) {
                    0
                } else {
                    gameRecord.indexOf(game) + 1
                }
            }
        }
    }
}
