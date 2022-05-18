package leetcode.problems.algorithm

import java.util.*


//5% лучше чем другие
private class Solution3 {
    fun lengthOfLongestSubstring(s: String): Int {
        val array = arrayListOf<HashSet<Char>>(hashSetOf())
        for ((i, v) in s.withIndex()) {
            loop@ for (char in s.subSequence(i, s.length)) {
                if (array[i].contains(char)) {

                    break@loop
                } else array[i].add(char)
            }
            array.add(hashSetOf())
        }
        return array.map { it.size }.max() ?: 0
    }

    //83% не могу понять...
    fun lengthOfLongestSubstringE(s: String): Int {
        val map: MutableMap<Char, Int> = HashMap()
        var start = 0
        var len = 0
        for (i in s.indices) {
            val c: Char = s[i]
            if (map.containsKey(c)) {
                if (map[c]!! >= start) start = map[c]!! + 1
            }
            len = Math.max(len, i - start + 1)
            map[c] = i
        }

        return len
    }

        //77% счёт с двух сторон идёт
    fun lengthOfLongestSubstringET(s: String): Int {
        var count = 1
        var j_start = 0
        var max_count = 1
            if (s.isEmpty()) {
            return 0
        } else if (s.length==1) return 1

        var i = 1
        while (i<s.length) {
            for (j in j_start until i) {
                if (s[i] != s[j]) count++ else j_start = j + 1
            }
            if (max_count < count) max_count = count
            count = 1
            i++
        }
        return max_count
    }


}


fun main() {
    val clz = Solution3()
    println(clz.lengthOfLongestSubstring("au"))
    println(clz.lengthOfLongestSubstringE("au"))
    println(clz.lengthOfLongestSubstringET("au"))

}