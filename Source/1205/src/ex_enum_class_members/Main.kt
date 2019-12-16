package ex_enum_class_members

enum class Mode(val number: Int)
{
    SELECTION(0),
    PEN(1),
    SHARP(2),
    ERASER(3);

    fun printNumber()
    {
        println("모드: $number")
    }

}

fun main()
{
    // 현재 선택된 모드
    val mode: Mode = Mode.ERASER

    println(mode.number)
    mode.printNumber()
}