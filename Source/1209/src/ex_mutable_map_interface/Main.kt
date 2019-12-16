package ex_mutable_map_interface

fun main()
{
    val map : MutableMap<String, String> = mutableMapOf()
    println(map)

    println(map.put("HI","こんばんわ"))
    println(map)

    map["Hi"] = "hello"
    println(map)

    map.putAll(mapOf("What are you doing?" to "뭐하고 지내?","bye!" to "잘가"))
    println(map)

    println(map.remove("HI"))
    println(map)

    println(map.remove("bye!","잘"))
    println(map)

    println(map.remove("bye!","가"))
    println(map)

    map.clear()
    println(map)
}