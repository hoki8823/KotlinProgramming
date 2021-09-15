fun main() {
    //자료형 검사 is 사용법
    val num = 256

    if(num is Int){
        println(num)
    } else if(num !is Int){ //!(num is Int)와 동일
        println("Not a Int")
    }

    //최상위 기본 클래스 Any 사용법
    val x: Any
    x = "Hello"
    if (x is String) //자료형검사를 통해 String으로 스마트 캐스트
        println(x.length)

    //as에 의한 스마트 캐스트
    //val x: String? = y as? String
}