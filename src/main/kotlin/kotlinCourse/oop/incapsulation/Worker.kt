package kotlinCourse.oop.incapsulation

//public этот модификатор проставляется по умолчанию для всех классов, методов или переменных.
//доступ к ним возможен из любого места проекта

//private данные с этим модификатором доступны только в рамках файла. Либо в рамках класса,
// если данные помечены как приватные внутри него.

//protected с этим модификатором видны в классе, в котором они определены и в классах-наследниках.

//internal Данные с этим модификатором доступны в любой части модуля, в котором они определены.

private var supportInfo = "Support Info" // переменная класса

class Worker {
    var name: String = ""
    private var salary: Int = 10000

    private fun sayHello() {
        println("$name says hello")
    }

    fun getSalary() = salary

    fun setSalary(salary: Int) {
        this.salary = salary
    }
}

class Support {
    fun printInfo() {
        println(Worker::class.simpleName)
        println(Worker::name)
        println(supportInfo)
    }
}

fun main() {
    val worker1: Worker = Worker()
    worker1.name = "John"
    //worker1.sayHello() не можем вызвать потому что метод private
    println("${worker1.getSalary()} old salary")
    worker1.setSalary(20000)
    println("${worker1.getSalary()} new salary")

    // инкапсуляции – это упаковка данных и функций, для работы с ними, внутри общего компонента.
    // Это механизм для пресечения прямого доступа извне к определенным атрибутам компонента.

    //Вся реализация закрыта за методами, которые позволяют получить доступ к данным внутри компонента.
    //В случае с Котлин речь идет не только о методах, но и о свойствах. Соблюдая правила инкапсуляции
    // можно настроить получение доступа к данным от одного конкретного объекта (и только от него) к другому,
    // такому же уникальному. Извне напрямую к полю обращаться нельзя. Получаем возможность внутри менять
    // внутренности класса, не задействуя внешний интерфейс и не боясь сломать логику во вне. Таким образом
    // инкапсулировали (оградили) кусок кода внутри класса от внешнего мира.

    Support().printInfo()
}