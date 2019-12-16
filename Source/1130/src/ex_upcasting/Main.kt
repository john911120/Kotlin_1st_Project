package ex_upcasting

open class Person(val name:String, val age: Int)

class Student(name: String, age: Int, val id: Int) : Person(name, age)

fun main()
{
   val person: Person = Student("바시명", 17,20031120)
}