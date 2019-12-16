package ex_trim_char_sequence

fun main()
{
    val str = " what "

    println(str.removeRange(0..3))

    println(str.padStart(20,'*'))
    println(str.padEnd(17,'*'))

    println(str.trimStart())
    println(str.trimEnd())
    println(str.trim())

    println(str.slice(2..4))
    println(str.subSequence(1..3))
    println(str.substring(1..3))

    println(str.reversed())
}