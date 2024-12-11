package codewars.lvl7.fundamentals

fun main() {
    println(maxMultiple(37, 200)) // 185
}

fun maxMultiple(d: Int, b: Int): Int {
    var max = 0
    for (i in 0..b) {
        if (i % d == 0) max = i
    }
    return max
}