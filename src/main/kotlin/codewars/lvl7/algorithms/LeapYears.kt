package codewars.lvl7.algorithms

import java.time.Year

fun main() {
    println(isLeapYear(2020)) // true
    println(isLeapYear(2015)) // false

    println(isLeapYear1(2020)) // true
    println(isLeapYear1(2015)) // false
}

fun isLeapYear(year: Int): Boolean {
    return year % 4 == 0 && year % 100 != 0 || year % 400 == 0
}

fun isLeapYear1(year: Int): Boolean = Year.of(year).isLeap