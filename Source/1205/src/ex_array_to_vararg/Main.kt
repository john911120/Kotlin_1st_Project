package ex_array_to_vararg

fun printAll(vararg tokens: String)
{
    for(token in tokens)
        print("$token")
}

fun main()
{
    val numbers: Array<String> = arrayOf("What's", "your", "name?")
    printAll(*numbers)
}