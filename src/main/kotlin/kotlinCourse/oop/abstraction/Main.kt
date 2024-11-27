package kotlinCourse.oop.abstraction

fun main() {

    val person1: Person = Worker("John", 30)
    val person2: Person = Manager("Jack", 45)

    person1.sayHello()
    person2.sayHello()

    person1.startWorking(person1.name)
    person2.startWorking(person2.name)

    person1.prepareForBreak()
    person2.prepareForBreak()

    person1.prepareForLunch()
    person2.prepareForLunch()

    person1.cleanWorkingPlace()
    person2.cleanWorkingPlace()

    person1.goHome()
    person2.goHome()
}