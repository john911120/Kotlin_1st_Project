package ex_mutable_collection_interface

fun main()
{
    val mutableList: MutableCollection<Int> = mutableListOf(1,2,3,4,5,6,7)
    println(mutableList)

    mutableList.add(1)
    println(mutableList)

    mutableList.addAll(listOf(8,9,10))
    println(mutableList)

    mutableList.remove(4)
    println(mutableList)

    mutableList.removeAll(listOf(2,6))
    println(mutableList)

    mutableList.retainAll(listOf(4,7,1))
    println(mutableList)

    mutableList.clear()
    println(mutableList)
}