package ex_nullable_receiver

fun String?.isNumber()
{
    if(this == null)
        println("문자열이 null이다.")
}

fun main() {
    val empty: String? = null
    empty.isNumber()
}