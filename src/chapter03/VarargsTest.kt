fun main() {
    normalVarargs(1,2,3,4)
    normalVarargs(4,5,6)
}
//가변인자 java는 ...붙여서 사용
fun normalVarargs(vararg counts: Int) {
    for (num in counts) {
        print("$num ")
    }
    print("\n")
}
