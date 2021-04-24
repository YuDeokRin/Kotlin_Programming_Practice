package chap03.section1

//매개변수 이름과 함께 함수 호출하기

fun main() {
    namedParam(x = 200, z = 100) //x, z의 이름과 함께 함수 호출(y는 기본값 사용)
    namedParam(z = 150) // z의 이름과 함께 함수 호출(x와 y는 기본 값으로 지정됨)
}


// z는 기본값을 지정하지 않았으므로 반드시 인자를 전달해 주어야함
fun namedParam(x: Int= 100, y:Int = 200, z: Int) {
    println(x+ y+ z)
}