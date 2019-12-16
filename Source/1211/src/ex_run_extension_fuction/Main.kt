package ex_run_extension_fuction

fun main() {
    val a = 10
    val b = 90

    (a * b - 2 * a).run {
        if (this > 0)

    println(this)
    }
}