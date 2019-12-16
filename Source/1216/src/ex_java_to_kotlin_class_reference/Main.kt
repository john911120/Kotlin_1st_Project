package ex_java_to_kotlin_class_reference
// 코틀린에서 자바코드 접근하기(클래스 참조하기)


fun main()
{
    val number: Int = 26
    val str:String = "2019년"

    JavaClass.PrintClassInfo(number::class.java)
    JavaClass.PrintClassInfo(str::class.java)
    JavaClass.PrintClassInfo(Double::class.java)
}