package codewars.lvl8

fun main() {
    println(
        countPositivesSumNegatives(
            arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15)
        ).contentToString()
    )
    println(
        countPositivesSumNegatives(
            arrayOf(0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14)
        ).contentToString()
    )
    println(
        countPositivesSumNegatives1(
            arrayOf(0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14)
        ).contentToString()
    )
    println(
        countPositivesSumNegatives2(
            arrayOf(0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14)
        ).contentToString()
    )
}

fun countPositivesSumNegatives(input: Array<Int>?): Array<Int> {

    val res: Array<Int> = Array(2) { 0 }
    var sum: Int = 0
    var count: Int = 0
    if (input == null || input.size == 0) return arrayOf();
    for (i in input) {
        if (i < 0) sum += i
        if (i > 0) count++
    }

    return arrayOf(count, sum)
}

fun countPositivesSumNegatives1(input: Array<Int>?): Array<Int> {
    if (input == null || input.size == 0) return arrayOf();
    val sum = input.filter { it < 0 }.sum()
    val count = input.count { it > 0 }
    return arrayOf(count, sum)
}

fun countPositivesSumNegatives2(input: Array<Int>?): Array<Int> {
    if (input == null || input.isEmpty()) return emptyArray()
    val (positive, negative) = input.partition { it > 0 }
    return arrayOf(positive.size, negative.sum())
}

