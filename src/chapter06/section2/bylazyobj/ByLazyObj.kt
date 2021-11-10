package chapter06.section2.bylazyobj

class Person(val name: String, val age: Int)

fun main() {
    var isPersonInstantiated: Boolean = false // 초기화 확인 용도

    val person : Person by lazy { // 1. lazy를 사용한 person 객체의 지연 초기화
        isPersonInstantiated = true
        Person("Kim",23) // 2. 이부분이 Lazy 객체로 반환됨
    }
    val personDelegate = lazy { Person("Hong",49)} // 3. 위임 변수를 사용한 초기화

    println("person Init: $isPersonInstantiated")
    println("personDelegate Init: ${personDelegate.isInitialized()}")

    println("person.name = ${person.name}") // 4. 이 시점에서 초기화
    println("personDelegate.value.name = ${personDelegate.value.name}") // 5. 이 시점에서 초기화

    println("person Init: $isPersonInstantiated")
    println("personDelegate Init: ${personDelegate.isInitialized()}")
}