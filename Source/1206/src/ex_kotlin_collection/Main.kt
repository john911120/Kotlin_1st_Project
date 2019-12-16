package ex_kotlin_collection

fun main()
{
    val list: Collection<Int> = listOf(701, 704, 705, 708)
    val set: Collection<Int> = setOf(2,4,6,8,10)
    val map: Map<String, String> = mapOf("Rifle" to "저격총", "machine" to "기계")

    println(list)
    println(set)
    println(map)
}