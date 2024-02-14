package Day02

class Day02 {
    companion object {
        fun part1(gameRecord: List<String>): Int {
            return gameRecord.sumOf { game ->
                val cubes = game.split(": ").last()
                val cubeSubsets = cubes.split("; ") // ["15 blue", "14 yellow"]

                val cubeMap = mutableMapOf<String, Int>()
                for(cubeSubset in cubeSubsets) {
                    val cubeSubsetInfo = cubeSubset.split(" ")
                    cubeMap[cubeSubsetInfo.last()] = cubeSubsetInfo.first().toInt()
                }

                val totalCubes = cubeMap.values.sum()

                if (cubeMap["blue"] != null && cubeMap["blue"]!! > 14) {
                    0
                } else if (totalCubes > 39) {
                    0
                } else {
                    gameRecord.indexOf(game) + 1
                }
            }
        }
    }
}
