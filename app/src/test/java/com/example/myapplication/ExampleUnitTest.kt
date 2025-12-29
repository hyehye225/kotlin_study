package com.example.myapplication

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        // assertEquals > 두 객체의 값이 같은지 여부
        // android studio 특정 줄 주석 처리 > ctrl + /
        // 영역 주석 처리 > ctrl + shift + /

//        단위 테스트 (Unit Test)
//        JUnit > Java에서 독립된 단위 테스트를 지원해주는 프레임워크
//        단위 테스트 > 해당 부분만 독립적으로 테스트하기 때문에 어떤 코드를 리팩토링
//        하여도 빠르게 문제 여부를 파악 가능
//        JUnit5 = JUnit Platform + JUnit Jupiter + JUnit Vintage
        
        // assertEquals > 두 객체의 값이 같은지 여부
        assertEquals(4, 2 + 2)

      /*  (1) Kotlin의 상수 / 변수
        val은 상수, var은 변수*/

        var token : String = ""

        var i : Int = 1
        var I : Long = 123L
        var f : Float = 0.2f
        var d : Double = 0.3
        var b : Boolean = true

  /*      var i = 1
        var I = 123L*/

//        kotlin에서는 타입을 직접 지정하지 않아도 초기화 값에 따라 타입이 자동으로 지정된다
//        초기화한 값과 내가 지급 대입하려는 값이 다를 경우에는 인코딩 메소드를 통해 강제로 값의 타입을
//        바꿔넣을 수 있다
//        toString() 등

//        kotlin은 null을 허용하지 않는다
        // null을 허용할 수 있도록 따로 지정은 해줄 수 있다
        val name : String? = null

        /*
        !! > null 값이 절대로 안들어온다고 보증해주는 연산자
        null 값이 들어오게 되면 오류가 발생하기 때문에 정말 null이 필요 없는 경우에만 유의해서 사용
        null 이 들어올지 안들어올지 모르겠다면 let 사용
        if (variable != null) 대신하는 코드 >
        */
        // ?. > 안전 호출 연산자
        val listWithNulls: List<String?> = listOf("Kotlin", null)
//        해석 : String? > null 이 될 수 있는 문자열
//        리스트 안에 "Kotlin"과 null이 들어있음
        for (item in listWithNulls) {
            item?.let {println(it)}
        }
        
        // 얘 왜 print 안되는지 확인 필요
        // () 아니고 {} 씀
        // Kotlin


//            ?. > 안전 호출 연산자
//      null 이면 아무 일도 안하고 null 이 아니면 let 실행
//      it은 null 이 아닌 String
        // ?: 와 ?.let
        // 둘 다 kotlin에서 널 값을 다를 때 사용하는 방법
        
        // 1) ?: > null 일 때 기본 값을 반환
        // 2) ?.let > null 이 아닐 때만 특정 작업을 실행

        // 1) ?: (엘비스 연산자)
        val x: String? = null
        val result = x ?: "default value" 
        // 좌변의 값이 null 이면 우변의 값을 반환, 아니면 좌변의 값을 반환
        println(result) // default value

        // 2) ?.let (안전 호출과 함께 사용하는 let 함수)
        val x1: String? = "Hello"
        x1?.let {
            println(it) // 출력 : Hello
        }

        // 변수의 값이 null 이 아닐 때만 특정 작업을 수행하고 싶을 때
        // null 이 아닐 때만 let 블록을 실행, let 블록 내에서는 it을 통해 해당 값 사용 가능

        // '?' 간단 사용
//        val myString : String = null // error 이므로 주석 처리
        val myString : String? = null // not error
        // 기본적으로 변수에는 null 값이 들어갈 수 없기 때문에 null을 허용한다는 의미
        // Object?.value 형식은 Object가 null일 수도 있다는 의미
        
        // '!' 간단 사용
        // '!!' > 해당 값이 null이 아니라는것을 확신시켜 주는 역할

        // 문자는 '' 문자열은 ""
        val name1 : String? = "홍길동" // null 일수도 있는 변수에 홍길동 할당
        // 여기서 얘는 null 값 일 수 있음
//        val name2 :String = name1 // Error, name1은 null일 수 있기 때문에
        val name3 :String? = name1 // ok, name3은 nullable
        val name4 :String = name1!! // ok, name1이 null이 아님을 보증
//
        fun strLen(s:String) : Int = s.length
        // 오류 난 이유 > 자료형은 대문자 I 써야함
        
//        타입 뒤에 물음표를 붙이면 그 타입의 변수나 프로퍼티에 null을 참조 저장할 수 있다는 뜻
//        kotlin의 모든 타입은 기본적으로 null을 참조 할 수 없다
//        fun strLen(s:String?) : int = s.length
//         에러 나는 이유 > null을 인자로 받을 수 있기 때문에 변수 s에 대해서 .length를 직접 호출 할 수 없다
//        해결법

fun strLen(s:String?) : Int =
    if(s != null) s.length else 0
    
        // 한 줄 일때는 대괄호 필요없음
//
//    // 안전 호출 연산자를 연속으로 사용하여 데이터에 대한 null 체크를 연속으로 할 수 도 있다.
//
        class Address(
            val country: String,
            val zipCode: String,
            val city: String,
            val streetAddress: String
        )
        class Company(val address : Address?)
        class Person(val name:String, val company : Company?)

        
        // 오류 나는 이유 > 타입은 무조건 존재해야 함
        // null 값 이든 아니든

    fun Person.countryName1() : String {
        val country = this.company?.address?.country
        return if(country != null) country else "unKnown"
    }

    fun Person.countryName2(): String =
        company?.address?.country ?: "unknown"

        val address = Address("충청북도 123","123-456","청주","한국")
        val company = Company(address)

        // or val company = Company(Address("충청북도 123"))
        val person = Person("홍길동",company)

        println(person.countryName1()); // 충청북도 123
        println(person.countryName2()); // 충청북도 123

    fun strLenSafe(s: String?): Int = s?.length ?: 0

        
        // with 구문
        // 1) with 는 null-safe 가 아니다, null을 받을 수 없음

        // 올바른 예시
        val address1 = person.company?.address
            ?: return

        with(address1) {
            println(country)
        }
        // 또는 run 사용
        person.company?.address?.run {
            println(country)
        }
        // 1) with >
        // 수신 객체 this
        // null-safe x
        // 주 사용 > 객체 작업 묶기

        // 2) run >
        // 수신 객체 this
        // null-safe o
        // 주 사용 > 계산 + null-safe
        
        //3) apply >
        // 수신 객체 this
        // null - safe x
        // 주 사용 > 객체 초기화
        
        // 4) let >
        // 수신 객체 > it
        // null-safe o
        // 주 사용 > null 체크
        
        // 5) also
        // 수신 객체 > it
        // null-safe x
        // 주 사용 > 부가 작업

        val str : String = "test string"
        println(strLenSafe(str)) // 일반 함수 호출 방법 유의 // > 11

        fun printShippingLabel(person: Person) {
            val address = person.company?.address
                ?: throw IllegalArgumentException("No address")
            with(address) {
                println(streetAddress)
                println("$zipCode $city, $country")

//                한국
//                123-456 청주, 충청북도 123
            }
        }
        println(printShippingLabel(person))

    }
}