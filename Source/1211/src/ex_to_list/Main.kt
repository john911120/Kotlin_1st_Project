package ex_to_list

fun main()
{
    /*
    Pair 타입인수가 모두 같아야한다.
    */
    val list : List<Int> = Pair(10, 30).toList()

    /*
    Triple 타입 인수가 모두 같아야한다.
    */
    val list2 : List<Double> = Triple(4.71, 7.05,7.08).toList()
}