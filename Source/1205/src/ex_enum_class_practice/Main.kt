package ex_enum_class_practice

enum class Mode
{
    SELECTION, PEN, SHARP, ERASER
}


fun main()
{
    val shapeMode: Mode = Mode.SHARP
    println(shapeMode.name)
    println(shapeMode.ordinal)

    val modes: Array<Mode> = Mode.values()
    for(mode: Mode in modes)
        println(mode)

    println(Mode.valueOf("PEN").ordinal)
}