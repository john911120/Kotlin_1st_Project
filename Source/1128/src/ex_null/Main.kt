package ex_null

// upcasting 예제 Person 클래스 재활용
import ex_upcasting.Person

fun main() {
    var Person: Person? = Person("K", 29)
    Person = null

    var num: Int? = null
    num = 10
}