package com.example.myapplication

// kotlin 기초
// 1. 주요 특징 및 화면 출력
// 1) 프로그램의 시작점 com.example.myapplication.main() 함수
// 자바와는 다르게 반드시 class 안에 있을 필요가 없음
// 함수를 정의할 때 리턴타입 위치에 fun 키워드 사용
//fun practice_method() {
//
//}

// 2) kotlin 은 자바와 다르게 객체가 아니더라도 기능 (함수, 메소드)을 별도로 호출 가능
// 해당 파일만 실행해야 함 > 상단 메뉴의 run 아이콘 클릭 x
// 해당 문서에서 우클릭하여 실행하거나 사이드 파일 트리 목록에서 우클릭하여 실행

// 2. 자료형과 변수
// 1) kotlin 자료형의 종류

// (1) 기초 타입 : Boolean, Byte, Char, Short, Int, Long, Float, Double
// 기본적으로 Kotlin 은 모든 변수가 객체, 즉, 모두 참조 변수이다.
// (2) 참조 타입 : String, Any(Java의 Object와 비슷), Unit...

// 주의할 점 : 자료형의 첫글자가 대문자이다.
// kotlin은 자바와 다르게 기초타입도 객체로 만들어 참조하여 다룬다 > 대문자인 이유
// Kotlin의 기초타입인 Int, Double 도 자바의 오토 박싱과 같은 변환 기능 메소드를 가지고 있다.