package kotlinCourse.oop.inheritance

class Worker(
    name: String,
    age: Int
) : Person(name, age) {

    // override надо написать перед методом с таким же именем как в родительском классе
    // super – это обращение к методам и свойствам суперкласса.
    override fun sayHello() {
        super.sayHello()
        println("$name shakes hand")
    }
}