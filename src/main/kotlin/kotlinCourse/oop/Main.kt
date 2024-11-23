package kotlinCourse.oop

fun main() {
    val person1: Person = Person(
        id = 1,
        name = "John",
        socialStatus = "Worker",
        age = 30,
        inContactList = true
    )

    val person2: Person = Person(
        id = 2,
        name = "Jack",
        socialStatus = "Teacher",
        age = 45
    )

    println("${person1.socialStatus} has name ${person1.name} with ${person1.age} age, is he in contact list ${person1.inContactList}")
    println("${person2.socialStatus} has name ${person2.name} with ${person2.age} age, is he in contact list ${person2.inContactList}")

    // Изменение значений
    person2.inContactList = true
    println("${person2.name} has been added to contact list ${person2.inContactList}")

    person1.greeting(person1.name)
    person2.greeting(person2.name)

    person1.deleteFromContactList()
    person2.deleteFromContactList()

    person1.addToContactList()
    person2.addToContactList()
}