package ex_memory_heap

fun main() {
    val person = object {
        val name: String = "시명이"
        val age: Int = 34
    }

    println(person.name)
    println(person.age)
}