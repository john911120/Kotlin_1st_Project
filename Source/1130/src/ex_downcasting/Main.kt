package ex_downcasting

import ex_upcasting.Person
import ex_upcasting.Student
/*
    캐스팅에 실패 했을 때 예외가 발생하는 것을 막고 싶다면...
    as? 연산자를 대신 사용해야한다. 이 연산자는 캐스팅이 실패하면 null을 돌려준다.
 */


fun main() {
    val Person: Person = Student("john", 28,20101635)
    val Person2: Person = Person("jackson", 28)

    var person3: Student = Person as Student
    person3 = Person2 as Student
}