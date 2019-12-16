package ex_access_modifier_protected

open class AAA(protected val number:Int)

class BBB(number: Int): AAA(number)
{
    fun printNumber()
    {
        // AAA 클래스의 number 프로퍼티에 접근이 가능하다.
        println(number)
    }
}

/*
    number 프로퍼티는 protected으로 지정되어있어서 AAA, BBB 클래스 외부에서 접근이 불가능하다.
    protected는 서브클래스에서도 접근이 가능하다는 것만 빼면 private와 같다.

 */

fun main()
{
    val test = BBB(36)
    //println(test.number)
    test.printNumber()
}