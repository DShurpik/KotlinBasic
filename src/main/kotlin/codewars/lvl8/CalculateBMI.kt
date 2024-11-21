package codewars.lvl8

fun main() {
    println(bmi(80.0, 1.80))
    println(bmi1(80.0, 1.80))
}

fun bmi(weight: Double, height: Double): String {
    val bmi: Double = weight / (height * height)
    if (bmi <= 18.5) return "Underweight"
    if (bmi <= 25.0) return "Normal"
    if (bmi <= 30.0) return "Overweight"
    return "Obese"
}

fun bmi1(weight: Double, height: Double): String {
    val bmi: Double = weight / (height * height);
    return when {
        bmi <= 18.5 -> "Underweight"
        bmi <= 25.0 -> "Normal"
        bmi <= 30.0 -> "Overweight"
        else -> "Obese"
    }
}