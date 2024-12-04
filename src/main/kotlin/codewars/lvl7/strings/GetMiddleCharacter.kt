package codewars.lvl7.strings

fun main() {
    println(getMiddle("test")) // es
    println(getMiddle("testing")) // t
}

fun getMiddle(word: String): String {
    val index: Int = word.length / 2
    if (word.length % 2 == 0) {
        return word.substring(index - 1, index + 1)
    }
    return word[index].toString()
}