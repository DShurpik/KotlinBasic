package kotlinCourse

fun main() {
    val i1 = 1
    val i2 = 0

    try {
        println(i1 / i2)
    } catch (e: ArithmeticException) {
        println("На ноль делить нельзя")
    } finally {
        /** Блок finally выполняется ВСЕГДА!!!*/
        println("Программа остановлена")
    }

    print("Введи день недели: ")
    val dayOfWeek = readln().toInt()
    if (dayOfWeek !in 1..7) {
        throw IllegalArgumentException("Такого дня не существует")
    } else {
        println("Введен $dayOfWeek день недели")
    }
}