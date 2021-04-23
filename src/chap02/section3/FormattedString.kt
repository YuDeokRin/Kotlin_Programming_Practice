package chap02.section2

//형식화된 다중 문자열 사용하기
//문자열 줄바꿈 문자, 탭 등 특수문자가 포함된 문자열 표현식
///   """      """기호 사용한다 이런 문자를 문자열을 형식화된 다중 문자열이라고한다
fun main() {
    val num = 10
    val formattedString ="""
        var a = 6
        var b = "Kotlin"
        println(a + num) //num의 값은 $num
    """
   println(formattedString)
}