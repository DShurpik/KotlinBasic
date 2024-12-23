package codewars.lvl7.fundamentals

fun main() {
    println(countRedBeads1(5)) // 8
}

fun countRedBeads(nBlue: Int): Int {
    if(nBlue == 0 || nBlue == 1) return 0
    var count = 0
    for (i in 1..<nBlue) {
        count += 2
    }
    return count
}

fun countRedBeads1(nBlue: Int): Int {
    if(nBlue == 0 || nBlue == 1) return 0
    var count = 0
    return (1 until nBlue).map { count }.count() * 2
}