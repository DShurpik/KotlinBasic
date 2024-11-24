package kotlinCourse.oop

fun main() {
    val worker1: Worker = Worker()
    val worker2: Worker = Worker()
    worker2.name = "John"
    worker2.age = 30
    worker2.position = "Manager"
    worker2.salary = 10000

    println("${worker1.name} name, ${worker1.age} age, ${worker1.position} position, ${worker1.salary} salary")
    println("${worker2.name} name, ${worker2.age} age, ${worker2.position} position, ${worker2.salary} salary")
}