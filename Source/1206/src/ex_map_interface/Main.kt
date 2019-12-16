package ex_map_interface

fun main()
{
    val map: Map<String, String> = mapOf("Apple" to "사과", "Gun" to "총포")

    println(map.size)
    println(map.keys)
    println(map.values)
    println(map.entries)
    println(map.isEmpty())
    println(map.containsKey("CoCoa"))
    println(map.containsValue("코코아"))
    println(map["Apple"])
    println(map.getOrDefault("CoCOa","코코아"))

}