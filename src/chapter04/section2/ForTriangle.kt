package chapter04.section2

fun main() {
    print("Enter the lines: ")
    val n = readLine()!!.toInt()

    for(line in 1..n) {
        for(space in 1..(n-line)) { print(" ") }
        //for(star in 1..(2*line-1)) { print("*") }
        for(star in 1 until 2*line) { print("*") } // until은 마지막 요소의 범위를 포함하지 않는다.
        println()
    }
}