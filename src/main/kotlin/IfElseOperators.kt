fun main() {
    print("Enter worker age : ")
    val workerAge = readLine()!!.toInt() // Работает как сканнер в Джава

    if (workerAge <= AGE_OF_MAJORITY) println("Запрещенно работать")
    else if (workerAge <= RETIREMENT_AGE) println("Можно работать")
    else println("Работник на пенсии")

    print("Enter user age : ")
    val userAge = readLine()!!.toInt()
    val resultText: String = if (userAge >= AGE_OF_MAJORITY) "Показать экран со скрытым контентом"
    else if (userAge == 16 || userAge == 17) "Показать экран с ограниченным контентом"
    else "Вернуться на главный экран приложения"

    println(resultText)


}

const val AGE_OF_MAJORITY = 18
