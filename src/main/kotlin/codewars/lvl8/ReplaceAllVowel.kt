package codewars.lvl8

fun main() {
    println(replace("ABCDE"))
}

fun replace(s: String): String = s.replace(Regex("[aeiouAEIOU]"), "!")