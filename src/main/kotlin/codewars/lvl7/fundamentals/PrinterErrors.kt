package codewars.lvl7.fundamentals

fun main() {
    println(printerError("aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz")) // "3/56"
    println(printerError1("aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz")) // "3/56"
}

fun printerError(s: String): String {
    var i1 = 0
    for (i in s.toCharArray()) {
        if (i.code > 109) i1++
    }
    return "$i1/${s.length}"
}

fun printerError1(s: String): String {
    return "${s.count { it.code > 109 }}/${s.length}"
}