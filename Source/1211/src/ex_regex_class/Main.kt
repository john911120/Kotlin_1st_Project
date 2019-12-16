package ex_regex_class

fun main() 
{
    val regex = Regex("[0-10]+")
    val str = "123456789"
    val str2 = "123 456 7890"
    
    println(regex matches str)
    println(regex matches str2)
    println(regex.replace(str2, "숫자"))
}