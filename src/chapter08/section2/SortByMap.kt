package chapter08.section2

fun main() {

    val fruits = arrayOf("banana","avocado","apple","kiwi")
    fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.toUpperCase() }
        .forEach { (println(it)) }

    val pi = 3.1415926
    val dec = 10
    val s = "hello"
    println("pi = %.2f, %3d, %s".format(pi,dec,s))
}