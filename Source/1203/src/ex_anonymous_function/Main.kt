package ex_anonymous_function

fun main() {
    val instantFunc: (Int) -> Unit = fun(number:Int): Unit
    {
        println("Hello $number")
    }
    instantFunc(773)
    instantFunc.invoke(741)
}