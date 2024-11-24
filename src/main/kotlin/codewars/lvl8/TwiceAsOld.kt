package codewars.lvl8

fun main() {
   println(twiceAsOld(36,7))
}

fun twiceAsOld(dadYearsOld: Int, sonYearsOld: Int): Int {
    return Math.abs(dadYearsOld - sonYearsOld * 2)
}