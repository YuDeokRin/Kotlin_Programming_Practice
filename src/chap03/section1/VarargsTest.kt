package chap03.section1


// 다양한 인자의 개수를 전달받는 함수


fun main() {
    normalVarargs(1,2,3,4) // 4개의 인자 구성
    normalVarargs(4,5,6) // 3개의 인자 구성
}


//vararg 라는 키워드를 붙여 counts를 가변인자로 지정
fun normalVarargs(vararg counts: Int){ //가변 인자의 자료형은 Int형입니다. 즉, 가변 인자 counts는 Int형 배열이 된다.
    for (num in counts) // normalVarargs() 함수는 배열의 모든 내용을 순차적으로 읽기 위해 in 키워드와 반복문을 사용
    {
        print("$num")
    }
    print("\n")
}