package codewars.lvl7.strings

fun main() {
    println(makeComplement("ATTGC")) // "TAACG"
    println(makeComplement1("ATTGC")) // "TAACG"
}

fun makeComplement(dna: String): String {
    var str: StringBuilder = StringBuilder()
    for (i in dna) {
        when(i) {
            'A' -> str.append('T')
            'T' -> str.append('A')
            'C' -> str.append('G')
            'G' -> str.append('C')
        }
    }
    return str.toString()
}

fun makeComplement1(dna: String): String {
    return dna.map { when(it) {
        'A' -> 'T'
        'T' -> 'A'
        'C' -> 'G'
        'G' -> 'C'
        else -> it
    } }.joinToString("")
}