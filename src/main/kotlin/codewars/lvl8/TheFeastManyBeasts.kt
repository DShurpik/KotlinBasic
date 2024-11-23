package codewars.lvl8

fun main() {
    println(feast("great blue heron", "garlic naan"))
    println(feast("brown bear", "bear claw"))

    println(feast1("great blue heron", "garlic naan"))
    println(feast1("brown bear", "bear claw"))
}

fun feast(beast: String, dish: String): Boolean =
    beast[0] == dish[0] && beast[beast.length - 1] == dish[dish.length - 1]

fun feast1(beast: String, dish: String) = beast.first() == dish.first() && beast.last() == dish.last()
