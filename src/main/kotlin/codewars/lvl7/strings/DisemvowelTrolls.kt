package codewars.lvl7.strings

fun main() {
   println(disemvowel("This website is for losers LOL!")) // Ths wbst s fr lsrs LL!
    println(disemvowel1("This website is for losers LOL!"))
}

fun disemvowel(str: String): String = str.replace(Regex("[aeiouAEIOU]"), "")

fun disemvowel1(str: String): String {
    val vovels = listOf("a", "e", "i", "o", "u")
    return str.filter { vovels.contains(it.lowercase()).not() }
}