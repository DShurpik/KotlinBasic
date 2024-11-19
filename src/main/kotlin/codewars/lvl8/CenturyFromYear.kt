package codewars.lvl8

fun main() {
    println(century(1705))
    println(century(1601))
}

fun century(number: Int): Int {
    return (number - 1) / 100 + 1
}