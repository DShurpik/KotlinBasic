package codewars.lvl8

fun main() {
    println(stringToArray("I love arrays they are my favorite"))
}

fun stringToArray(s: String): List<String> {
    return s.split(" ").toList()
}