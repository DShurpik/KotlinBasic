package codewars.lvl8

fun main() {
    println(enough(10, 5, 5)) // 0
}

fun enough(cap: Int, on: Int, wait: Int): Int {
    if (cap - on - wait < 0) return Math.abs(cap - on - wait)
    return 0
}