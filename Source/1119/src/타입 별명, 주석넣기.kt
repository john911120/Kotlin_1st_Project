typealias Number = Int

fun main(args:Array<String>) {
    val a: Number = 10
    println(a)
    //으로 시작하는 부분이 주석으로 #을 입력하게되면 뒤에오는 소스코드는 모두 무시해서 존재하지 않는 코드가 된다.
    println(/*a*/)
    /* 으로 시작하는 부분은 구간 주석으로 시작과 끝을 정할 수 있다.  */

}