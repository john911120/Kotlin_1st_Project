package ex_indexed_access_operator

fun main() {
    val person = Person("Kotlin","2016-02-15")
    println(person[0])
    println(person[1])
    println(person[-1])

    person[0] = "java"
    println(person.name)
}