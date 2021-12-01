package chapter09.section3

fun main() {
    val mixedTypeSet = setOf("Hello",5,"world",3.14,'c')
    val intSet: Set<Int> = setOf<Int>(1,5,5) // set의 경우에는 집합의 개념이기 때문에 중복 불가능

    println(mixedTypeSet)
    println(intSet)
}