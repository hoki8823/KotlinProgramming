fun main() {
    chechArg("Hello")
    chechArg(12)
}

fun chechArg(x: Any) {
    if (x is String)
        println("x is String: $x")
    if (x is Int)
        println("x is Int: $x")
}