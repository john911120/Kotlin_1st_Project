package ex_nothing_type

fun throwing(): Nothing = throw Exception()

fun main() {
    println("start")
    val i:Int = throwing()
    println()
}
