fun main(args: Array<String>):Unit {
    /*
        when은 아래와 같이 if_else 처럼 사용이 가능하다.
     */
    val score = 90

    val grade:Char = when
    {
        score >= 60 -> 'D'
        score >= 70 -> 'C'
        score >= 80 -> 'B'
        score >= 90 -> 'A'
        else -> 'F'
    }
    println(grade)
}