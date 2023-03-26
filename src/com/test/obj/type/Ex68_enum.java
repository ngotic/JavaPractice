package com.test.obj.type;

public class Ex68_enum {

	public static void main(String[] args) {
		// 
		// 클래스 종류
		// 1. 클래스
		// 2. 인터페이스
		// 3. 추상 클래스
		// 4. enum
		
		// 열거형, Enumerdation
		// - 여러개 값을 가지고 있는 자료형 > 객관식(선택형)
		// 요구사항] 의류 쇼핑몰 > 티셔츠 > 고객방문>
	
		//Case 1. 주관식
//		String color = "빨강";
//		if(color.equals("빨강") || color.equals("노랑") || color.equals("파랑")) {
//			System.out.println("판매 가능");
//		} else {
//			System.out.println("재고 없음");
//		}// 이 방법은 비추
//		
//		// Case 2.
        int input = Color.RED ;
//		
//		// Color.red = 5; // 이러면 안되니까 못 건드리게 막는다. > 상수로 한다.
//		
//		if( input == 0  || input == 1 | input == 2 ) {
//			System.out.println("판매 가능");
//		} else {
//			System.out.println("재고 없음");
//		}
		// Case 3. enum을 쓰자
		
		Colour input2 = Colour.RED;  // 
		
		// 정수이니지만
		if( input2 == Colour.RED || input2 == Colour.YELLOW || input2 == Colour.BLUE ) {
			System.out.println("판매 가능"); 
		} else {
			System.out.println("재고 없음"); 
		}
		
		String gender  = "남자";
		String gender2 = "fm";
		
		Gender gender3 = Gender.MALE; 
	} // main

}

// Calendar.YEAR >> 이거같은 상수 
class Color {
//	public static int red    = 0;
//	public static int yellow = 1;
//	public static int blue   = 2;
	public final static int RED    = 0;
	public final static int YELLOW = 1;
	public final static int BLUE   = 2;
}

enum Colour { // 멤버가 이름만 나온다. 컴마로 연결된다.
	RED,      // 사실은 final static 상수(정수) 0, 1, 2 순서대로 할당된다. 
	YELLOW,
	BLUE
} // 얘도 대문자로 적는다 상수니까 

enum Gender {
	MALE,
	FEMALE
}

//enum 직급 {
//	사원, 
//	대리,
//	과장,
//	부장
//}

enum 논리 { /// 
	FALSE,
	TRUE
}/////////////