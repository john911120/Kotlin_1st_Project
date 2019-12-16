package ex_exception_handling

fun main()
{
    try{
        val str = "abcd"
        val num = str.toInt()
        println(num)
    }
    catch (e:NumberFormatException) {
        println("문자열을 숫자로 변경 안된다.")
    }
    finally
    {
        println("프로그램 종료")
    }
}