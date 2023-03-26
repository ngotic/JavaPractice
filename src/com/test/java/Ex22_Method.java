package com.test.java;

public class Ex22_Method {

	public static void main(String[] args) {
		/*
		 메서드, Method
		 - 메서드(Method), 함수(Function), 프로시저(Procedure), 서브루틴(subRoutine)
		 - 코드의 집합
		 - 같은 목적을 가진 코드의 집합
		 메소드 사용
		요구사항 ] "안녕하세요." x 5회 출력
		*/
		// Ctrl + C, Ctrl+V > 생산성 포함x, 유지보수성 낮다.
		hello();
		hello();
		hello();
		hello();
		hello();
		
		
	}// main
	
	// 메서드 선언
	public static void hello() {
		System.out.println("반갑습니다.");
	}

} //class
