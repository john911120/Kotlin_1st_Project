package ex_java_to_kotlin_types

// 코틀린에서 자바타입을 접근하기(타입)
fun main()
{
    val rand : Double = Math.random()
    println(rand)

    val buffer: StringBuffer = StringBuffer()
    buffer.append("Hello")
    buffer.append("world")
    val result: String = buffer.toString()
    println(result)
}