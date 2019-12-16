package ex_comparable_Interface

class Rectangle(val width: Int, val height: Int): Comparable<Rectangle>
{
    val area = width * height

    override fun compareTo(other:Rectangle): Int =
        when
        {
            this.area>other.area -> 1
            this.area<other.area -> -1
            else -> 0
        }
}

fun main()
{
    val rect = Rectangle(3, 4)
    val rect2 = Rectangle(6, 4)
    val rect3 = Rectangle(6, 6)

    println(rect >= rect3)
    println(rect < rect2)
    println(rect2 > rect3)
}