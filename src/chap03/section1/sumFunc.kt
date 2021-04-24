package chap03.section1

// 덧셈 함수 정의하여 만들기

fun main() {

    val result1 = sum(3, 2)
    val result2 = sum(6, 2)

    println(result1)
    println(result2)
}


fun sum(a: Int, b: Int): Int {
    val sum = a + b
    return sum
}

// 위의 sum 함수를 간락하게 표현한 함수
//fun sum(a: Int, b: Int) =  a + b