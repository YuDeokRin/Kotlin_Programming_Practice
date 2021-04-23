package chap02.section2


// 변수에 null 할당하기
// 코틀린은 변수에 null을 허용하지 않습니다.IntlliJ IDEA에서 변수에 할당하려고 하면
// Kotlin: Null can not be a value of a non-null type String  << 이런 식의 에러가 뜹니다.

/*
fun main() {
    var str1 : String = "Hello Kotlin"
    str1 = null // 오류 ! null을 허용하지 않음
    println("str1: $str1")
}
 */


// 하지만 변수에 null 할당을 허용하라면 자료형(String) 뒤에 물음표(?) 기호를 명시하면 가능합니다.
fun main() {
    var str1 : String? = "Hello Kotlin"
    var num : Int? = null

    //str1 = null // 오류 ! null을 허용하지 않음
//    println("str1: $str1, num: $num")
//    println("str1: $str1 length: ${str1.length}")
    //Kotlin: Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?
    //non-null단정기호나 세이프콜을 넣어라는 뜻

//    println("str1: $str1, num: $num")
//    println("str1: $str1 length: ${str1?.length}") // 세이프콜 형식


//    str1 = null
//    println("str1: $str1, num: $num")
//    println("str1: $str1 length: ${str1!!.length}") // 단정기호 형식

    str1 = null
    println("str1: $str1, num: $num")

    val len = if(str1 != null) str1.length else -1
    println("str1: $str1 length: ${len}")


}


// 위와 같이 자료형 뒤에 ?을 붙이면 가능하다
//출력 : str1: null

//따라서 String 자료형과 String? 자료형은 서로 다른 자료형이다.



