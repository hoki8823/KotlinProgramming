package chapter04.section2

fun main() {
    var total: Int = 0
    for(num in 1..100 step 2) {
        total += num
    }

    println("Odd Total: $total")

    for(num in 0..99 step 2) {
        total += num
    }
    println("Even Total: $total")
}