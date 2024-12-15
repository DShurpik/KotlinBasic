package kotlinCourse

fun main() {
    /** один из типов коллекций в Kotlin. Map хранит пары “ключ-значение” (или entries); ключи уникальны,
     * но разные ключи могут иметь одинаковые значения. Интерфейс Map предоставляет такие функции, как
     * доступ к значению по ключу, поиск ключей и значений и т. д.*/

    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 1)

    println("All keys: ${numbersMap.keys}") // [key1, key2, key3, key4] получаем ключи
    println("All values: ${numbersMap.values}") // [1, 2, 3, 1] получаем значения

    val complexMap: Map<String, List<String>> = mapOf(
        "Relatives" to listOf("Father", "Mother", "Brothers"),
        "Friends" to listOf("Jack", "Johny", "Dirk")
    )

    println(complexMap.get("Relatives"))
}