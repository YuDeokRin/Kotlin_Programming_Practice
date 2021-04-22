package chap02.section2

//문자열에 표현식 사용하기
fun main() {
    var a = 1
    val str1 = "a = $a" //문자 하나만 쓸 때는 중괄호{} 생략
    val str2 = "a = ${a + 2}" //문자열에 표현식 사용

    println("str1: \"$str1\", str2 \"$str2\"")
}