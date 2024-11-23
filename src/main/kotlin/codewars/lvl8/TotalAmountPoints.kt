package codewars.lvl8

fun main() {
    println(points(listOf("1:0", "2:0", "3:0", "4:0", "2:1", "3:1", "4:1", "3:2", "4:2", "4:3")))
    println(points1(listOf("1:0", "2:0", "3:0", "4:0", "2:1", "3:1", "4:1", "3:2", "4:2", "4:3")))
}

fun points(games: List<String>): Int {
    var res: Int = 0
    for (i in 0..games.size - 1) {
        if (games[i][0].code > games[i][2].code) {
            res += 3
        } else if (games[i][0].code == games[i][2].code) {
            res += 1
        }
    }
    return res
}

fun points1(games: List<String>): Int {
    return games.map { it.split(":") }.map { it[0] to it[1] }.map { (x, y) ->
        if (x > y) 3 else if (x < y) 0 else 1
    }.sum()
}