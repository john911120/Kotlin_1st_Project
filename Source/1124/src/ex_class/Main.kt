package ex_class

class Person{
    var name: String = ""
    var age: Int = 0
}

fun main() {
    val Person : Person
    Person = Person()
    Person.name = "시명이"
    Person.age = 32

    val Person2 = Person()
    Person2.name = "두하니"
    Person2.age = 27

    val Person3 = Person()
    Person3.name = "드로니"
    Person3.age = 25
}