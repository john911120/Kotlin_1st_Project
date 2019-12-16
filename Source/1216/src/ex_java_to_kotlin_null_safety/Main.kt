package ex_java_to_kotlin_null_safety

// 코틀린에서 자바 코드 접근하기 (null의 안전성)
class KotlinClass: JavaInterface
{
    override fun trim(str: String?): String =
        str?.trim() ?: ""
}

fun main()
{
    val JavaInterface: JavaInterface = KotlinClass()
    println(JavaInterface.trim("hi"))
}