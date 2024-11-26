package kotlinCourse.oop.inheritance

fun main() {
    val person1: Person = Person("Jack", 30, 20000)
    person1.sayHello()
    person1.sayBye()

    val person2: Worker = Worker("John", 45)
    person2.sayHello()
    println("${person2.name}'s salary is ${person2.salary}")
    person2.sayBye()

    val person3: Manager = Manager("Mick", 55)
    person3.sayHello()
    println("${person3.name}'s salary is ${person3.salary}")
    person3.sayBye()
}