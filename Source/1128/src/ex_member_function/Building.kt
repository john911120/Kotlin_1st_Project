package ex_member_function
/*
    건물명과 건축일자 면적의 객체를 저장한다.
 */
class building{
    var name = ""
    var date = ""
    var area = 0

    fun print(){
        println("이름:" + this.name)
        println("건축일자: " + this.date)
        println("면적: ${this.area} ㎡")
    }
}