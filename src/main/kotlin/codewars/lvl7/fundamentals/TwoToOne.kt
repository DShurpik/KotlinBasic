package codewars.lvl7.fundamentals

fun main() {
    println(longest("agenerationmustconfrontthelooming", "codewarrs"))
    println(longest1("codewars", "codewars"))
    println(longest("aretheyhere", "yestheyarehere")) // aehrsty
}

fun longest(s1: String, s2: String): String {
    return s1.split("").union(s2.split("")).toSortedSet().joinToString("").replace(",", "")
}

fun longest1(s1:String, s2:String):String {
    return (s1 + s2).toSortedSet().joinToString("")
}