package chapter04.section3.noline

fun main() {
    retFunc()
}

inline fun inlineLambda(a:Int,b:Int,out:(Int,Int)->Unit) {
    out(a,b)
}

fun retFunc() {
    println("Start of retFunc")
    inlineLambda(13,3) lit@ {
            a,b ->
        val result = a + b

        if(result>10) {
            return@lit      // 비지역(Non-local) 반환
        }
        println("result: $result")
    }
    println("End of retFunc")
}
/*
    람다식에서 라벨을 정의해 return을 사용
    - 라벨 이름@
    - return@라벨 이름

    람다식의 명칭 그대로 라벨처럼 사용하는 것을 암묵적 라벨이라 함.
    - return@inlineLambda
    @ - 앳(at)이라고 부름

 */