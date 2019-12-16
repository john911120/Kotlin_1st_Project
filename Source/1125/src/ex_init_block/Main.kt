package ex_init_block

class Size(width: Int, height:Int){
    val width = width
    val height: Int

    init {
        this.height = height
    }

    val area : Int

    init {
        area = width + height
    }
}

fun main() {
    val size = Size(10, 50)
    println(size.area)
}