package ex_extension_function

// 문자열이 숫자로만 이루어져있는가를 판단하는 확장 함수
fun String.isNumber(): Boolean
{
    var i = 0
    while (i < this.length)
    {
        // 숫자가 아닌 문자가 하나라도 들어가면 false
        if(!('0'<= this[i] && this[i] <= '9'))
            return false
        i += 1
    }
    // 모든 조건을 통과하면 true
    return true
}

fun main()
{
    println("1234567890".isNumber())
    println("4 딸라".isNumber())
}