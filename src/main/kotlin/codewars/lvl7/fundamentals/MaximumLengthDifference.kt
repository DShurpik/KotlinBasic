package codewars.lvl7.fundamentals

fun main() {
    val s1 = arrayOf<String>("hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz")
    val s2 = arrayOf<String>("cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww")
    println(mxdiflg(s1, s2)) // 13

    val s11 = arrayOf<String>("ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh")
    val s21 = arrayOf<String>("bbbaaayddqbbrrrv")
    println(mxdiflg1(s11, s21)) // 10
}

fun mxdiflg(a1:Array<String>, a2:Array<String>):Int {
    if (a1.isEmpty() || a2.isEmpty()) return -1
    var min1 = Int.MIN_VALUE
    for (i in a1) {
        for (j in a2) {
            if ((Math.abs(i.length - j.length) > min1)) {
                min1 = Math.abs(i.length - j.length)
            }
        }
    }
    return min1
}

fun mxdiflg1(a1:Array<String>, a2:Array<String>):Int {
    if (a1.isEmpty() || a2.isEmpty()) return -1
    val first = a2.map { it.length }.max() - a1.map { it.length }.min()
    val second = a1.map { it.length }.max() - a2.map { it.length }.min()
    return maxOf(first, second)
}