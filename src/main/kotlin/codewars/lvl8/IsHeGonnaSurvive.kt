package codewars.lvl8

fun main() {
    println(hero(10, 5)) // true
    println(hero(1500, 751)) // false
}

fun hero(bullets: Int, dragons: Int) : Boolean = bullets / 2 >= dragons