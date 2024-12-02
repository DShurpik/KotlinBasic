package kotlinCourse.oop.polymorphism

import java.util.*
/**Реализация с помощью наследования
 * В классах-наследниках заголовок, дату, тип и данные сделаем приватными свойствами.
 * Переопределенная функция будет возвращать строку с полными данными элемента.
 * В приложении это может использоваться как нотификация для пользователя об успешном добавлении заметки.
 * Строку оставляем такую же специфичную для каждого типа. Итого будет 3 наследника с
 * переопределенными функциями с индивидуальной реализацией для каждого объекта.
 * Реализация разная, потому, что параметр data везде разный. Мы по прежнему можем сделать и более
 * сложную кастомизацию. Изменить количество параметров для какого-то типа или прописать
 * какие-то вычисления в теле переопределенных функций.*/

open class ListAppItem {
    open fun getItemData() = ""
}

class MessageItem(
    private val title: String,
    private val creationDate: Date,
    private val type: String,
    private val data: String,
) : ListAppItem() {
    override fun getItemData(): String {
        return "Item \"$title\" added to cell – $creationDate\nType: $type\nData: $data\n"
    }
}

class PhoneItem(
    private val title: String,
    private val creationDate: Date,
    private val type: String,
    private val data: Long,
) : ListAppItem() {
    override fun getItemData(): String {
        return "Item \"$title\" added to cell – $creationDate\nType: $type\nData: $data\n"
    }
}

class ListItem(
    private val title: String,
    private val creationDate: Date,
    private val type: String,
    private val data: List<String>,
) : ListAppItem() {
    override fun getItemData(): String {
        return "Item \"$title\" added to cell – $creationDate\nType: $type\nData: $data\n"
    }
}