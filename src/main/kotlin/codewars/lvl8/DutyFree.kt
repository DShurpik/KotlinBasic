package codewars.lvl8

fun main() {
    println(dutyFree(2479, 51, 13390)) // 10
}

fun dutyFree(normPrice: Int, discount:Int, hol:Int) : Int {
    return ((hol / (normPrice * discount).toDouble()) * 100).toInt()
}