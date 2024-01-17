package Day02

class Day02 {
    companion object {
        fun part1(gameRecord: List<String>): Int {
            return gameRecord.sumOf { game ->
                    gameRecord.indexOf(game) + 1
                }
            }
        }
    }
