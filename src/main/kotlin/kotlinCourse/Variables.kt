package kotlinCourse

val strGlobal = "Hello world!"

fun main() {
    /** Если число не выходит за предел Int, то все инициализируется как Int */

    // целочисленные
    val intNum1: Int = -2147483648 // 32 bit
    val intNum2: Int = 2147483647 // 32 bit
    val intNum3: Int? = null // в переменную записывается либо инт либо null
    val longNum: Long // 64 bit
    val shortNum: Short // 16 bit
    val byteNum: Byte // 8 bit
    val unsignedNum: UInt = 214748648u // 32 bit

    // вещественные
    val doubleNum: Double = 234.42 // 64 bit
    val floatNum: Float = 847.2f // 32 bit

    // строковые
    val stringValue: String = "Это строка фоырпарвыапрфвра"
    val charValue: Char = '1'

    // логические
    val trueValue: Boolean = true
    val falseValue: Boolean = false

    /** var - можно изменять и перезаписывать; val - как константа final Java*/

    val a: Int = 150 // примитивный тип        == проверки структурного равенства .equals()
    val b: Int? =
        150 // Int? - Ссылочный тип  === проверяет ссылочное равенство. ссылаются ли переменные на один и тот же объект в памяти.
    val c = b

    println(a === c)


    /** Проверки на равенство: a == b и a != b
    Операторы сравнения: a < b, a > b, a <= b, a >= b
    Создание диапазона и проверка диапазона: a..b, x in a..b, x !in a..b */

    val ex: Int = 100
    println(ex in 50..150) // Проверка что 100 входит в диапозон 50-150

    println(strGlobal)

}
