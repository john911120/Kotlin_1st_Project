package ex_throw_exception

import javax.management.Query.div

fun main() {
    try{
        somthing()
    }
    catch(e: Exception){
        println(e.message)
    }
}

fun somthing() {
    val num1 = 10
    val num2 = 0
    div(num1, num2)
}

// a를 b로 나눈 몫을 반환하는 함수
fun div(a: Int, b: Int):Int {
    if( b == 0)
        throw Exception("0으로 나눌수 없다.")
    return a / b
}
