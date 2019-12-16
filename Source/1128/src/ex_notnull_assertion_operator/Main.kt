package ex_notnull_assertion_operator

// 멤버함수 Building 클래스 재활용
import ex_member_function.building

fun main() {
    var obj: building? = building()
    obj!!.name = "서울시청"
    println(obj!!.name)

    obj = null
    obj!!.print()
}