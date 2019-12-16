package ex_thread_function

import kotlin.concurrent.thread

fun main()
{
    thread(start = true){
        print("Hello.")
        Thread.sleep(1000)
        print(" world")
    }

    Thread.sleep(500)
    print("Kotlin")
}