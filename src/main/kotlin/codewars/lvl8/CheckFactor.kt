package codewars.lvl8

fun main() {
    println(checkForFactor(63, 7)) // true
    println(checkForFactor(2453, 5)) // false
}

fun checkForFactor(base: Int, factor: Int): Boolean {
    return base % factor == 0
}