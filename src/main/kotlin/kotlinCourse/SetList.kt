package kotlinCourse

fun main() {
    /** Set<T> хранит уникальные элементы; их порядок обычно не определён. null также является
     * уникальным элементом: Set может содержать только один null. Два множества равны, если они
     * имеют одинаковый размер и для каждого элемента множества есть равный элемент в другом множестве.*/

    val firstSet = setOf(
        "First",
        "Second",
        "Third"
    )

    val emptySet = emptySet<Int>() // Пустое множество
    val intSet = setOf(1, 2, 3) // неизменяемое множество [1,2,3]
    val mutableSet = mutableSetOf(1, 2, 3, 3, 4) // изменяемое множество [1,2,3,4]
    val setFromList = listOf(1, 2, 3, 3, 4).toSet() // Лист в множество [1,2,3,4]
}