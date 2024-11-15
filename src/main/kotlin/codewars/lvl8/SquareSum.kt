package codewars.lvl8

fun main() {
    val a: Array<Int> = arrayOf(1, 2, 2)
    println(squareSum(a))
}

fun squareSum(n: Array<Int>): Int {
    var sum: Int = 0
    for(i in n) {
        sum += i * i
    }
    return sum
}