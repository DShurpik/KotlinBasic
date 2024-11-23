package codewars.lvl8

fun main() {
    println(areaOrPerimeter(6, 10)) // 32
    println(areaOrPerimeter(3, 3)) // 9
}

fun areaOrPerimeter(l: Int, w: Int): Int {
    return when {
        l == w -> l * w
        l != w -> l * 2 + w * 2
        else -> 0
    }
}