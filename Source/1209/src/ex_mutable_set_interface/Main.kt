package ex_mutable_set_interface

fun main()
{
    val set: MutableSet<Int> = mutableSetOf(7,4,1)
    println(set)

    println(set.add(0))
    println(set)

    println(set.addAll(listOf(4,7,1)))
    println(set)
}