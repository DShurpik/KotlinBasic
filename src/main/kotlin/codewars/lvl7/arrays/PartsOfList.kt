package codewars.lvl7.arrays


fun main() {
    val a = partlist(arrayOf<String>("1", "2", "3", "4"))
    for (i in a.indices) {
        println(a[i].contentToString())
    }
}

fun partlist(arr:Array<String>):Array<Array<String>> {
    return (1 until arr.size).map { i ->
        val firstPart = arr.slice(0 until i).joinToString(" ")
        val secondPart = arr.slice(i until arr.size).joinToString(" ")
        arrayOf(firstPart, secondPart)
    }.toTypedArray()
}