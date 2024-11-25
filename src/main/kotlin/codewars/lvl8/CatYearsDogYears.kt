package codewars.lvl8

fun main() {
    println(calculateYears(10).contentToString())
}

fun calculateYears(years: Int): Array<Int> {
    var catYear: Int = 0
    var dogYear: Int = 0
    if (years == 1) {
        catYear = 15
        dogYear = 15
    } else if (years == 2) {
        catYear = 24
        dogYear = 24
    } else {
        catYear = 24 + ((years - 2) * 4)
        dogYear = 24 + ((years - 2) * 5)
    }
    return arrayOf(years, catYear, dogYear)
}

fun calculateYears1(years: Int): Array<Int> =
    when (years) {
        1 -> arrayOf(1, 15 , 15)
        2 -> arrayOf(years, 24 , 24)
        else -> arrayOf(years, 24 + 4 * (years - 2), 24 + 5 * (years - 2))
    }