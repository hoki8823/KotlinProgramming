fun main() {
    println(highFunc({x,y->x+y},10,20))
}
fun highFunc(sum: (Int, Int) -> Int, a: Int, b: Int): Int = sum(a,b)

/*
* 함수형 프로그래밍의 정의와 특징
* 순수함수를 사용해야 한다.
* 람다식을 사용할 수 있다.
* 고차 함수를 사용할 수 있다.
* */

