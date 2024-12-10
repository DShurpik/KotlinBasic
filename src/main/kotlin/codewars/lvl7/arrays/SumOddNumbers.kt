package codewars.lvl7.arrays

fun main() {
    println(rowSumOddNumbers(5)) // 21    23    25    27    29
    println(rowSumOddNumbers(13)) // 2197
    println(rowSumOddNumbers(19)) // 6859
}

fun rowSumOddNumbers(n: Int): Int {
    val firstList = mutableListOf<Int>()
    var j = n * (n - 1) + 1
    for (i in 0 until n) {
        firstList.add(j)
        j += 2
    }
    return firstList.sum()
}

