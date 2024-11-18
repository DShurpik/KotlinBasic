package codewars.lvl8

val a: IntArray = intArrayOf(1, 2, 3, 4, 5) // IntArray используется для представления примитивных массивов int
val b: Array<Int> = arrayOf(1, 2, 3, 4, 5) // Array<Int> — это объектный массив, содержащий объекты типа Int

fun main() {
    println(sum(a))
}

fun sum(numbers: IntArray): Int {
    var sum: Int = 0
    for (i in numbers) {
        if (i > 0) sum += i
    }
    return sum
}