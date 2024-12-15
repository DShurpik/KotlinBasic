package codewars.lvl7.fundamentals

fun main() {
    println(angle(3)) // 180
    println(angle(4)) // 360
}

fun angle(n: Int): Int {
    var sum = 180
    for (i in 3 until n) {
        sum += 180
    }
    return sum
}