fun main() {
    // Диапозон или интервал
    val range1: IntRange = 42..442 // 42 <= and <= 442
    val range2: IntRange = 42 until 442 // 42 <= and < 442

    val range3: LongRange = 42L..442L
    val range4: CharRange = 'a'..'z'
    val range5: ClosedRange<Double> = 42.1..442.1
    val range6: ClosedRange<Float> = 42.1f..442.1f

    val range7: IntProgression = 42..442 step 2 // С шагои 2 42..44..46..48..50......440..442 +2 or +step
    val range8: IntProgression = 42 downTo 2 step 2// -2 or - step 40..38..36..34

    val b1 = 52 in range1
    val b2 = 52 !in range1
    println(b1)
    println(b2)

    for (i in 10 downTo 0 step 2) {
        print("$i | ")
    }
    println()
    for (i in range2 step 8) {
        if (i > 200) break
        print("$i | ")
    }
    println()
    for (i in 5 downTo 1) {
        if (i == 3) {
            print(" i == 3, i не будет распечатана")
            continue
        }
        print(" $i |")
    }
    println()
    for (i in 0..10 step 2) {
        if (i == 8) return
        print(" $i |")
    }

}