package codewars.lvl7.algorithms

fun main() {
    println(repeats(intArrayOf(9, 10, 19, 13, 19, 13)).toLong())
    println(repeats(intArrayOf(16, 0, 11, 4, 8, 16, 0, 11)).toLong())
}

fun repeats(arr: IntArray): Int {
    var sum = 0
    for (i in 0..<arr.size) {
        var isSingle = true
        for (j in 0..<arr.size) {
            if (i != j && arr[i] == arr[j]) {
                isSingle = false;
                break;
            }
        }
        if (isSingle) sum += arr[i]
    }
    return sum
}