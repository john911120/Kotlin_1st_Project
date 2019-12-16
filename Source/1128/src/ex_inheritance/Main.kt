package ex_inheritance

open class Person(val name: String,  val age: Int)

class Student (name : String, age: Int, val id: Int): Person(name, age)

fun main()
{
    val person = Person("박시명",33)
    val student = Student("박한두",18,20181212)
}