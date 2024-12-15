package codewars.lvl7.fundamentals

import kotlin.math.sqrt

fun main() {
    println(predictAge(65, 60, 75, 55, 60, 63, 64, 45)) // 86
    println(predictAge1(65, 60, 75, 55, 60, 63, 64, 45)) // 86
}

fun predictAge(age1: Int, age2: Int, age3: Int, age4: Int, age5: Int, age6: Int, age7: Int, age8: Int): Int{
    return sqrt(mutableListOf(age1, age2, age3, age4, age5, age6, age7, age8).map { it * it }.sum().toDouble()).toInt() / 2
}

fun predictAge1(vararg age:Int): Int{
    return sqrt(age.sumOf { it * it }.toDouble()).toInt() / 2
}