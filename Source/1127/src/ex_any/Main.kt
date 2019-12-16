package ex_any

fun main(args: Array<String>)
{
    val building= Building("흑석한강센트레빌 2차 아파트", area = 112)
    printObject(building)
}

fun printObject(any: Any)
{
    println(any.toString())
}