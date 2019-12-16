package ex_kotlin_to_java_companion_object;

/*
    자바에서 코틀린 코드 접근하기(동반자 객체)
 */

public class Main
{
    public static void main(String[] args)
    {
        KotlinClass.Companion.setNum(30);
        System.out.println(KotlinClass.Companion.getNum());
        KotlinClass.Companion.hello();

    }
}
