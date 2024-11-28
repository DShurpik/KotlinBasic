package kotlinCourse.oop

class GetSet {
    //Kotlin в местах взаимодействия со свойством под капотом создает сеттеры и геттеры.
    // Когда обращаемся к свойству – создается геттер, когда поставляем в него новое значение – сеттер.

    class Worker {
        //Можно отдавать то значение, которым проинициализировали переменную по умолчанию.
        // Делается это с помощью ключевого слова field. Оно передает то поле, для которого явно
        // прописываем геттер.

        //можно указать произвольное значение. Тогда оно и только оно будет возращаться при
        // обращении к полю класса.
        var salary: Int = 10000
            get() = field

            //сеттер. Эта функция вызывается при записи в переменную класса нового значения
            set(value: Int) {
                field = value
            }

        var name: String = "default"
            get() = field
            set(value: String) {
                field = value
            }
    }


}

fun main() {
    val worker: GetSet.Worker = GetSet.Worker()
    println("old salary ${worker.salary}")
    worker.salary = 20000

    println("new salary ${worker.salary}")
}