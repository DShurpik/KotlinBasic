package codewars.lvl8

fun main() {
    println(reverseSeq(5))
    println(reverseSeq1(5))
    println(reverseSeq2(5))
}

fun reverseSeq(n: Int): List<Int> {
    val arr: Array<Int> = Array(n) { 0 }
    for (i in 0 until n) {
        arr[i] = n - i
    }
    return arr.asList()
}

fun reverseSeq1(n: Int) = (n downTo 1).toList()

fun reverseSeq2(n: Int) = n.downTo(1).toList()