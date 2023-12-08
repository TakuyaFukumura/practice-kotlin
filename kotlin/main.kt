fun main() {
    // 変数
    var a: Int = 1 // var 変数名: 型 = 値
    var b = 2 // 型宣言省略可能
    var c: Int // 初期値省略可能だが自動で値は入らない
    c = a + b
    println(c)

    // if
    if(c == 6){
        println("true")
    }else{
        println("false")
    }

    // loop
    // for
    for(i in 1..5){
        print(3)
    }
    for (i in 6 downTo 0 step 2) {
        println(i)
    }
}
