package codewars.lvl7.fundamentals

fun main() {
    println(highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4")) // 42 -9
}

fun highAndLow(numbers: String): String {
    return "${numbers.split(" ").map { it.toInt() }.max()} ${numbers.split(" ").map { it.toInt() }.min()}"
}