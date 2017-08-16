package robot.com.myapplication.number

/**
 * Created by win10 on 2017/7/18.
 */
fun main(args: Array<String>) {
    var map: Map<Student2, String> = mapOf(Student2("jack1", 23) to "1",
            Student2("jack2", 23) to "1",
            Student2("jack6", 23) to "1",
            Student2("jack4", 23) to "1",
            Student2("jack5", 23) to "5",
            Student2("jack6", 23) to "1",
            Student2("jack7", 23) to "5",
            Student2("jack8", 23) to "1",
            Student2("jack8", 23) to "1",
            Student2("jack8", 23) to "1")


    listOf<Int>(2, 4, 56).map {
        return@map
    }

    var xman = map.filter {
        println("-----------------------")
        if ("jack6".equals(it.key.name)) {
            return
        } else {
            false
        }
    }
    println(xman)


    map.mapValues { (key,value)->
        if ("jack6".equals(key.name)) {
            return

    } }
}

class Student2(var name: String, var age:Int) {

}
