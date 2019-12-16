package ex_const

const val hello = "Hello" + "World"

object Foo
{
    const val bar = "bar"
}

fun main() {
    println(hello)
    println(Foo.bar)
    println(hello)
    println(Foo.bar)
}


