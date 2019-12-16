package ex_nested_class

class Outer // 외부 클래스
{
    class Nested // 중첩 클래스
    {
        fun hello() = println("중첩된 클래스")
    }
}

fun main() {
    val instance: Outer.Nested = Outer.Nested()
    instance.hello()
}