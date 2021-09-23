package chapter03

fun main() {
    val out: () -> Unit = { println("Hello World!")}

    out()
    var new = out
    new()
}