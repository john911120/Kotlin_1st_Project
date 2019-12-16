package ex_kotlin_Version

// 현재 코틀린 버전은 1.3.61버전이다.

fun main()
{
    val kotlinVersion: KotlinVersion = KotlinVersion.CURRENT
    println("${kotlinVersion.major}.${kotlinVersion.minor}.${kotlinVersion.patch}")
    println(kotlinVersion.isAtLeast(1,1,0))
}