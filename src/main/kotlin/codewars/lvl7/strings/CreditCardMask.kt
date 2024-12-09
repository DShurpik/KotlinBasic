package codewars.lvl7.strings

fun main() {
    println(maskify("SF&SDfgsd2eA")) // "########d2eA"
    println(maskify("test")) // test
    println(maskify1("SF&SDfgsd2eA")) // "########d2eA"
}

fun maskify(cc: String): String {
    if (cc.length <= 4) return cc
    var temp = cc.subSequence(cc.length - 4, cc.length)
    var str = StringBuilder()
    for (i in 0..cc.length - 5) str.append('#')
    return str.append(temp).toString()
}

fun maskify1(cc: String) = cc.takeLast(4).padStart(cc.length, '#')