fun main() {
    // Операторы ссылочного типа ===, !==
    // Результат сравнения будет истиной, если обе сравниваемые переменные ссылаются на один объект и наоборот.

    val str1: String = "Hello"
    val str2: String = "Hello"
    val comp: Boolean = str1 === str2
    println("$comp : Compare 2 reference types")

    val userAge: Int = 50

    val result: Boolean = userAge > AGE_LIMIT
    println("$result : Compare user age with age limit")

    // Логический оператор «и» (&&)
    val comparisonResult: Boolean
    val comparisonResult1: Boolean
    comparisonResult = userAge >= AGE_LIMIT && userAge <= RETIREMENT_AGE
    println("$comparisonResult : Compare with && operator")
    comparisonResult1 = (userAge >= AGE_LIMIT) and  (userAge <= RETIREMENT_AGE)
    println("$comparisonResult1 : Compare with AND operator")

    val comp1: Boolean
    val comp2: Boolean
    comp1 = userAge >= AGE_LIMIT || userAge <= RETIREMENT_AGE
    comp2 = (userAge >=AGE_LIMIT) or (userAge <= RETIREMENT_AGE)
    println("$comp1 : Compare with || operator")
    println("$comp2 : Compare with OR operator")

    // Сравнение в диапозоне
    val comp3: Boolean = userAge in AGE_LIMIT..RETIREMENT_AGE
    println("$comp3 : Compare in diapason")
}

const val AGE_LIMIT: Int = 18 // Константа
const val RETIREMENT_AGE: Int = 65