package yandex.mobcontest

import com.sun.xml.internal.ws.api.ha.StickyFeature
import java.io.File
import java.util.*
import kotlin.collections.HashSet

/*str3
1smth
bla2bla*/


// баг в библиотеке
/*str3
1smth
bla2bla
ewrw4
5w
6*/


//ее 1.9 секунд... это ппц, есть вероятность пустых строк? во всяком случае последняя строка может быть пустой, изза неё не проходил тест
class SolutionKt {

    fun test1() {

       val reader = File("input.txt").readText()

        val list: HashSet<String> = reader.split("\n").toHashSet()
        val map = hashMapOf<Int, String>()
        for ((i, v) in list.withIndex()) {
            if (v == "") continue
            val index = Scanner(v).useDelimiter("[^\\d]+").nextInt()
            val word = v.replace("[\\d]".toRegex(), "")
            map[index - 1] = word
        }
        var i = 0


        while (i < map.size) {
            println(map[i])
            i++
        }
    }
}

fun main() {
    val clz = SolutionKt()
    clz.test1()
}


/*
* str3\n
1smth\n
bla2bla
* */