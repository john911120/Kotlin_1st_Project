package ex_pair

// 두개의 숫자의 몫과 나머지를 반환한다.
fun divide(a: Int, b: Int) : Pair<Int, Int> = Pair(a/b, a%b)

fun main()
{
    val (q,r) = divide(10, 6)
    println("몫 : $q")
    println("나머지 : $r")
}