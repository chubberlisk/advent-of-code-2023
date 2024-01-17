package Day02

class Day02 {
    companion object {
        fun part1(gameRecord: List<String>): Int {
            return gameRecord.sumOf { game ->
                val cubes = game.split(": ").last()
                val cubeSubsets = cubes.split("; ") // ["15 blue", "14 yellow"]
                val numberOfCubes = mutableListOf<Int>()

                for (subset in cubeSubsets) {
                    numberOfCubes.add(subset.split(" ").first().toInt())
                }
                val totalCubes = numberOfCubes.sum()

                if(totalCubes <= 39) {
                    gameRecord.indexOf(game) + 1
                }
                else 0
            }
        }
    }
}

