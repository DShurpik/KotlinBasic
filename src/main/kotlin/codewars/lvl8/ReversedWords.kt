package codewars.lvl8

fun main() {
    println(reverseWords("Just Split it!!"))
    println(reverseWords1("Just Split it!!"))
}

fun reverseWords(str: String): String = str.split(" ").reversed().joinToString(" ")

fun reverseWords1(str: String): String{
    var arr: List<String> = str.split(" ")
    var res: String = ""
    for (i in arr.size - 1 downTo 0) {
        res += arr[i] + " "
    }
    return res.trim()
}