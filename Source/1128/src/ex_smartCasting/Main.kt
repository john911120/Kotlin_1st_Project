package ex_smartCasting

fun main() {
    val number: Int? = null
    val number2 = 7722

    checkNull(number)
    checkNull(number2)
}

fun checkNull(any: Any?) {
    if(any == null) {
        println("null이 들어왔다")
        return
    }
    println(any.toString())
}
