package ex_char_sequence_split

fun main()
{
    val hello: CharSequence = "Hello. \n Thank you \n glad to meet you"
    val time : CharSequence = "2019-12-11"

    println(hello.lines())
    for(line in hello.lineSequence())
        println(line)
    println(time.split('-'))

}