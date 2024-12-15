package codewars.lvl7.arrays

fun main() {
    println(evenNumbers(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9), 3)) // 4, 6, 8
    println(evenNumbers(listOf(-22, 5, 3, 11, 26, -6, -7, -8, -9, -8, 26), 2)) // -8, 26

    println(evenNumbers1(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9), 3)) // 4, 6, 8
    println(evenNumbers1(listOf(-22, 5, 3, 11, 26, -6, -7, -8, -9, -8, 26), 2)) // -8, 26
}

fun evenNumbers(array: List<Int>, number: Int): List<Int> {
    val resultList: MutableList<Int> = mutableListOf()
    for (i in array) {
        if (i % 2 == 0) {
            resultList.add(i)
        }
    }
    //return resultList.subList(resultList.lastIndex + 1 - number, resultList.lastIndex + 1)
    return resultList.takeLast(number)
}

fun evenNumbers1(array: List<Int>, number: Int): List<Int> {
    return array.filter { it % 2 == 0 }.toList().takeLast(number)
}