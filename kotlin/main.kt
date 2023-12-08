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
    val MAX = 5
    for(i in 1..MAX){ // 1から5までループ（5回）
        if (i == MAX) println(i) else print(i)
    }
    for (i in 6 downTo 0 step 2) { // 6から2ずつ引いていく
        println(i)
    }
    for (i in 7 downTo 0 step 2) { // 7から2ずつ引いていく、0以下にはならない模様
        println(i)
    }
    for (i in 10..1) { // 何もせず終わるもよう
        println(i)
    }
}
