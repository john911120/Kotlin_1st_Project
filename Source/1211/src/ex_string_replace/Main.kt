package ex_string_replace

fun main()
{
    val addge = "witch one is best? "

    println(addge.replace("is","do you", ignoreCase = true))
    println(addge.replaceFirst("best","worst",ignoreCase = true))
    println(addge.replaceRange(0..9,"Kotlin "))
}