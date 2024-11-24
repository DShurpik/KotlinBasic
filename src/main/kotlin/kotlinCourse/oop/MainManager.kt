package kotlinCourse.oop

fun main() {
    var manager1: Manager = Manager("Bill", 45, "Head of department", 10000)
    var manager2: Manager = Manager("Lex", 50, "CTO", 20000)
    var manager3: Manager = Manager("Max", 35, "Trainee", 5000, true)

    println("${manager1.name} name, ${manager1.age} age, ${manager1.position} position, ${manager1.salary} salary")
    println("${manager2.name} name, ${manager2.age} age, ${manager2.position} position, ${manager2.salary} salary")
    println("${manager3.name} name, ${manager3.age} age, ${manager3.position} position, ${manager3.salary} salary, ${manager3.isBePromoted} promoted")
}