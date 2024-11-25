package codewars.lvl8

fun main() {
    println(well(arrayOf("good", "bad", "bad")))
}

fun well(x: Array<String>): String {
    var good: Int = 0
    for (i in x) {
        if (i.equals("good")) good++
    }
    return when {
        good == 0 -> "Fail!"
        good == 1 || good == 2 -> "Publish!"
        else -> "I smell a series!"
    }
}