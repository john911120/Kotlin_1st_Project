package ex_big_decimal_class


fun main()
{
    val a = 3.123456789001.toBigDecimal()
    val b = 4.987654321012.toBigDecimal()

    println(a * b)
}