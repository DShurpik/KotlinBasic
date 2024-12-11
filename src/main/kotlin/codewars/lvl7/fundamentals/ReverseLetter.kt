package codewars.lvl7.fundamentals

fun main() {
    println(reverseLetter("krishan"))   //  nahsirk
    println(reverseLetter("ultr53o?n")) //  nortlu

    println(reverseLetter1("krishan"))
    println(reverseLetter1("ultr53o?n"))
}

fun reverseLetter(str: String): String {
    return str.replace(Regex("[^a-zA-Zа-яА-Я]"), "").reversed()
}

fun reverseLetter1(str: String): String {
    var s = ""
    for (i in str.length - 1 downTo 0) {
        if (str.get(i) >= 'a' && str.get(i) <= 'z') s += str.get(i)
    }
    return s
}