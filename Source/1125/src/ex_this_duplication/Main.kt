package ex_this_duplication

class AAA{
    var num = 15

    fun memberFunc(num : Int){
        println(num)
        println(this.num)
    }
}
fun main() {
    val a = AAA()
    a.memberFunc(53)
}