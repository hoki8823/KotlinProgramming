package chapter08.section1


class GenericNull<T> { // Any 타입을 넣으면 null값을 허용안함.
    fun EqualityFunc(arg1: T,arg2: T) {
        println(arg1?.equals(arg2))
    }
}

fun main() {
    val obj = GenericNull<String>()
    obj.EqualityFunc("Hello","World")

    val obj2 = GenericNull<Int?>()
    obj2.EqualityFunc(null,10)
}