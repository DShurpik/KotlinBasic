package kotlinCourse.oop

private var managerCounter: Int = 0

class Manager(name: String, age: Int, position: String, salary: Int) {
    var name: String = name
    var age: Int = age
    var position: String = position
    var salary: Int = salary
    var isBePromoted: Boolean = false
    private val id: Int

    /** (secondary constructor)
     * Если основной конструктор не пустой, вторичный конструктор должен его вызывать с перечислением всех полей.
     * И только потом добавлять дополнительные свойства
     * В конце пишется THIS для вызова основного конструктора*/
    constructor(
        name: String,
        age: Int,
        position: String,
        salary: Int,
        isBePromoted: Boolean
    ) : this(name, age, position, salary) {
        this.isBePromoted = isBePromoted
    }

    /** Когда при создании объекта (не важно с помощью какого конструктора) нужно выполнить какой то
     * блок кода (логику или ряд вызовов методов) применяются блоки инициализации
     */
    init {
        // Увеличиваем счетчик и присваиваем ID
        managerCounter++
        id = managerCounter
        println("Менеджер создан с ID: $id")
    }
}

// Это работает так же как в джава конструкторы с this.name = name
/** Упрощенная форма основного конструктора
 *  Этот конструктор работает так же как и конструктор выше
 *class Manager(name: String, age: Int, position: String, salary: Int) {
 *
 * }
 * */

/** Правильная очередность вызовов всех блоков кода во время создания экземпляра класса:

    вторичный конструктор
    первичный конструктор
    инициализация полей класса и блоков init в порядке расположения их в коде
    выполнение кода в теле вторичного конструктора
 */


