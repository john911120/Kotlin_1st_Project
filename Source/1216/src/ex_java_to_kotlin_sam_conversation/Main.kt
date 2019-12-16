package ex_java_to_kotlin_sam_conversation

// 코틀린에서 자바코드 접근하기(SAM'단일 추상 메서드')변환

fun main()
{
    val runnable: Runnable = Runnable{ println("SAM")}
    runnable.run()
}