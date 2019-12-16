package ex_access_modifier_overriding

open class AAA(protected open val number: Int)
{
    protected open fun hello()
    {
        println("hello")
    }
}

class BBB(number:Int) : AAA(number)
{
    public override val number: Int
        get() = super.number

    public override fun hello() = super.hello()
}

fun main()
{
    val b = BBB(28)
    val a: AAA = b

    /*
        println(a.number)
        a.hello()
        a는 AAA타입이므로  protected인 number프로퍼티, hello멤버함수에 접근 하면 에러가 발생한다.
     */
    println(b.number)
    b.hello()
}