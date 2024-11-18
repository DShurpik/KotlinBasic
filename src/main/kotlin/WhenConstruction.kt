fun main() {
    val figure: Int = readln()!!.toInt()

    when (figure) {
        10 -> println("Enter 10")
        20 -> println("Enter 20")
        30 -> println("Enter 30")
        else -> println("Enter other") // Работает как default в switch-case Java
    }

    // Возвращающее значение when
    val userAge: Int = readln()!!.toInt()
    val consoleNumber: String = when (userAge) {
        10 -> "Ввели число 10"
        20 -> "Ввели число 20"
        42 -> "Ввели число 42"
        else -> "Введено другое число"
    }

    println(consoleNumber)
}