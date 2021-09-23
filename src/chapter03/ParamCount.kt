package chapter03

fun main() {
    noParam({"hello world!"})
    noParam{"hello world!"}
}

fun noParam(out: ()->String) = println(out())