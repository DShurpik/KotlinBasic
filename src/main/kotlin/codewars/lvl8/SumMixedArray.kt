package codewars.lvl8

fun main() {
    println(sum(listOf("5", "0", 9, 3, 2, 1, "9", 6, 7)))
    println(sum1(listOf("5", "0", 9, 3, 2, 1, "9", 6, 7)))
    println(sum2(listOf("5", "0", 9, 3, 2, 1, "9", 6, 7)))
}

fun sum(mixed: List<Any>): Int = mixed.map { it.toString().toInt() }.sum()

fun sum1(mixed: List<Any>): Int = mixed.sumOf { it.toString().toInt() }

fun sum2(mixed: List<Any>): Int {
    var res: Int = 0
    for (i in mixed) {
        if (i is String) {
            res += i.toInt()
        } else if (i is Int) {
            res += i
        }
    }
    return res
}