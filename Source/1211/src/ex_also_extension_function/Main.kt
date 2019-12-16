package ex_also_extension_function

class Person
{
    var name: String = ""
    var age: Int = 0
    var money: Int = 0

    override fun toString() = "$name, $age, $money"
}

fun main()
{
    println(
        Person().also{ person: Person -> person.name = "Mike"
            person.money = 100 }
    )
}