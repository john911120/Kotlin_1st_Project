package ex_is_operator

// 상속 예제 클래스 import
import ex_inheritance.Person
import ex_inheritance.Student

class Professor(name: String, age:Int): Person(name, age)

fun main() {
    val person : Person = Student("Mark Zuckerberg", 33, 20101234)
    println("${person is Person}")
    println("${person is Student}")
    println("${person is Professor}")

    val person2 : Person = Professor("Sim", 23)
    println("${person is Person}")
    println("${person is Student}")
    println("${person is Professor}")
}