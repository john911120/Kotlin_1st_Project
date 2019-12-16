package ex_any

// 건물이름과 건축일자, 면적에 관련된 건물 객체 생성
class Building(val name: String = "",
               val date: String = "",
               val area: Int = 0)
{
    override fun toString() =
        "이름: ${this.name}\n" +
        "건축일자: ${this.date}\n" +
        "면적: ${this.area} m²"
}
