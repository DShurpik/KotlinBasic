package kotlinCourse

fun main() {
    // В скобках параметры, после -> Тип возвращаемого значения
    val sum: (Int, Int) -> Int = { x: Int, y: Int -> x + y }
    println(sum(5, 5))
    val more: (Int, Int) -> Boolean = { x: Int, y: Int -> x > y }
    println(more(5, 6)) // false т.к 5 !> 6
    // Если тип Unit, то функция ничего не возвращает
    val emptyLambda: (Int, Int) -> Unit = { x: Int, y: Int -> println("From lambda's body x * y = ${x * y}") }
    emptyLambda(5, 5)

    val operation = {val1: Int, val2: Int -> val1 * val2}
    calculate(5, 5, operation)
}

// Такие функции называются - Функция высшего порядка
fun calculate(x: Int, y: Int, operation: (val1: Int, val2: Int) -> Int) {
    println("Lambda from function ${operation(x, y)}")
}