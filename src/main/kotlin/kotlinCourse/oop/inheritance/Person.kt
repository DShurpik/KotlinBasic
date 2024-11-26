package kotlinCourse.oop.inheritance

//Чтобы класс можно было расширять, необходимо указать это явно.
// Для этого нужно перед ключевым словом class у родителя написать ключевое слово open.
open class Person(
    val name: String,
    val age: Int,
    val salary: Int = 10000
) {

    // Для переопределения метода надо сделать open fun метод и создать с таким же именем
    open fun sayHello() {
        println("$name says Hello")
    }

    open fun sayBye() {
        println("$name says Bye")
    }

}