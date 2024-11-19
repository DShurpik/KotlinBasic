package codewars.lvl8

fun main() {
    println(stringToNumber("1234")) // 1234
    println(stringToNumber1("1234")) // 1234
}

fun stringToNumber(str: String): Int {
    return str.toInt()
}

fun stringToNumber1(str: String): Int {
    return Integer.parseInt(str)
}