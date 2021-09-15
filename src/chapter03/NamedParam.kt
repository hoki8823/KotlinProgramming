
//원하는 인자값은 명시해서 매개변수로 넘김
fun main() {
    namedParam(x=200,z=100)
    namedParam(z=150)
}
fun namedParam(x: Int = 100, y: Int = 200, z: Int) {
    println(x+y+z)
}