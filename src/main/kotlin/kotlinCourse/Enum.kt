package kotlinCourse

/** enum – это сокращение от enumeration. Перечисления с помощью enum классов используются,
 * когда нужно перечислить какие-либо объекты. Такими объектами как правило являются константы,
 * их значение нам известно заранее. enum полезен там, где сущность может принимать одно из
 * заранее известных вариантов значений. Чтобы потом обращаться к ним по названию этого класса,
 * чтобы использовать далее. enum упрощает код, ограничивая количество возможных состояний. */
fun main() {
    println("${Days.FRIDAY} взяли напрямую")
    println("${Days.FRIDAY.id} взяли id напрямую")
    println("${Days.WEDNESDAY.lowerCaseName} имя из нижнего регистра напрямую")
    println("${Days.SUNDAY.getStatusDescription()}")

    for (i in Days.values()) {
        println("${i.name} ${i.lowerCaseName}: ${i.getStatusDescription()}")
    }
}

/** Кроме того в классах-перечислениях можно создавать функции. Сначала список констант
 * необходимо отделить точкой с запятой. Так как для каждого enum объекта описание индивидуальное,
 * поэтому делаем метод абстрактным и имплементируем в объекты перечисления. В реализованных
 * методах пропишем сообщения для каждого статуса.*/
enum class Days(val id: Int, val lowerCaseName: String) {
    MONDAY(1, "monday") {
        override fun getStatusDescription(): String {
            return "The firsts working day"
        }
    },
    TUESDAY(2, "tuesday") {
        override fun getStatusDescription(): String {
            return "The second working day"
        }
    },
    WEDNESDAY(3, "wednesday") {
        override fun getStatusDescription(): String {
            return "The third working day"
        }
    },
    THURSDAY(4, "thursday") {
        override fun getStatusDescription(): String {
            return "The fourth working day"
        }
    },
    FRIDAY(5, "friday") {
        override fun getStatusDescription(): String {
            return "The last working day"
        }
    },
    SATURDAY(6, "saturday") {
        override fun getStatusDescription(): String {
            return "The firsts day-off"
        }
    },
    SUNDAY(7, "sunday") {
        override fun getStatusDescription(): String {
            return "The second day-off"
        }
    };

    abstract fun getStatusDescription(): String
}

