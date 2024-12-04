package kotlinCourse

import java.util.Calendar

fun main() {

    /**Анонимные функции – это практически классические функции, которые имеют собственное
     * расширенное поведение, умеют принимать и возвращать параметры, но не имеют имени.*/

    val calendar: Calendar = Calendar.getInstance()

    /**Рассмотрим пример с переменной. Создаем переменную и присвоим ей функцию. Здесь сохраняем
     * сам метод. Чтобы это увидеть наглядно, принудительно выведем тип новой переменной.
     * Слева от стрелки указывается тип принимаемых параметров (сейчас отсутствуют),
     * справа возвращаемый тип – Int. */
    val count: () -> Int = fun (): Int = 365 - calendar[Calendar.DAY_OF_YEAR]
    /** С этой переменной можем уже взаимодействовать, как с упакованным методом. Чтобы наконец
     * вызвать функцию и распечатать значение к ней необходимо или применить invoke(), что
     * дословно переводится, как вызывать. Или просто проставить круглые скобки.*/
    println(count.invoke())

    val convertDaysToMin: (Int) -> Unit = fun(endDays: Int) = println(60 * 60 * 24 * endDays)
    convertDaysToMin(count())

    /**ямбда выражения – это такой вид объекта, который содержит какой-то блок кода.
     * Как правило, это небольшая часть кода, содержащая определенную функциональность или
     * выполняющее какое-то действие. По сути ее можно называть функцией (даже анонимной функцией). */

    val printStringWithLambda: (Int) -> Unit

    printStringWithLambda = {
        println("print string with lambda $it")
    }
    //printStringWithLambda()
    // OR
    printStringWithLambda.invoke(42);

    { println("PRINT from lambda") } ();

    // короткая запись
    { it: Int -> println("print string with lambda $it" )}(442)
}