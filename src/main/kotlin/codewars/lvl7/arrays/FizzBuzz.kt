package codewars.lvl7.arrays

fun main() {
    println(fizzBuzz(15).contentToString()) // "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"
    println(fizzBuzz1(15).contentToString())
}

fun fizzBuzz(n: Int): Array<String> {
    val res: MutableList<String> = mutableListOf()
    for (i in 1..n) {
        if (i % 3 == 0 && i % 5 == 0) res.add("FizzBuzz")
        else if (i % 3 == 0) {res.add("Fizz")}
        else if (i % 5 == 0) res.add("Buzz")
        else res.add(i.toString())
    }
    return res.toTypedArray()
}

fun fizzBuzz1(n: Int): Array<String> {
   return (1..n).map {
       when {
           it % 15 == 0 -> "FizzBuzz"
           it % 3 == 0 -> "Fizz"
           it % 5 == 0 -> "Buzz"
           else -> "$it"
       }
   }.toTypedArray()
}