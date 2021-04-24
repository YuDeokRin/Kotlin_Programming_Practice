package chap03.section1

//함수의 매개변수에 기본값 지정하기

fun main() {
    val name = "홍길동"
    val email = "hong@example.kr"

    add(name)
    add(name, email)
    add("둘리","dooly@example.kr")

    defaultArgs() //①100 + 200
    defaultArgs(200) // ② 200 + 200  y에 넣고 싶으면 y = 100 넣으면 된다.
}


fun add(name: String, email: String = "default"){
    val output = "${name}님의 이메일은${email}입니다."
    println(output)
}


fun defaultArgs(x: Int = 100, y: Int = 200) {
    println(x + y)
}


//add() 함수는 매개변수 email의 기본값을 지정하고, defaultArgs() 함수는 모든 매개변수의 기본값을 지정했습니다.
//두개의 함수는 비교하면서 보기