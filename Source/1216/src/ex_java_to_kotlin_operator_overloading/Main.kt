package ex_java_to_kotlin_operator_overloading

// 코틀린에서 자바코드 접근(연산자 오버로딩)

fun main()
{
    val java = JavaClass()

    println(13 in java)
    println(java[13])
    println(java[28])
    println(java[18])
}