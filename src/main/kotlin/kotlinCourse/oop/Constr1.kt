package kotlinCourse.oop

fun main() {
    val bike1 = Bike("BMX", 3)
    bike1.printInfo()

    val bike2 = Bike("Stels", 4, "Mountain")
    bike2.printInfo()
}

class Bike(name: String, age: Int){
    var name: String
    var age: Int
    var type: String? = null
    init {
        this.name = name
        this.age = age
    }

    constructor(name: String, age: Int, type: String) :this(name, age){
        this.type = type
    }

    fun printInfo() {
        println("Name: $name, Age: $age, Type: $type")
    }
}