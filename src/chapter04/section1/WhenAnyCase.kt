package chapter04.section1

class MyClass

fun main() {
    cases("Hello")
    cases(1)
    cases(System.currentTimeMillis()) // 현재 시간을 Long형 값으로 변환
    cases(MyClass())
    cases("safds")
}

// Any는 코틀린의 최상위클래스!!!!!
fun cases(obj: Any) {
    when(obj){
        1 -> println("Int: $obj")
        "Hello" -> println("String: $obj")
        is Long -> println("Long: $obj")
        !is String -> println("Not a String")
        else -> println("Unknown")
    }
}