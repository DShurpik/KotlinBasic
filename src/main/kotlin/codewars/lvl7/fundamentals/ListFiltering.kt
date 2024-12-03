package codewars.lvl7.fundamentals

fun main() {
    println(filterList(listOf(1, 2, 'a', 'b'))) // listOf(1, 2)
    println(filterList1(listOf(1, 2, 'a', 'b')))
    println(filterList2(listOf(1, 2, 'a', 'b')))
}

fun filterList(l: List<Any>): List<Int> {
    return l.filter { it is Int }.toList().map { it as Int }.toList()
}

fun filterList1(l: List<Any>) = l.filterIsInstance<Int>()

fun filterList2(l: List<Any>): List<Int> {
    val res: MutableList<Int> = mutableListOf<Int>()
    for (i in l) {
        if (i is Int) res.add(i)
    }
    return res
}