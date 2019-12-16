fun main() {
    var i = 0
    while(i < 10) {
        i += 1
        //짝수이면 continue아래의 문장들을 모두 skip한다.
        //홀수를 skip하고싶다면 1으로 설정하면 된다.
        if(i % 2 == 0)
            continue
        println(i)
    }
}