package codewars.lvl8

fun main() {
    println(noSpace("8 j 8   mBliB8g  imjB8B8  jl  B"))
    println(noSpace1("8 j 8   mBliB8g  imjB8B8  jl  B"))
    println(noSpace2("8 j 8   mBliB8g  imjB8B8  jl  B"))
}

fun noSpace(x: String): String = x.replace(" ", "")

fun noSpace1(x: String): String = x.split(" ").joinToString("")

fun noSpace2(x: String): String = x.filterNot(Char::isWhitespace)