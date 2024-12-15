package codewars.lvl7.fundamentals

fun main() {
    println(evaporator(10.0,10.0,5.0)) // 29
}

fun evaporator(content: Double, evap_per_day: Double, threshold: Double): Int {
    var days = 0
    var cont = 100.0
    while (cont > threshold) {
        cont -= cont * (evap_per_day / 100.0)
        days++;
    }
    return days
}