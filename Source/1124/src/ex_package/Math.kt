package ex_package

//a와 b중 더 큰수를 반환하는 함수
fun max(a: Int, b:Int):Int =
    if(a > b) a else b

// a와 b중에서 더 작은 수를 반환하는 함수
fun min(a: Int, b:Int): Int =
    if(a < b) a else b

// num의 절대값을 반환하는 함수
fun abs(num:Int): Int =
    if(num >= 0) num else -num