package codewars.lvl8

fun main() {
    println(removeChar("hello world!"))
    println(removeChar1("hello world!"))
}

fun removeChar(str: String): String {
    return str.substring(1, str.length - 1)
}

fun removeChar1(str: String) = str.drop(1).dropLast(1)