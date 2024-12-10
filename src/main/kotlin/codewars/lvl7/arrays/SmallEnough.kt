package codewars.lvl7.arrays

fun main() {
    println(smallEnough(intArrayOf(66, 101), 200)) // true
    println(smallEnough(intArrayOf(78, 117, 110, 99, 104, 117, 107, 115), 100)) // false

    println(smallEnough1(intArrayOf(66, 101), 200)) // true
    println(smallEnough1(intArrayOf(78, 117, 110, 99, 104, 117, 107, 115), 100)) // false

    println(smallEnough2(intArrayOf(66, 101), 200)) // true
    println(smallEnough2(intArrayOf(78, 117, 110, 99, 104, 117, 107, 115), 100)) // false

}

fun smallEnough(a : IntArray, limit : Int) : Boolean {
    for (i in a) {
        if (i > limit) return false
    }
    return true
}

fun smallEnough1(a: IntArray, limit: Int) = a.all { it <= limit }

fun smallEnough2(a : IntArray, limit : Int) = a.none { it > limit }