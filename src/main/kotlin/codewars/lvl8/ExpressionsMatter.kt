package codewars.lvl8

fun main() {
    println(expressionsMatter(2, 2, 2)) // 8
    println(expressionsMatter1(2, 2, 2)) // 8
}

fun expressionsMatter(a: Int, b: Int, c: Int): Int {
    return listOf<Int>(a * (b + c), a * b * c, a + b * c, (a + b) * c, a + b + c).max()
}

fun expressionsMatter1(a: Int, b: Int, c: Int): Int {
    return maxOf(a + b + c, a * (b + c), (a + b) * c, a * b * c)
}