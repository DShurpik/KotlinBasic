package codewars.lvl7.strings

fun main() {
    println(accum("ZpglnRxqenU")) //Z-Pp-Ggg-Llll-Nnnnn-Rrrrrr-Xxxxxxx-Qqqqqqqq-Eeeeeeeee-Nnnnnnnnnn-Uuuuuuuuuuu
    println(accum1("ZpglnRxqenU"))
}

fun accum(s: String): String {
    val stringBuilder: StringBuilder = StringBuilder()
    for (i in 0 until s.length) {
        stringBuilder.append(s[i].uppercase())
        for (j in 0 until i) {
            stringBuilder.append(s[i].lowercase())
        }
        if (i < s.length - 1) {
            stringBuilder.append("-");
        }
    }
    return stringBuilder.toString()
}

fun accum1(s:String)=s
    .mapIndexed { i, c ->  c.uppercase()+c.lowercase().toString().repeat(i)}.joinToString("-")






