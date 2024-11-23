package codewars.lvl8

fun main() {
    println(doubleChar("String"))
    println(doubleChar1("String"))
}

fun doubleChar(s: String): String {
    var res: String = ""
    for (i in s) {
        res = res + s[s.indexOf(i)] + s[s.indexOf(i)]
    }
    return res
}

fun doubleChar1(s: String): String = s.map { "$it$it" }.joinToString("")