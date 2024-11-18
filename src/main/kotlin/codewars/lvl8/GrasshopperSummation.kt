package codewars.lvl8

fun main() {
    println(summation(8)) // 36
    println(summation1(8)) // 36
}

fun summation(n: Int): Int {
    var sum: Int = 0
    for (i in 0..n) {
        sum += i
    }
    return sum
}

fun summation1(n: Int) = (1..n).sum()