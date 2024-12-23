package kotlinCourse

fun main() {
    // https://ievetrov.ru/kotlin-%D1%81-%D0%BD%D1%83%D0%BB%D1%8F-%D1%83%D1%80%D0%BE%D0%BA%D0%B8/%D1%83%D1%80%D0%BE%D0%BA-8-%D0%BC%D0%B0%D1%81%D1%81%D0%B8%D0%B2%D1%8B-%D0%B2-kotlin/
    // arrayOf creates an array
    val intArray: Array<Int> = arrayOf(4, 4, 2)
    val charArray: Array<Char> = arrayOf('4', '4', '2')
    val intArray1: IntArray = intArrayOf(4, 4, 2)
    val charArray1: CharArray = charArrayOf('4', '4', '2')

    val intArray2: Array<Int> = arrayOf() // нужно проставялть тип массива ОБЯЗАТЕЛЬНО
    val intArray21 =
        arrayListOf(1, 2, 3, 4, 5) // Если сразу инициализировать массив, то компилятор понимает что это инт
    val intArray3 = intArrayOf() // компилятор понимает что создается инт массив

    val array0 = arrayOfNulls<String>(5) // [null],[null],[null],[null],[null]
    val array = Array(5) { 0 } // Массив из 5 элементов, все элементы равны 0 [[0],[0],[0],[0],[0]]

    val strArr: Array<String> = arrayOf("a", "b", "c", "d", "e")
    println("Размер массива strArr = ${strArr.size}") // arr.size для вывода размера массива
    println("Индекс значения С в массиве strArr ${strArr.indexOf("c")}") // arr.indexOf(value) для вывода индекса значения


    strArr.set(0, "A") // .set для перезаписывания новых данных по индексу
    println("${strArr.get(0)} - новое значение по индексу 0 в массиве strArr") // .get для вывода значения по индексу
    strArr.size // размер массива
    strArr.first() // вернет 1-й элемент массива
    strArr.last() // вернет последний элемент массива
    intArray1.plus(
        intArrayOf(
            1,
            2,
            3,
            4,
            5
        )
    )// Метод plus создает новую коллекцию, добавляя элементы или объединяя коллекции.
    intArray1.sort() // сортировка по возрастанию [1],[2],[3]
    intArray1.sortDescending() // сортировка по убыванию [3],[2],[1]
    for (i in strArr) {
        print(" $i имеет ${strArr.indexOf(i)} индекс|")
    }


}