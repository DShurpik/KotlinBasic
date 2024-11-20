package codewars.lvl8

fun main() {
    println(invert(intArrayOf(1, 2, 3, 4, 5)).contentToString())
    println(invert1(intArrayOf(1, 2, 3, 4, 5)).contentToString())
    println(invert2(intArrayOf(1, 2, 3, 4, 5)).contentToString())
}

fun invert(arr: IntArray): IntArray = arr.map { it * -1 }.toIntArray()

fun invert1(arr: IntArray): IntArray = arr.map { -it }.toIntArray()

fun invert2(arr: IntArray): IntArray {
    val res: IntArray = IntArray(arr.size)
    for (i in 0 until arr.size) {
        res[i] = -arr[i]
    }
    return res
}