package codewars.lvl8

fun main() {
    println(past(1, 0, 1))
}

fun past(h: Int, m: Int, s: Int): Int = (h * 3600 + m * 60 + s) * 1000