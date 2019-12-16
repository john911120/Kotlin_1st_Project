package ex_member_function

fun main() {
    val building = building()
    building.name = "A 오피스텔"
    building.date = "2017-08-22"
    building.area = 120 * 8

    building.print()
}