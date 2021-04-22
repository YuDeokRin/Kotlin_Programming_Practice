package chap02.section1

import com.example.edu.Person as User

// 사용자 클래스에 별명 붙이기
fun main() {
    val user1 = User("kildong", 30) //com.edxample.edu의 person이 user로 대체
    val user2 = Person("A123", "kildong") //이 파일 안에 있는 Person 클래스의 객체 생성
    println(user1.name)
    println(user1.age)

    println(user2.id)
    println(user2.name)
}


class Person(val id: String, val name: String)
