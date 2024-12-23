package kotlinCourse

fun main() {
    val intVal1 = 10
    val intVal2 = 10
    val intVal3 = 13
    val str1 = "John"
    val str2 = "John"
    val str3 = "Jack"
    println(intVal1 == intVal2) // true 10 = 10
    println(intVal2 == intVal3) // false 10 != 15
    println(str1 == str2) // true John = John
    println(str2 == str3) // false John != Jack
    println("CAR CLASS")

    val car1 = Car("Opel", 30)
    val car2 = Car("Opel", 30)
    println(car1 == car2) // false т.к car1 и car2 два разных объекта в памяти, хоть и с одинаковыми значениями
    val car3 = car2
    println(car2 == car3) // true т.к car3 ссылается на объект car2
    // а == проверяет ссылки на объект для НЕ ПРИМИТИВНЫХ ТИПОВ!!! т.е === вызывает под капотом метод equals()
    // Чтобы == выводило true, необходимо override fun equals со своим сравнением
    println("HASHSET CONTAINS")
    val carSet = hashSetOf(car1)
    println(carSet.contains(car2)) // false т.к у объектов разный хэш код.
    // Переопределенный метод hashCode приводит хэш коды к равному значению и 25 строка меняется на true
    println(car1.hashCode())
    println(car2.hashCode())
    println("Class.toString()")
    println(car1.toString()) // kotlinCourse.Car@48db2b6 после @ хэш код в 16-й системе
    println(car2.toString()) // kotlinCourse.Car@48db2b6
    // После переопределения метода toString() получается Car(name='Opel', age=30)
    println("BIKES")

    val bike1 = Bike("Ducatti", 5)
    val bike2 = Bike("Ducatti", 5)
    println(bike1 == bike2)
    val bikeSet = hashSetOf(bike1)
    println(bikeSet.contains(bike2))
    println(bike1.hashCode())
    println(bike2.hashCode())
    println(bike1.toString())
    println(bike2.toString())
    // Дата класс переопределяет все методы под капотом и выводит все значения в читаемом виде

}

class Car(val name: String, val age: Int) {
    override fun equals(other: Any?): Boolean {
        return other is Car && other.name == name && other.age == age
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + age
        return result
    }

    override fun toString(): String {
        return "Car(name='$name', age=$age)"
    }

}

data class Bike(val name: String, val age: Int)