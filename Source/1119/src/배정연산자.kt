fun main(args:Array<String>):Unit {
    val a : Int
    var b : Int

    a = 10 + 90
    b = 100

    b += a
    println(b) //b에 a값을 누적시킨다.

    b %= 3
    println(b) // b를 3으로 나눈 나머지를 저장시킨다.
}