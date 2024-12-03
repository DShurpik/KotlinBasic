package codewars.lvl7.strings

fun main() {
    println(getCount("abracadabra")) // 5
    println(getCount1("abracadabra")) // 5
}

fun getCount(str: String): Int {
    return str.length - str.replace(Regex("[aeiou]"), "").length
}

fun getCount1(str : String) = str.count { it in "aeiou" }