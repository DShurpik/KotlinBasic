package codewars.lvl8

fun main() {
    println(isDivisible(100, 5, 10))
}

fun isDivisible(n: Int, x: Int, y: Int) = n % x == 0 && n % y == 0