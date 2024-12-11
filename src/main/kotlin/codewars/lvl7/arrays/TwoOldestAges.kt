package codewars.lvl7.arrays

fun main() {
    println(twoOldestAges(listOf(1, 1, 5, 87, 87, 45, 8, 8))) // 87, 87
    println(twoOldestAges(listOf(6, 5, 83, 5, 3, 18))) // 18, 83
    println(twoOldestAges1(listOf(6, 5, 83, 5, 3, 18)))
}

fun twoOldestAges(ages: List<Int>): List<Int> {
    var max1 = Int.MIN_VALUE
    var max2 = Int.MIN_VALUE
    for (i in ages) {
        if (i > max1) {
            max2 = max1
            max1 = i
        } else if (i > max2) {
            max2 = i
        }
    }
    return listOf(max2, max1)
}

fun twoOldestAges1(ages: List<Int>) = ages.sorted().takeLast(2)