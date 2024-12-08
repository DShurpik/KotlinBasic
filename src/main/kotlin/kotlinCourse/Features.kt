package kotlinCourse

fun main() {
    println(getName())
    println(getAge())
    println("Введите пол ${getSex()}")
    printNameAge(30, "John")
    println(sum(1, 2, 3, 4)) // Вывод: 10
    println(sum(5, 10))      // Вывод: 15
    println(joinStrings(", ", "Kotlin", "is", "awesome"))
}

fun getName(): String {
    print("Введите имя : ")
    return readlnOrNull().toString()
}

fun getAge(): Int? {
    print("Введите возраст: ")
    return readlnOrNull()?.toInt()
}

fun getSex() : String = readlnOrNull().toString()

fun printNameAge(age: Int, name: String) {
    println("Age is $age and name is $name")
}

/** vararg в Kotlin используется для передачи переменного количества аргументов в функцию.
 * Все переданные параметры автоматически преобразуются в массив внутри функции.*/
fun sum(vararg numbers: Int): Int {
    return numbers.sum()
}

fun joinStrings(separator: String, vararg strings: String): String {
    return strings.joinToString(separator)
}