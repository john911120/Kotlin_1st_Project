package ex_constructor

class Person constructor(name: String, age:Int){
    val name: String
    val age: Int

    init {
        this.name = name
        this.age = age
    }
}

fun main() {
    val person = Person("시명이",30)
    println("이름: ${person.name}")
    println("나이: ${person.age}")
}