package ex_polymorphism

open class AAA
{
    open fun hello() = println("AAA 함수")
}

class BBB : AAA()
{
    override fun hello() = println("BBB 함수")
}

fun main()
{
    val one = AAA()
    val two = BBB()
    val three: AAA = two

    one.hello()
    two.hello()
    three.hello()
}