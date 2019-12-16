package ex_closure

fun returnFunc(num: Int): () -> Unit = {println(num)}

fun main() {
    val f: () -> Unit = returnFunc(30)
    f()
}
