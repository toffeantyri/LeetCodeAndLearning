package yandex.contest

import java.io.File
import java.io.PrintWriter
import java.util.*


class SolutionKt {


    fun test2() {
        val writer = PrintWriter("output.txt")
        val scanner = Scanner(File("input.txt"))
        val a = scanner.nextInt()
        val b = scanner.nextInt()

        writer.print(a+b)
        writer.close()

    }

    fun test3() {
        val a = readLine()?.split(" ")?.map { it.toInt() }?.toIntArray()?.sum()

        println(a)
    }

    fun test4() {
        val a = readLine()!!
        val array = readLine()!!

        var result = 0
        for (i in array) {
            if (a.contains(i)) { result++ }
        }
        println(result)
    }


}
// aabbccd
fun main() {

    val clz = SolutionKt()
    clz.test2()


}

