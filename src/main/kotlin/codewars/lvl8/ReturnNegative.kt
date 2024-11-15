package codewars.lvl8

fun main() {
    println(makeNegative(-1))
    println(makeNegative1(-1))
}

fun makeNegative(x: Int): Int = if(x > 0) -x else x

fun makeNegative1(x: Int): Int{
    if (x > 0) {
        return -x
    } else {
        return x
    }
}