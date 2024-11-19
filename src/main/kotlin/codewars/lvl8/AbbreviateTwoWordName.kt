package codewars.lvl8

fun main() {
    println(abbrevName("Sam Harris")) // S.H
    println(abbrevName1("Sam Harris")) // S.H
}

fun abbrevName(name: String): String {
    var arr: List<String> = name.uppercase().split(" ")
    return arr[0].subSequence(0, 1).toString() + "." + arr[1].subSequence(0, 1).toString()
}

fun abbrevName1(name: String) = name.split(" ").map { it.first().uppercase() }.joinToString(".")