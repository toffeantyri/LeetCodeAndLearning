package leetcode.problems.algorithm


class Solution3 {
    fun lengthOfLongestSubstring(s: String): Int {
        val array = arrayListOf<HashSet<Char>>(HashSet())
        var index = 0
        for(v in s.toCharArray()){
           if(!array[index].contains(v)){
               array[index].add(v)
           } else {
               index++
               array.add(HashSet())

               array[index].add(v)
           }
        }

        return array.maxOf { it.size }
    }
}
//wke
fun main(){
    val clz = Solution3()
    println(clz.lengthOfLongestSubstring("dvdf"))


}