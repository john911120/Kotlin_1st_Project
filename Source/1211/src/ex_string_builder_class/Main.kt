package ex_string_builder_class

fun main()
{
    val builder = StringBuilder()
        .append("2002 ")
        .append(" Seoul ")
        .append(" FIFA World Cup")

    val result = builder.toString()
    println(result)
}