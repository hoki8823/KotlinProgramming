package chapter04.section2

fun main() {
    var sum = 0

    // 안티패턴 인지하면서 코딩하자.
    for(x in 1..10) {
        sum += x
    }
    println("sum: $sum")
}