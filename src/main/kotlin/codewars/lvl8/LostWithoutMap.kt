package codewars.lvl8

fun main() {
    println(maps(intArrayOf(1, 2, 3, 4, 5)).contentToString())
    println(maps1(intArrayOf(1, 2, 3, 4, 5)).contentToString())
    println(maps2(intArrayOf(1, 2, 3, 4, 5)).contentToString())
}

fun maps(x: IntArray): IntArray = x.map { it * 2 }.toIntArray()

fun maps1(x: IntArray): IntArray {
    var arr: IntArray = IntArray(x.size)
    for (i in 0 until x.size) {
        arr[i] = x[i] * 2
    }
    return arr
}

fun maps2(x: IntArray): IntArray {
    var arr: IntArray = intArrayOf()
    for (i in x) {
        arr += i * 2
    }
    return arr
}