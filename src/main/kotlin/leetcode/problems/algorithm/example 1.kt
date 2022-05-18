package leetcode.problems.algorithm


/*
Учитывая массив целых чисел nums и целочисленное целевое значение,
верните индексы двух чисел таким образом, чтобы они складывались в целевое значение.
Вы можете предположить, что каждый ввод будет иметь ровно одно решение,
и вы не можете использовать один и тот же элемент дважды.
Вы можете вернуть ответ в любом порядке.

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]
*/

private class Solution {
    //нормальный ответ
    fun twoSum(nums: IntArray, target: Int): IntArray {
        for ((i, v) in nums.withIndex()) {
            val value = target - v
            for ((j, w) in nums.withIndex()) {
                if (w == value && j != i) {
                    return intArrayOf(i, j)
                }
            }
        }
        return intArrayOf()
    }

    //правильный ответ
    fun twoSumI(nums: IntArray, target: Int): IntArray {
        var complement: Int
        val map = hashMapOf<Int, Int>()
        for (i in nums.indices) {
            complement = target - nums[i]
            if (map.containsKey(complement)) {
                return intArrayOf(map[complement]!!.toInt(), i)
            }
            map[nums[i]] = i
        }
        return intArrayOf()
    }
}


fun main() {
    val clz = Solution()
    println(clz.twoSum(intArrayOf(-1, -2, -3, -4, -5), -8).contentToString())
    println(clz.twoSumI(intArrayOf(-1, -2, -3, -4, -5), -8).contentToString())

}



