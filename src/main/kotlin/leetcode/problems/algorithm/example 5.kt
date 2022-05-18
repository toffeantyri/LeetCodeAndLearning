package leetcode.problems.algorithm

/*Он вводит следующие идеи: палиндром,
 динамическое программирование и манипулирование строками.
 Убедитесь, что вы понимаете, что означает палиндром. Палиндром - это строка,
  которая читается одинаково в обоих направлениях. Например,
  SS = "aba" является палиндромом, SS = "abc" - нет.
*/


private class Solution5 {
        /*
        * Runtime: 1248 ms, faster than 21.59% of Kotlin online submissions for Longest Palindromic Substring.
Memory Usage: 45.7 MB, less than 49.29% of Kotlin online submissions for Longest Palindromic Substring.
* */
    fun longestPalindrome(s: String): String {
        if(s.length==1) return s
        val hashSet : ArrayList<String> = arrayListOf()
        var index = s.length - 1
        for (i in s.indices) {
            loop@ while (true) {
                //println("$i and $index")
                if (index == i) {
                    break@loop
                }
                if (s[i] == s[index] && i < index) {
                    //println(s.substring(i, index+1))
                    if (s.substring(i, index+1) == s.substring(i, index+1).reversed()) {
                        hashSet.add(s.substring(i, index+1))

                        break@loop
                    } else index--
                } else if (i < index) {
                    index--
                }
            }
            index = s.length - 1
        }

        println(hashSet.sortedBy { it.length })
        if (hashSet.isEmpty()) hashSet.add(s[0].toString())
        return hashSet.maxBy { it.length }!!
    }
}

fun main() {
    val clz = Solution5()
    println(clz.longestPalindrome("cyyoacmjwjubfkzrrbvquqkwhsxvmytmjvbborrtoiyotobzjmohpadfrvmxuagbdczsjuekjrmcwyaovpiogspbslcppxojgbfxhtsxmecgqjfuvahzpgprscjwwutwoiksegfreortttdotgxbfkisyakejihfjnrdngkwjxeituomuhmeiesctywhryqtjimwjadhhymydlsmcpycfdzrjhstxddvoqprrjufvihjcsoseltpyuaywgiocfodtylluuikkqkbrdxgjhrqiselmwnpdzdmpsvbfimnoulayqgdiavdgeiilayrafxlgxxtoqskmtixhbyjikfmsmxwribfzeffccczwdwukubopsoxliagenzwkbiveiajfirzvngverrbcwqmryvckvhpiioccmaqoxgmbwenyeyhzhliusupmrgmrcvwmdnniipvztmtklihobbekkgeopgwipihadswbqhzyxqsdgekazdtnamwzbitwfwezhhqznipalmomanbyezapgpxtjhudlcsfqondoiojkqadacnhcgwkhaxmttfebqelkjfigglxjfqegxpcawhpihrxydprdgavxjygfhgpcylpvsfcizkfbqzdnmxdgsjcekvrhesykldgptbeasktkasyuevtxrcrxmiylrlclocldmiwhuizhuaiophykxskufgjbmcmzpogpmyerzovzhqusxzrjcwgsdpcienkizutedcwrmowwolekockvyukyvmeidhjvbkoortjbemevrsquwnjoaikhbkycvvcscyamffbjyvkqkyeavtlkxyrrnsmqohyyqxzgtjdavgwpsgpjhqzttukynonbnnkuqfxgaatpilrrxhcqhfyyextrvqzktcrtrsbimuokxqtsbfkrgoiznhiysfhzspkpvrhtewthpbafmzgchqpgfsuiddjkhnwchpleibavgmuivfiorpteflholmnxdwewj"))

    //println("abcba" == "abcba".reversed())

}