package chapter09.section2

fun main() {
    var numbers: List<Int> = listOf(1,2,3,4,5)
    var names: List<String> = listOf("uno","dos","tres","quatro")

    for(name in names){
        println(name)
    }
    for( num in numbers) {
        print(num)
    }
    println()

    val fruits = listOf("apple","banana","kiwi")
    for(item in fruits){
        println(item)
    }

    for(index in fruits.indices){
        println("fruits[$index] = ${fruits[index]}")
    }
}