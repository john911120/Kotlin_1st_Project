package ex_data_class

data class Employee(val name: String, val age: Int, val salary: Int) {

}

fun main()
{
      val first = Employee("John", 28, 2800)
      val second = Employee("Jackson",28,2750)
      val third = first.copy()

    println(first.toString())
    println(third.toString())
    println(first == second)
    println(first == third)
}


