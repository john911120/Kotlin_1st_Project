package ex_lazy_function

class AAA
{
    var num: Int = 0
    val num2 by lazy { num *10 }
}

fun main()
{
    val one = AAA()
    println(one.num2)
    one.num = 10
    println(one.num2)


    val two = AAA()
    two.num = 5
    println(two.num2)
}