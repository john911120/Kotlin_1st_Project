package ex_it_identifier

fun main()
{
    val instantFunc: (Int) -> Unit =
        {
        println("Hello $it")
    }
    instantFunc(708)
}