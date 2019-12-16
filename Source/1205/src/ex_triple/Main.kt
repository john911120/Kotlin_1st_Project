package ex_triple

// 원의 지름과 원주 넓이를 반환한다.
fun calculateCircle(radius: Int): Triple<Int, Double, Double> =
    Triple(radius * 2, radius * 2 * 3.14, 3.14 * radius * radius)

fun main()
{
    val (diameter, _, area) = calculateCircle(5)
    println("지름: $diameter")
    println("넓이: $area")
}

