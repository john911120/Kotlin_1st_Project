package ex_prefix_suffix

fun main()
{
    val str: CharSequence = "https://www.naver.com"

    println(str.startsWith("https://"))
    println(str.endsWith(".com"))

    println(str.removePrefix("https://"))
    println(str.removeSuffix(".com"))
    println(str.removeSurrounding("http://",".com"))
}