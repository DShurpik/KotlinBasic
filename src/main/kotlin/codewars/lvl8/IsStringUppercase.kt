package codewars.lvl8

fun main() {
    println("HELLO I AM DONALD".isUpperCase()) // true
    println("ACSKLDFJSgSKLDFJSKLDFJ".isUpperCase()) // false

    println("HELLO I AM DONALD".isUpperCase1()) // true
    println("ACSKLDFJSgSKLDFJSKLDFJ".isUpperCase1()) // false
}

fun String.isUpperCase(): Boolean {
    return this.equals(this.uppercase())
}

fun String.isUpperCase1(): Boolean {
    for (i in this) {
        if (i.isLetter() && !i.isUpperCase()) return false
    }
    return true
}