package kotlinCourse.oop.polymorphism

import java.util.*

class NotesAppItem {
    /** приложение может сохранять заметки с разным типом контента. А именно это будет возможность
     * сохранять, помимо сообщения, номер телефона и какой-нибудь список (типа TODO-list).
     * И согласно описания Ad hoc полиморфизма, нужно создать новые функции, которые будут принимать
     * соответствующие параметры. Для этого в классе нужно создать дополнительные функции с точно
     * таким же названием, но с другими параметрами. */
    fun addItemToCell(
        title: String,
        creationDate: Date,
        type: String,
        data: String,
    ) {
        println("Item \"$title\" added to cell – $creationDate\nType: $type\nData: $data\n")

    }
    fun addItemToCell(
        title: String,
        creationDate: Date,
        type: String,
        data: Int,
    ) {
        println("Item \"$title\" added to cell – $creationDate\nType: $type\nData: $data\n")
    }

    fun addItemToCell(
        title: String,
        creationDate: Date,
        type: String,
        data: List<String>,
    ) {
        println("Item \"$title\" added to cell – $creationDate\nType: $type\nData: $data\n")
    }
}