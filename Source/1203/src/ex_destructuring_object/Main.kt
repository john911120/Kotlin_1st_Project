package ex_destructuring_object

data class Employee(val name: String, val age: Int, val salary: Int) {

}

fun main()
{
    val (name, _, salary) = Employee("John", 28, 2900)
    println(name); println(salary)
}