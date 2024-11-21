package codewars.lvl8

fun main() {
    println(grow(intArrayOf(1, 2, 3, 4))) // 24
    println(grow1(intArrayOf(1, 2, 3, 4))) // 24
}

fun grow(arr: IntArray): Int {
    var sum: Int = 1
    for (i in arr) sum *= i
    return sum
}

fun grow1(arr: IntArray): Int = arr.reduce { a, b -> a * b }