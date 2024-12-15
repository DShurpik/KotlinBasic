package codewars.lvl7.strings

fun main() {
    println(alphabetWar("zdqmwpbs")) // "Let's fight again!"
    println(alphabetWar("zzzzs")) // "Right side wins!"
}

fun alphabetWar(fight: String): String {
    var sumLeft = 0
    var sumRight = 0
    for (i in fight) {
        when(i) {
            'w' -> sumLeft += 4
            'm' -> sumRight += 4
            'p' -> sumLeft += 3
            'b' -> sumLeft += 2
            's' -> sumLeft += 1
            'q' -> sumRight += 3
            'd' -> sumRight += 2
            'z' -> sumRight += 1
        }
    }
    return if (sumLeft > sumRight) return "Left side wins!"
    else if (sumRight > sumLeft) return "Right side wins!"
    else return "Let's fight again!"
}