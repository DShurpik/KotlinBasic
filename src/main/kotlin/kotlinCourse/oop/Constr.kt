package kotlinCourse.oop

fun main() {
    val car = Car("Opel", 30)
    car.printInfo()
    val car1 = Car("Opel", 30, 2.0)
    car1.printInfo()
    val car2 = Car("Opel", 30, 2.0, "Diesel")
    car2.printInfo()

}

class Car(name: String, age: Int){
    var name = name
    var age = age
    var volume: Double? = null
    var engineType: String? = null

    constructor(name: String, age: Int, volume: Double) : this(name, age) {
        this.volume = volume
    }

    constructor(name: String, age: Int, volume: Double, engineType: String) : this(name, age, volume) {
        this.engineType = engineType
    }

    fun printInfo() {
        println("Name: $name, Age: $age, Volume: $volume, Engine type: $engineType")
    }
}