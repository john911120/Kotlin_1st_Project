package ex_big_integer_class

fun main()
{
    val a = 1234567890.toBigInteger()
    val b = 9876543210.toBigInteger()

    println(a * b)
    println(a + b * 54321.toBigInteger())
}