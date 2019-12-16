package ex_triple_equals

fun main() {
    var a = "one"
    var b = "one"

    println(a === b)

    b = "on"
    b += "e"
    println(a !== b)

    b = a
    println(a === b)
}