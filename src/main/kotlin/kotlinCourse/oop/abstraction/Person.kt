package kotlinCourse.oop.abstraction

//ключевое слово abstract, с помощью которого можно запретить создавать экземпляры базового класса.
// То есть абстрактный класс предназначен по сути только для описания общих данных будущих экземпляров


//Чтобы добавить реализацию интерфейсов к базовому классу – пишется название интерфейсов через двоеточие,
// но без использования скобок. Перечисляются они через запятую.В классе потомке среда разработки сразу
// подсвечивает ошибку. Необходимо имплементировать (или реализовать) абстрактные методы.
abstract class Person : Actions, EndOfDay {
    //Абстрактные классы также могут иметь абстрактные свойства и методы.
    // Свойства в таком случае не проинициализированны, а методы не имеют тела.
    abstract val name: String
    abstract val age: Int
    abstract fun sayHello()
}

// необходимо реализовать все абстрактные свойства и методы
class Worker(override val name: String, override val age: Int) : Person() {
    override fun sayHello() {
        println("$name ${this::class.simpleName} shakes hand")
    }

    override fun prepareForBreak() {
        println("$name ${this::class.simpleName} takes cigarettes for break")
    }

    override fun prepareForLunch() {
        println("$name ${this::class.simpleName} heats his lunch by microwave")
    }

    override fun cleanWorkingPlace() {
        println("$name ${this::class.simpleName} cleans his working room")
    }

    override fun goHome() {
        println("$name ${this::class.simpleName} goes home by bus")
    }
}

class Manager(override val name: String, override val age: Int) : Person() {
    override fun sayHello() {
        println("$name ${this::class.simpleName} says Good afternoon")
    }

    override fun prepareForBreak() {
        println("$name ${this::class.simpleName} takes a cup of coffee for break")
    }

    override fun prepareForLunch() {
        println("$name ${this::class.simpleName} orders a cafe for lunch")
    }

    override fun cleanWorkingPlace() {
        println("$name ${this::class.simpleName} hides documents to table")
    }

    override fun goHome() {
        println("$name ${this::class.simpleName} takes a taxi")
    }
}

