package ex_garbagecollection

fun main() {
    var result = ""
    var i = 1

    while (i <= 100)
    {
        result += "$i"
        i += 1
    }
    println(result)
}