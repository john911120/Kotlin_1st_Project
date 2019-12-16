package ex_extension_property

import ex_extension_function.isNumber

/*
    // 문자열이 크고 작음을 판단하는 확장 프러퍼티 함수
    // isLarge는 프로퍼티이기 때문에 소괄호를 쓰지 않는다.
    // 확장 프로퍼티도 확장 함수처럼 프로퍼티 이름 앞에서 리시버 타입을 적는다.
 */
    val String.isLarge: Boolean
        get() = this.length >= 10

fun main()
{
    println("1234567890".isNumber())
    println("4 딸라".isNumber())
}