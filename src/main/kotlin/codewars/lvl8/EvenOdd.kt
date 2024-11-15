package codewars.lvl8
    fun main() {
        println(evenOrOdd(2))
        println(evenOrOdd(1))
    }
    fun evenOrOdd(number: Int): String {
        return if(number % 2 == 0) "Even" else "Odd"
    }
