package chapter04.section3

import java.lang.Exception

fun main() {
    var amount = 600

    try {
        amount-=100
        checkAmount(amount)
    }catch (e:Exception) {
        println(e.message)                                      // 2.catch가 예외를 가져옴
    }
}

fun checkAmount(amount:Int) {
    if(amount < 1000) {
        throw Exception("잔고가 $amount 으로 1000 이하입니다.")   // 1.예외를 발생시키고
    }
}