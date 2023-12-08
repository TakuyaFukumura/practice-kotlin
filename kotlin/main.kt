fun main() {
    val obj: Any = "Hello" // Any型は任意の型
    println(
        when (obj) { // objの内容によって分岐する
            1 -> "One"
            in 2..3 -> "Two or Three"
            "Hello" -> "Greeting"
            is Long -> "Long"
            !is String -> "Not a string"
            else -> "Unknown"
        }
    )
}

fun sub() {
    // continue
    for (i in 1..5) {
        if (i == 2) {
            continue // 次のループへ行く
        }
        println(i)
    }
    // break
    for (i in 1..5) {
        if (i == 2) {
            println("*")
            break
        }
        println(i)
    }
    // 変数
    var a: Int = 1 // var 変数名: 型 = 値
    var b = 2 // 型宣言省略可能
    var c: Int // 初期値省略可能だが自動で値は入らない
    c = a + b
    println(c)

    // if
    if (c == 6) {
        println("true")
    } else {
        println("false")
    }

    // loop
    // for
    val MAX = 5
    for (i in 1..MAX) { // 1から5までループ（5回）
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
    // forEach
    var array = arrayOf("Red", "Green", "Blue")
    array.forEach { value -> println(value) }
    array.forEachIndexed { // indexも取得する
    index, value ->
        println("${index} : ${value}")
    }
    // while
    var i = 10
    while (i > 0) { // 0より大きい限りループする
        println(i--)
        --i
    }
    // do-while
    var j = 3
    do {
        j--
        println("*")
    } while (i > 0)
}
