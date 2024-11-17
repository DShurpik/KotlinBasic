package codewars.lvl8

fun main() {
    println(repeatStr(4, "a"))
    println(repeatStr1(4, "a"))
}

fun repeatStr1(r: Int, str: String) = str.repeat(r)

fun repeatStr(r: Int, str: String) : String {
    var s: String = ""
    for (i in 1..r) {
        s += str
    }
    return s
}