package ex_object

fun main()
{
    val person = object
    {
        val name: String = "홍길동"
        val age: Int = 26
    }
    println(person.name)
    println(person.age)
}