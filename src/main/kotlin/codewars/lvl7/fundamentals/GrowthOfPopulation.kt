package codewars.lvl7.fundamentals

fun main() {
    println(nbYear(1500, 5.0, 100, 5000)) // 15
    println(nbYear(1500000, 2.5, 10000, 2000000)) // 10
}

fun nbYear(pp0: Int, percent: Double, aug: Int, p: Int): Int {
    var i = pp0
    var count = 0
    while (i < p) {
        i = (i + (i * (percent / 100) + aug)).toInt()
        count++
    }
    return count
}