package codewars.lvl8

fun main() {
    println(getVolumeOfCuboid(6.3, 2.0, 5.0))
}

fun getVolumeOfCuboid(length: Double, width: Double, height: Double): Double {
    return length * width * height
}