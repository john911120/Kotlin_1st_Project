package ex_exit_process_function

import kotlin.system.exitProcess

fun main()
{
    something(-1)
    println("hello")
}

fun something(num: Int)
{
    if(num < 0)
        exitProcess(0)
}
