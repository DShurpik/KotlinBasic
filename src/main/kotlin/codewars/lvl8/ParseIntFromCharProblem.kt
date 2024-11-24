package codewars.lvl8

fun main() {
    println(getAge("7 years old"))
    println(getAge1("7 years old"))
    println(getAge2("7 years old"))
}

fun getAge(yearsOld: String): Int {
    return yearsOld[0].toString().toInt()
}

fun getAge1(yearsOld: String) = yearsOld.take(1).toInt()

fun getAge2(yearsOld: String) = yearsOld.first().digitToInt()