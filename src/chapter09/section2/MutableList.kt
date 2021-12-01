package chapter09.section2

fun main() {
    val mutableList: MutableList<String> = mutableListOf<String>("A","b","c")
    mutableList.add("Ben")
    mutableList.removeAt(1)
    mutableList[0]="Sean"
    println(mutableList)

    val mutableListMixed = mutableListOf("Android","Apple",5,6,'X')
    println(mutableListMixed)
}