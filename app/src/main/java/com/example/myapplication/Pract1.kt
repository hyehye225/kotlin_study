package com.example.myapplication

fun runPracticeCode(): String {
    val str = "Hello Kotlin App"
    val length = str.length
    return "문자열: $str\n길이: $length"
}

// kotlin > 자바와 다르게 class 영역 밖에 변수와 함수가 존재 가능
// c > 클래스를 가진 파일

// 1. kotlin 언어의 주요 특징
// 1) ; 을 사용하지 않는다. 써도 에러는 안나지만 무시됨
// 2)  변수를 만들 때 var, val 사용, 자동 형변환이 안되는 정적 타입 언어
// 3) new 키워드 없이 객체를 생성
// 4) 안전하게 null을 다룰 수 있는 문법을 제공
// 5) kotlin은 함수형 언어. 함수를 변수에 저장하고 파라미터로 넘겨주는 등의 작업이 가능