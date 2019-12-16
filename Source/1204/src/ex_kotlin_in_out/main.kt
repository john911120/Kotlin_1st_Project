package ex_kotlin_in_out

class AAA<out T>

class BBB<in T> {

}

fun main()
{
    val aaaSub = AAA<Int>()
    val aaaSuper: AAA<Any> = aaaSub

    val bbbSuper = BBB<Any>()
    val bbbSub: BBB<Int> = bbbSuper

    var star : AAA <*> = aaaSub
}


