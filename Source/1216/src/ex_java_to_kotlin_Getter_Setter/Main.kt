package ex_java_to_kotlin_Getter_Setter

// 코틀린에서 자바의 getter/setter를 접근해보기
// 자바 클래스를 만들어서 코틀린에 접근 시켜봤다.
fun main()
{
    val java = JavaClass()

    java.something = 301
    println(java.something)

    println(java.isGood)
    println(java.doubleValue)
}