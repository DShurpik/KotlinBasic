package kotlinCourse.oop.inheritance

class Manager (
    name: String,
    age: Int
): Person(name, age, salary = 20000) {

    override fun sayBye() {
        super.sayBye()
        println("$name says Best regards!")
    }
}