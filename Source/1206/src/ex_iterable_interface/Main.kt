package ex_iterable_interface

fun main()
{
    val prog: IntProgression = 4..7
    println(prog.first)
    println(prog.last)
    println(prog.step)

    for(i in prog)
        print("$i")
}