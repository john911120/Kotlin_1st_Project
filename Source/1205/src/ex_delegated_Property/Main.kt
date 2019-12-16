package ex_delegated_Property

fun main()
{
    val sample = Sample()

    sample.number = -50
    println(sample.number)

    sample.number = 100
    println(sample.number)
}