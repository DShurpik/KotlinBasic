package codewars.lvl7.strings

fun main() {
    println(solve("CODe")) // CODE
    println(solve("COde")) // code

    println(solve1("CODe"))
    println(solve1("COde"))
}

fun solve(s: String): String {
    val upper = s.count { it.isUpperCase() }
    val lower = s.count { it.isLowerCase() }
    return if (upper > lower) s.uppercase()
    else if (lower > upper) s.lowercase()
    else s.lowercase()
}

fun solve1(s: String): String {
    var upper = 0
    var lower = 0
    for (i in s) {
        if (i in 'A'..'Z') upper++
        else lower++
    }
    return if (upper > lower) s.uppercase()
    else if (lower > upper) s.lowercase()
    else s.lowercase()
}