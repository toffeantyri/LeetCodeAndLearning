package leetcode.problems.algorithm

import kotlin.math.pow


//Runtime: 205 ms, faster than 59.32% of Kotlin online submissions for Reverse Integer.
class Solution7 {
    fun reverse(x: Int): Int {
        try {
            if (x == 0) return 0
            if (x > (2f).pow(31) || x < (-2f).pow(31) - 1) return 0
            val value =
                if (x > 0) x.toString().reversed().toInt()
                else x.toString().substring(1, x.toString().length).reversed().toInt()

            return if (value > (2f).pow(31) || value < (-2f).pow(31) - 1) 0 else if (x < 0) 0 - value else value
        } catch (e: Exception) {
            return 0
        }
    }

}

fun main() {
    val clz = Solution7()
    println(clz.reverse(-96463))

}