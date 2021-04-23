package chap02.section4

fun main() {
    val num = 4 //0100 -> 0001 0000

    println(num.shl(2 )) // 왼쪽으로  움직이는 것은 *2와 같다
    println(num shl 2) //중위 표현법 (infix)

    println(num.shr(2  )) //0100 -> 0001      오른쪽으로 움직이는 것은 /2와 같다
    println(num shr 2)
    println(num.ushr(2))


}