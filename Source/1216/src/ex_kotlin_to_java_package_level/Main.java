package ex_kotlin_to_java_package_level;

/*
    자바에서 코틀린 코드 접근하기(패키지 레벨 변수 및 함수)
 */

public class Main
{
    public static void main(String[]args)
    {
        System.out.println(File1Kt.getA());
        File1Kt.func();
        File1Kt.extension(100);

        MyKotlin.func2();
    }
}
