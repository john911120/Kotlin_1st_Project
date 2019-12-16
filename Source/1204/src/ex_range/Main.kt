package ex_range

fun main()
{
    val oneToTen: IntRange = 1..10
    println(5 in oneToTen)

    val uppperAtoZ: CharRange = 'A'..'Z'
    if('C' in uppperAtoZ)
        println("대문자")

    if('p' in 'a'..'z')
        println("소문자")
}