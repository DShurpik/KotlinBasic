fun main() {

    // While(true) {That code works}
    var counter = 5

    while (counter > 0) {
        println("Реклама закончится через $counter")
        counter--
    }
    println("--------------------------")
    var counter1 = 6
    while (counter1 > 0) {
        println("Реклама закончится через ${--counter1}")
    }
    println("--------------------------")
    var counter2 = 7
    do {
        println("Реклама закончится через $counter2")
        counter2--
    } while (counter2 > 0)
}