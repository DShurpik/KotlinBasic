package codewars.lvl8

fun main() {
    println(oddCount(7))
    println(oddCount1(7))
}

fun oddCount(n: Int) = n / 2

fun oddCount1(n: Int): Int {
    var count = 0
    for (i in 0 until n) {
        if (i % 2 != 0) {
            count++
        }
    }
    return count
}