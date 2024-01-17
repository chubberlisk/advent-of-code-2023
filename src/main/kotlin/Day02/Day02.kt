package Day02

class Day02 {
    companion object {
        fun part1(gameRecord: List<String>): Int {
            val gameIds = gameRecord.map { game ->
                gameRecord.indexOf(game) + 1
            }

            return gameIds.sum()
        }
    }
}
