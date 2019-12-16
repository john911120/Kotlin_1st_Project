package ex_access_modifier_private

// Test.kt 파일 안에서만 접근 가능
private var num = 10

private fun print()
    = println(num)

// 어느 곳에서도 접근 가능
public fun hello(value: Int)
{
    num = value
    print()
}

public class Person(age: Int)
{
    //디폴트 setter를 private으로 지정 setter는 person 클래스 내부에서만 접근 가능
        public var age = age
            private set
    //getter를 public으로 지정, getter는 어디에서나 접근 가능
        public val isYoung public get() = age < 30
}