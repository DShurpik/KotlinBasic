fun main() {
    val str = "abcd 123"
    println(str)

    for (c in str) {
        print(c + "!")
    }
    println()
    val s:String = "    |123|    "
    println(s.trimMargin("|") + " Trim margin")
    println(s.trimEnd() + " Trim end")
    println(s.trim() + " Trim")

    val i = 10
    println("i = $i") // выведет "i = 10"

    val s1 = "abc"
    println("$s1.length is ${s1.length}") // выведет "abc.length is 3"

    val name: String = "John"
    println("${name}" + " Name")

    val str1 : String = """
                    String1
                String2
                        String3
    """.trimIndent()
    println(str1)


}