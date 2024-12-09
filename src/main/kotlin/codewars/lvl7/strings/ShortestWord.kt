package codewars.lvl7.strings

fun main() {
   println(findShort("Let's travel abroad shall we")) // 2
    println(findShort1("Let's travel abroad shall we")) // 2
    println(findShort2("Let's travel abroad shall we"))
}

fun findShort(s: String): Int {
    val arr: List<String> = s.split(" ")
    var min = Int.MAX_VALUE
    for (i in arr) {
        if (i.length < min) min = i.length
    }
    return min
}

fun findShort1(s: String): Int {
    return s.split(" ").map { it.length }.min()
}

fun findShort2(s: String): Int = s.split(" ").minOf{it.length}