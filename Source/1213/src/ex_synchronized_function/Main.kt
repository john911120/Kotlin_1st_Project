package ex_synchronized_function

import kotlin.concurrent.thread
import kotlin.concurrent.timer

private var obj : Int = 0

fun objPlus()
{
    for(i in 1..1000)
        synchronized(obj){
            obj++
        }
}


fun main()
{
    thread { objPlus() }
    objPlus()
    Thread.sleep(100)
    println(obj)
}


