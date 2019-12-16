package ex_collection_interface

fun main()
{
    val list: Collection<Int> = listOf(1, 2, 3, 4)

    println(list.size)
    println(list.isEmpty())
    println(2 in list)

    for (i: Int in list)
        print("$i")
}