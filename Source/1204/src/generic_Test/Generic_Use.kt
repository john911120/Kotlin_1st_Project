package generic_Test

class MyClass <T> // 형식 타입 선언을 <T>으로 하였다.
{
    var info: T? = null // 형식 타입 이용으로 프로퍼티, 함수 타입으로 선언하였다.
}


fun main()
{
    val obj1 = MyClass<String>()
    obj1.info = "Hello"

    val obj2 = MyClass<Int>()
    obj2.info = 10
}