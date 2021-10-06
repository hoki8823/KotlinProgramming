package chapter05.section1

class Bird {

    var name: String = "mybird"
    var wing: Int = 2
    var beak: String = "short"
    var color: String = "blue"

    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")

}

fun main() {
    val coco = Bird()
    coco.color = "red"

    println("coco.color: ${coco.color}") // 객체의 멤버 프로퍼티 읽기
    coco.fly()
    coco.sing(3)
}