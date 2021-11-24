package chapter08.section1

fun main() {
    val numbers = arrayOf(4,5,7,3) // 정수형으로 초기화된 배열
    val animals = arrayOf("cat","dog","bird","lion") // 무자열형으로 초기화된 배열

    for(element in numbers) { // 정수형으로 초기화된 배열 출력
        println(element)
    }

    val array1 = arrayOf(1,2,3,4)
    val array2 = arrayOf(5,6,7,8)
    val array3 = arrayOf(9,10,11,12)
    val array4 = arrayOf(13,14,15,16)

    val arr2d = arrayOf(array1,array2,array3,array4)

    for(el in arr2d){
        for(e2 in el){
            print(e2)
        }
        println()
    }

    val arr = intArrayOf(1,2,3,4,5)
    println(arr.get(2)) // 게터를 통한 접근
    println(arr[2]) // 연산자 오버로딩으로 대괄호를 통한 접근

    println(arr2d[2][1])

    arr.set(2,7) // 인덱스 2번 요소를 7로 교체
    arr[0] = 8 // 인덱스 0번 요소를 8로 교체
    arr2d[2][1] = 2 // 다차원 배열의 요소를 교체
    println("size: ${arr.size} arr[0]: ${arr[0]},arr[2]: ${arr[2]}")
}