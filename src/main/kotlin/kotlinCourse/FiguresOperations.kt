package kotlinCourse

fun main() {
    val x = 5 / 2
    // println(x == 2.5) // ОШИБКА: Оператор '==' не может быть применен к 'Int' и 'Double'
    println(x == 2) // true


    // Чтобы вернуть тип с плавающей точкой, явно преобразуйте один из аргументов в тип с плавающей точкой.
    val x1 = 5 / 2.toDouble()
    println(x1 == 2.5) // true

    val intNum1: Int = 10
    val intNum2: Int = 3
    println(intNum1 / intNum2) // 3

    val floatNum1: Float = 10f
    val floatNum2: Float = 3f
    println(floatNum1 / floatNum2) // 3.3333333

    val doubleNum1: Double = 10.0
    val doubleNum2: Double = 3.0
    println(doubleNum1 / doubleNum2) // 3.3333333333333335

    println(doubleNum1::class)
    println(doubleNum2::class.simpleName + " Simple name")
}