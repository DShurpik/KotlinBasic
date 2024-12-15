package codewars.lvl7.strings

fun main() {
    println(capitalize("abcdef")) // "AbCdEf", "aBcDeF"
    println(capitalize1("abcdef")) // "AbCdEf", "aBcDeF"
}

fun capitalize(text: String): List<String> {
    var str1 = StringBuilder()
    var str2 = StringBuilder()
    for (i in 0 until text.length) {
        if (i % 2 == 0) {
            str1.append(text.get(i).uppercase())
            str2.append(text.get(i).lowercase())
        } else {
            str1.append(text.get(i).lowercase())
            str2.append(text.get(i).uppercase())
        }
    }
    return listOf(str1.toString(), str2.toString())
}

fun capitalize1(text: String): List<String> {
    return listOf(
        text.mapIndexed { index, c -> if (index % 2 == 0) c.uppercase() else c }.joinToString(""),
        text.mapIndexed { index, c -> if (index % 2 == 1) c.uppercase() else c }.joinToString("")
    )
}
