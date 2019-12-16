package ex_access_modifier

class Rectangle(private val width:Int, private val height: Int)
{
    val area: Int
    get() = width * height
}

/*
    rect객체의 width 프로퍼티에 접근을 하려고 한다면 private이기 때문에
    접근이 불가능 하다는 에러를 발생하게 된다.
 */

fun main() {
    val rect = Rectangle(5, 7)
    // println(rect.width)
    println(rect.area)
}