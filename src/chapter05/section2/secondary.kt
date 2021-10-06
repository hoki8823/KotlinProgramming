package chapter05.section2

class Bird {

    var name: String
    var wing: Int
    var beak: String
    var color: String

    constructor(name: String, wing: Int, beak: String, color: String) {
        this.name = name
        this.wing = wing
        this.beak = beak
        this.color = color
    }


    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")

}

fun main() {
    val coco = Bird("mybird",2,"short","blue") // 생성자의 인자로 객체 생성과 동시에 초기화

    coco.color = "Yellow"

    println("coco.color: ${coco.color}") // 객체의 멤버 프로퍼티 읽기
    coco.fly()
    coco.sing(3)
}