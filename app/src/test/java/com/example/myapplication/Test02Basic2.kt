package com.example.myapplication

//// practice_method2의 println 이 실행되지 않는 것이 아니라
//// Android 에서는 println 출력이 화면이 보이지 않는다
//// 1) Kotlin 문법은 Log.d() 로 연습
//// 2) 결과 화면은 TextView 로 확인
//// 3) 콘솔 연습은 Kotlin/JVM 프로젝트로
//
//// 2. 자료형과 변수
//// java의 경우 자료형이 큰 변수 (Double)에 작은 타입의 값 (int)를 대입하면 자동 형변환이 되지만
//// kotlin은 자동 형변환을 지원하지 않아 에러 발생
//
//// 1) 기초 데이터 타입의 경우 toXXX() 메소드로 변환이 가능
//// 2) 참조타입의 경우 as 라는 형변환 연산자 사용
//
//// ** Kotlin은 Java 처럼 클래스 안에서만 코드 실행되는 구조가 아니지만,
//// 파일에서 최상위 실행 코드는 반드시 함수 안에 넣어야 한다.
//
//private const val TAG = "PRACTICE"
//fun practice_method2() {
//    // 문자열 String 객체
//    var s:String = "Hello"
//    Log.d(TAG,s)
//
//    //var s2:String = String("Hello") > error
//
//// ** expecting a top level declaration
//// 1. 일반 Kotlin 연습용 파일 > main() 함수 안에 코드 작성
//// 2. Android 앱 파일 > onCreate() 같은 함수 안에서 코드 작성
//
//    var str:String = "123"
//// var n:Int = str > error (Int 변수에 String 대입 불가능)
//
//    var m:Int = str.toInt()
//    Log.d(TAG,m)
//
//    var str2:String = "5.64"
//    var m2: Double = str2.toDouble()
//    Log.d(TAG,m2)
//
//    // 2) val : 값 변경이 불가능한 변수
//    // <> 상수와는 다른 개념. 상수는 const 키워드로 만듬
//    // 권장되지는 않지만 변수를 만들때 값을 지정하지 않으면 한번은 대입이 가능하다.
//
//    val n3: String
//    n3 = "Nice"
//    // n3 = "Good" // > 한번 초기화 된 이후이므로 error
//    println(n3)
//
//    // val과 const val의 차이
//    // 1) const val : 컴파일 시에 값이 설정됨
//    // 2) val : 런타임(실행시) 값이 설정됨
//    // 문법적 차이
//    //const val name:String = getName() // error > 컴파일 때는 함수 호출 이전이라 초기화 불가능
//    //const val name : String = "sam" // compile 시 sam으로 초기화
//
//    //val name:String=getName() // ok : 런타임 시 함수 호출의 리턴 값으로 초기화
//
//    // 데이터를 가지는 변수는 var
//    // 객체를 참조하는 변수는 val > 객체
//
//    // var 변수명 뒤에 : 자료형 > 번거롭게 쓰는 걸 방지하기 위해 자동추론 기능 제공
//    // > 자료형을 생략하며 변수선언이 가능 > 자료형은 자동 추론됨
//    // !! 자동 추론을 하는 변수를 사용할 시 반드시 선언하면서 값 대입
//
//    // error ex
//    // var gg
//    // gg = 10 > error : 자료형 추론 불가능하므로
//
//    // 정수값 표기의 특이한 점 : 숫자의 3자리마다, 구분을 사용하듯이 _문자로 구분자 사용 가능, 잘 사용 x
//    var a3 = 5_000_000
//    println(a3)
//
//    // kotlin 만의 자료형 타입 - 최상위 클래스
//    // Any
//    // 어떤 타입의 데이터 값도 대입이 가능
//    // 자료형 예측이 어려워 선호되지 않는다
//    // 파라미터 or 리턴값의 타입 지정이 어려울 때 업캐스팅의 목적으로 많이 사용
//    var v: Any
//    v = 10
//    println(v)
//
//    v = 3.14
//    println(v)
//
//    v = "Hello"
//    println(v)
//
//    // kotlin은 null 값을 저장할 수 있는 변수와 저장할 수 없는 변수가 구분되어 존재
//    //var n2: Int = null // error
//    //var s: String = null // error
//
//    // ? 가 붙은 nullable 타입 참조변수는 ? 가 없는 일반적인 non nullable 타입 참조변수와 달리
//    // 멤버를 사용할 때 특별한 연산자가 필요
//    var bbb1: String ?= "Hello"
//    //println(bbb1.length) // error > null safety 연산자 필요
//    // 객체가 null 이면 . 연산자로 접근할 객체가 없어 null point exception 이 발생
//    // kotlin은 자바와 달리 이를 문법적 에러로 만들어놓음
//    var bbb2: String ?= "Hello"
//    println(bbb2?.length) // ok 출력 : 5
//
//    // 자료형을 명시하지 않아 '자동추론'을 시키면 기본적으로 nullable 타입으로 추론된다
//    var t = null
//    println(t) // 출력 null
//
//    println("Hello" + "Kotlin") // ok
//    //println(10 + "Hello") > 자동 형변환이 이루어지지 않기 때문에 error
//    println(10.toString() + " Hello")
//    // 특이한 점 : 문자열이 먼저 있으면 자동 형변환이 되어 덧셈이 가능해진다.
//    println("Hello" +10)
//    // 그러나 가독성 떨어지므로
//    // 문자열 템플릿 사용
//    var name = "sam"
//    var age = 20
//    println("이름: $name\n나이 : $age")
//
//    // 자료 출처 >
//    // https://kitesoft.tistory.com/123


//}


