package kotlinCourse

fun main() {
    println(getName())
    println(getAge())
    println("Введите пол ${getSex()}")
    printNameAge(30, "John")
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