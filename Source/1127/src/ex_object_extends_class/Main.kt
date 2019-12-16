package ex_object_extends_class

open class person(val name: String, val age: Int)
{
    open fun print()
    {
        println("이름: $name")
        println("나이: $age")
    }
}

fun main()
{
    val custom : person = object : person("Alan", 25)
    {
        override fun print()
        {
            println("이야~이거슨 객체이다.")
        }
    }
    custom.print()
}