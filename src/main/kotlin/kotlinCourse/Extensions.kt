package kotlinCourse

/** Extension функция – это функция, которая не являясь участником какого-то класса (то есть не
 * находясь внутри определенного класса), расширяет его функционал, имея доступ к публичным полям.*/
fun main() {
    val str: String = "Hello world!"
    println(str.firstChar())
}

//Extension функции позволяют расширять функционал классов, к исходному коду которого у вас нет доступа. n
fun String.firstChar(): Char {
    return this[0]
}