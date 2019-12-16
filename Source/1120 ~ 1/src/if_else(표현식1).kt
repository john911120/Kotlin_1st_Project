fun main(args: Array<String>):Unit {
    val a= if(10>5){} else {}

    val b = if(10>5){ val a = 10} else { val a = 5 }

    /*
        if else 블록이 비어있거나 또는 마지막 문장의 표현식이 비어있다면
        if_else 표현식이 unit 타입이 되면서 a, b는 자동으로 unit 타입이 되며 의미 없는 값이 저장된다.
        if블록과 else 블록의 마지막 표현식의 타입은 일치해야한다.
     */
}