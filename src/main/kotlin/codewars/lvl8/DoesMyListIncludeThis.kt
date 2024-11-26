package codewars.lvl8

fun main() {
    println(include(intArrayOf(1, 2, 4, 5), 3)) // false
    println(include1(intArrayOf(1, 2, 4, 5), 3)) // false
    println(include2(intArrayOf(1, 2, 4, 5), 3))
}

fun include(arr: IntArray, item: Int): Boolean = item in arr

fun include1(arr: IntArray, item: Int) = arr.contains(item)

fun include2(arr: IntArray, item : Int) = arr.any { it == item }