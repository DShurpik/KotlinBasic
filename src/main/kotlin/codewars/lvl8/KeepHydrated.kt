package codewars.lvl8

fun main() {
    println(litres(11.8))
    println(litres1(11.8))
}

fun litres(time: Double): Int {
    return (time * 0.5).toInt()
}

fun litres1(time: Double): Int = (time * 0.5).toInt()