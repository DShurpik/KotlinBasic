package codewars.lvl8

fun main() {
    println(countingSheep(3))
    println(countingSheep1(3))
}

fun countingSheep(num: Int): String{
    var res: String = ""
    for (i in 1..num) {
        res = "$res$i sheep..."
    }
    return res
}

fun countingSheep1(num: Int) : String = (1..num).map { i -> "$i sheep..." }.joinToString("")