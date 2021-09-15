fun add(name: String, email: String = "default") {
    val output = "${name}님의 이메일은 ${email}임니다.";
    println(output)
}
fun defaultArgs(x: Int = 100, y: Int =200) {
    println(x+y)
}

fun main() {
    val name = "홍길동"
    val email = "wow@naver.com"

    add(name)
    add(name,email)
    add("둘리","young213@naver.com")
    defaultArgs()
    defaultArgs(200)
}