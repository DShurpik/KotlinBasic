package kotlinCourse.oop

class Person(
    // Поля класса, Инициализация свойства значением по умолчанию
    val id: Int,
    val name: String,
    val socialStatus: String,
    val age: Int,
    var inContactList: Boolean = false,
) {
    fun greeting(name: String) {
        println("Hello, I'm $name")
    }

    fun deleteFromContactList() {
        println("User $name was deleted from contact list")
        inContactList = false
    }

    fun addToContactList() {
        println("User $name was added to contact list")
        inContactList = true
    }
}