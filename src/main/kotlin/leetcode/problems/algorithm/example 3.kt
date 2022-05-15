package leetcode.problems.algorithm


class Solution3 {
    fun lengthOfLongestSubstring(s: String): Int {
        val array = arrayListOf<HashSet<Char>>(hashSetOf())
        for ((i,v) in s.withIndex()) {
            loop@ for (char in s.subSequence(i, s.length)) {
                if (array[i].contains(char)) {
                    array.add(hashSetOf())
                    break@loop
                } else array[i].add(char)
            }
            array.add(hashSetOf())
        }
        for (i in array) {
            println(i.toString())
        }
        return array.maxOf { it.size }
    }
}

//wke
fun main() {
    val clz = Solution3()
    println(clz.lengthOfLongestSubstring("dvdf"))


}