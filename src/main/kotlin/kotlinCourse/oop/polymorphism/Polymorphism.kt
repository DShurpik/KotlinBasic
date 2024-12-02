package kotlinCourse.oop.polymorphism

import java.util.*

/** 3 типа полиморфизма в Kotlin
Ad hoc (по случаю) – одна функция определяется для различных типов данных.
В классе прописывается несколько функций, которые принимают разные параметры.
При вызове этой функции, компилятор определяет какая функция сработает по количеству и типам
передаваемых параметров. Минус такого подхода, в том, что нужно наделать множество реализаций этой функции.

Subtyping (полиморфизм включения) – это реализация через принцип подстановки Барбары Лисков.
Это один из принципов объектно-ориентированного программирования из аббревиатуры SOLID.
А звучит он так: функции, которые используют базовый тип, должны иметь возможность использовать подтипы
базового типа, не зная об этом. То есть объект более узкого типа всегда может использоваться там, где может
использоваться объект более широкого типа. Здесь, кстати и может сбить с толку факт отношений наследования
родителя и потомка.

Parametric (параметрический) – программа может быть реализована через обобщенные типы. То есть без
ориентации на конкретный тип. Касаемо Kotlin – это история про дженерики (или обобщенное программирование).*/
fun main() {
    val creationDate = Date()
    val notes = NotesAppItem()
    val notes1 = NotesAppItem()
    val notes2 = NotesAppItem()

    notes.addItemToCell(
        "call sister",
        creationDate,
        "message",
        "call sister to congratulate"
    )

    notes1.addItemToCell(
        "call brother",
        creationDate,
        "phone call",
        12345678
    )

    notes2.addItemToCell(
        "do housework",
        creationDate,
        "notification",
        listOf("do exercises", "do cleaning", "do washing", "make lunch", "drink bear")
    )

    val messageItem = MessageItem(
        "call sister",
        creationDate,
        "message",
        "call sister to congratulate"
    )

    val phoneItem = PhoneItem(
        "call brother",
        creationDate,
        "phone call",
        12345678
    )

    val listItem: ListItem = ListItem(
        "do housework",
        creationDate,
        "notification",
        listOf("do exercises", "do cleaning", "do washing", "make lunch", "drink bear")
    )
    //println(messageItem.getItemData())
    //println(phoneItem.getItemData())
    //println(listItem.getItemData())

    /** Роль наследования в полиморфизме
    Во-первых меняем все типы дочерних экземпляров на тип базового класса. И все будет работать также
    в обоих случаях. Почему. Родитель может содержать ссылку на свой дочерний класс. Родитель может
    вызывать метод своего дочернего класса, который переопределен и является общим в обоих классах.
    То есть когда базовый и дочерний класс имеют одно и то же имя метода.
    Далее. Обладая этой информацией имеем возможность сделать такие манипуляции. Создаем массив с
    типом ListAppItem и наполняем его созданными выше объектами. Ниже сделаем функцию showAllNotes().
    Внутри которой через forEach вызываем метод getItemData() у всех элементов массива.
    Таким образом объекты разных типов, но с общим родителем демонстрируют свое полиморфное свойство. */

    val list = arrayOf<ListAppItem>(messageItem, phoneItem, listItem)

    showAllNotes(list)
}

fun showAllNotes(notes: Array<ListAppItem>) {
    notes.forEach {
        println(it.getItemData())
    }
}

