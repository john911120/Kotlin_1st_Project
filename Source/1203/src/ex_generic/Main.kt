package ex_generic

fun <T> toFunction(value: T): () -> T  = {value}

fun main() {
    val func: () -> Int = toFunction<Int>(1203)
    println(func())
}


