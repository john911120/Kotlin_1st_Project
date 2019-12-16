package ex_apply_extension

fun main()
{
    println(
        Person().apply{
            this.name = "jack"
            this.money = 35000000
        }
    )
}

class Person {
    var name : String = " "
    var age : Int = 0
    var money : Int = 0

    override fun toString() =  "$name $age $money"

}
