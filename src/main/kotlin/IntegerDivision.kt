fun main() {
    val x = 5 / 2
    // println(x == 2.5) // ОШИБКА: Оператор '==' не может быть применен к 'Int' и 'Double'
    println(x == 2) // true


    // Чтобы вернуть тип с плавающей точкой, явно преобразуйте один из аргументов в тип с плавающей точкой.
    val x1 = 5 / 2.toDouble()
    println(x1 == 2.5) // true
}