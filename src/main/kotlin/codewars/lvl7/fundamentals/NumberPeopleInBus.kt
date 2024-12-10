package codewars.lvl7.fundamentals

fun main() {
    println(people(arrayOf(10 to 0,3 to 5,5 to 8))) // 5
    println(people1(arrayOf(3 to 0,9 to 1,4 to 8,12 to 2,6 to 1,7 to 8))) // 21
    println(people2(arrayOf(3 to 0,9 to 1,4 to 10,12 to 2,6 to 1,7 to 10))) // 17
}

fun people(busStops: Array<Pair<Int, Int>>): Int {
    var sum = 0
    for (i in 0 until busStops.size) {
        sum = sum + busStops.get(i).first - busStops.get(i).second
    }
    return sum
}

fun people1(busStops: Array<Pair<Int, Int>>): Int {
    return busStops.sumOf { it.first - it.second }
}

fun people2(busStops: Array<Pair<Int, Int>>): Int {
    return busStops.map { it.first - it.second }.sum()
}