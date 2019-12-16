package ex_mutable_list_interface

fun main()
{
    val list: MutableList<Char> = mutableListOf('g','u','n')
    println(list)

    list.add(1,'&')
    println(list)

    list.addAll(0, listOf('a','r','m','s'))
    println(list)

    println(list.set(2,'/'))
    println(list)

    println(list.removeAt(4))
    println(list)
}