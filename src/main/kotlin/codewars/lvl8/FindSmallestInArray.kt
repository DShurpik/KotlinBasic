package codewars.lvl8

fun main() {
    val arr: List<Int> = listOf(15, 20, 10, 17, 22, 9001)
    println(findSmallestInt(arr))
    println(findSmallestInt1(arr))
    println(findSmallestInt2(arr))
    println(findSmallestInt3(arr))
}

fun findSmallestInt(nums: List<Int>): Int {
    return nums.min()
}


fun findSmallestInt1(nums: List<Int>): Int = nums.minOf { it }

fun findSmallestInt2(nums: List<Int>): Int = nums.sorted().first()

fun findSmallestInt3(nums: List<Int>): Int {
    var min = nums[0]
    for (i in nums) {
        if (i < min) min = i
    }
    return min
}