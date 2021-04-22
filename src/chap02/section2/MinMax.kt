package chap02.section2

//정수 자료형과 실수 자료형의 최솟값 및 최대값 출력하기

fun main() {
    println("Byte min: " + Byte.MIN_VALUE + " max :" + Byte.MAX_VALUE)
    println("Short min: " + Short.MIN_VALUE + " max : " + Short.MAX_VALUE)
    println("int min: " + Int.MIN_VALUE + " max : " + Int.MAX_VALUE)
    println("Long min: " + Long.MIN_VALUE + " max : " + Long.MAX_VALUE)
    println("Float min: " + Float.MIN_VALUE + " max : " + Float.MAX_VALUE)
    println("Double min: " + Double.MIN_VALUE + " max : " + Double.MAX_VALUE)



    //부동 소수점으로 정의된 0.1을 1000번 반복하여 더합니다.
// 예상되는 결과값은 100이지만 실제로 100에 근접한 값인 100.09999999999859가 나옵니다.
// 10진수 0.1(10)을 2진수로 표현하면 0.0 0011 0011 0011 ...(2)를 반복하는 순환소수가 나옵니다.
// 따라서 제한된 가수 부분에 의해 Double 형식엑서 표현되는 가수 부분의 52비트를 넘어서는 부분이
// 잘려 나가서 표현되는 것입니다.


    var num: Double = 0.1

    for (x in 0..999){
        num += 0.1 //num = num +0.1
    }
    println(num)
}


