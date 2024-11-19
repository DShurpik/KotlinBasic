package codewars.lvl8

fun main() {
    println(digitize(35231).joinToString(prefix = "[", postfix = "]"))
    println(digitize1(35231).contentToString())
    println(digitize2(35231).contentToString())
}

fun digitize(n: Long): IntArray {

    return n.toString()
        .reversed()
        .map { it.toString().toInt() }
        .toIntArray()
}

fun digitize1(n: Long): IntArray {
    return n.toString().map(Character::getNumericValue).toIntArray().reversedArray()
}

fun digitize2(n: Long): IntArray {
    return n.toString()
        .toList()
        .map { it.toString().toInt() }
        .asReversed()
        .toIntArray()
}