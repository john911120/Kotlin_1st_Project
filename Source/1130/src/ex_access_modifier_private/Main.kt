package ex_access_modifier_private

    /*
        num = 5는 private이라서 접근 안된다. 에러 발생한다.
        person 객체의 age 프로퍼티에 접근을 하려고 한다. age는 public이나 setter는 private이기 때문에
        외부에서 값을 지정할 수 없다. 역시 에러가 발생한다.
    */

fun main()
{
    // num = 5
    hello(15)

    val person = Person(10)
    println(person.age)
    // person.age = 20

    println(person.isYoung)
}