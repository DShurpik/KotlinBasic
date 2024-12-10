package codewars.lvl7.fundamentals

fun main() {
    //println(nbDig(11011, 2)) // 9481
    println(nbDig(10, 1)) // 4
    println(nbDig1(11, 1)) // 6
    println(nbDig2(11011, 2)) // 9481
}

fun nbDig(n: Int, d: Int): Int {
    var count = 0
    for (i in 0..n) {
        count += Regex("$d").findAll((i * i).toString()).count()
    }
    return count
}

fun nbDig1(n: Int, d: Int): Int = (0..n).joinToString { "${it * it}" }.count { "$it" == "$d" }

fun nbDig2(n:Int, d:Int):Int {
    return (0..n).joinToString { (it * it).toString() }
        .count { it.toString() == d.toString() }
}