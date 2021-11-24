package chapter08.section2

import java.util.*

fun main() {
    val arr = intArrayOf(1,2,3,4,5)

    println("arr: ${Arrays.toString(arr)}") // Arrays.toString()은 배열의 내용을 문자열로 변환
    println("size: ${arr.size}")
    println("sum(): ${arr.sum()}")

    println(arr.get(2))
    println(arr[2])

    arr.set(2,7)
    arr[0]=8
    println("size:${arr.size} arr[0]: ${arr[0]}, arr[2]: ${arr[2]},")

    for(i in 0..arr.size-1) {
        println("arr[$i] = ${arr[i]}")
    }

    val arr1 = intArrayOf(1,2,3,4,5)
    val arr2 = arr1.plus(6) // 하나의 요소를 추가한 새 배열 생성

    println("arr2: ${Arrays.toString(arr2)}")

    val arr3 = arr1.sliceArray(0..2) // 필요한 범위를 잘라내 새 배열 생성
    println("arr3: ${Arrays.toString(arr3)}")
}