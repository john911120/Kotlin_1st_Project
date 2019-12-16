package ex_reified_type_parameter

inline fun <reified T> check()
{
    val number = 0
    if(number is T)
        println("T는 Int타입이다.")
}

fun main()
{
    check<Int>()
}


