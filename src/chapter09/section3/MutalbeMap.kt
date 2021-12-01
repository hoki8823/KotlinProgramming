package chapter09.section3

fun main() {
    val capitalCityMap: MutableMap<String, String> = mutableMapOf("korea" to "seoul","China" to "Beiging","Japan" to "Tokyo")

    println(capitalCityMap.values) // 모든 값 출력
    println(capitalCityMap.keys) // 모든 키 출력

    capitalCityMap.put("UK","London")
    capitalCityMap.remove("China")
    println(capitalCityMap)
}