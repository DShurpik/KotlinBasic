package kotlinCourse

fun main() {
    /**
    val a: Int? = 1 // "Обёрнутый" Int (java.lang.Integer)
    val b: Long? = a // неявное преобразование возвращает "обёрнутый" Long (java.lang.Long)
    print(b == a)
    Данное выражение выведет "false" т. к. метод equals() типа Long предполагает, что вторая часть выражения также имеет тип Long */

    // неявное преобразование меньших типов в большие НЕ происходит!!!

    val b: Byte = 1
    //val a: Int = b  ОШИБКА т.к byte нельзя привести в Int
    val c: Int = b.toInt() // Парсим в Int
    //toByte(): Byte
    //toShort(): Short
    //toInt(): Int
    //toLong(): Long
    //toFloat(): Float
    //toDouble(): Double
    //toChar(): Char
}