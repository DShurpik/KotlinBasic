package kotlinCourse.oop

class Dog(val type: String) {
    var name = ""
    var age = 0

    init {
        println("по умолчанию конструктор") // Этот блок выполняется при создании объекта всегда
    }

    constructor(type: String, name: String) : this(type) {
        this.name = name
        println("1-й конструктор")
    }

    constructor(type: String, name: String, age: Int) : this(type) {
        this.name = name
        this.age = age
        println("2-й конструктор")
    }
}

fun main() {
    val pudel: Dog = Dog("Pudel")
    pudel.name = "Sharik"
    println("${pudel.name} is a ${pudel.type}")

    val doberman: Dog = Dog("Doberman", "Jack")
    println("${doberman.name} is a ${doberman.type}")

    val kolly: Dog = Dog("Kolly", "Sara", 10)
    println("${kolly.name} is a ${kolly.type} ${kolly.age}")
}