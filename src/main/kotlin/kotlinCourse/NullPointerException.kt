package kotlinCourse

fun main() {
    //Такой тип может содержать какое-то значение, а может содержать null.
    //То есть в отличие от переменной стандартного типа, мы явно говорим,
// что “эта переменная может принимать в себя null”

    val nullableString: String? = null // Nullable  type
    val nonNullableString: String = "some string"

    println(nullableString?.length)
    println(nonNullableString.length)

    val nullableString1: String? = null
    // Слева от себя он проверяет значение на null и если оно таковым оказывается, отдает значение справа
// от себя, которое точно не будет null и не вызовет ошибки
    val length: Int = nullableString1?.length ?: -1
    println(length)


    //Оператор утверждения “это не null” – !!

    val nullableString2: String? = "null"
    val length2: Int = nullableString2!!.length
}