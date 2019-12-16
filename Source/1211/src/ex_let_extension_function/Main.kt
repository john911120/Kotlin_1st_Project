package ex_let_extension_function

fun main()
{
    val a = 10
    val b = 10

    (a * b - 2 * a).let{ result: Int ->
        if(result > 0)
            println(result)
    }
}