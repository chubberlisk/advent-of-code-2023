package Day02

class Day02 {
    companion object {
        fun part1(gameRecord: List<String>): Int {
            val possibleGames = mutableListOf<Int>()

            for (game in gameRecord) {
                val gameId = gameRecord.indexOf(game) + 1
                possibleGames.add(gameId)
            }

            return possibleGames.sum()
        }
    }
}
