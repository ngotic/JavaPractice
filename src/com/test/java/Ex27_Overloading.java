package com.test.java;

public class Ex27_Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 메서드 오버로딩 
		// - 동일한 이름 메소드가 인자 리스트를 다양하게 가지면서 여러개 선언하는 기술
		// - 매개변수의 갯수
		// - 매개변수의 자료형
		// 메서드 오버로딩 구현 조건 > 불가능
		// 1. 매개변수의 이름 - 안됨
		// 2. 반환값의 자료형
		// 메서드 선언하는 중...
		// 1. public static void test(){}		       //O
		// 2. public static void test(){}              //X
		// 3. public static void test(int n){}		   //O
		// 4. public static void test(int m){}         //X 구분이 안간다. 호출하는 쪽에선 매개변수 이름이 뭔지 몰라
		// 5. public static void test(String s){}      //O 이건 구분가능
		// 6. public static void test(int n, int m){}  //O
		// 7. public static int  test(){}              //X 1.번떔에 안된다.
		//    test(){}가 호출되야 타입을 알지 그전엔 몰라 그래서 애매하다. 
		drawLineEqual();
		drawLineAsterisk();
		drawLineHash();
		drawLine();
		drawLine("★");
	}
	public static void drawLine() {
		System.out.println("==============================");
	}
	public static void drawLine(String s) {
		System.out.println(s);
		System.out.println(s);
		System.out.println(s);
		System.out.println(s);
	}
	public static void drawLineEqual() {
		System.out.println("==============================");
	}
	public static void drawLineAsterisk() {
		System.out.println("******************************");
	}
	public static void drawLineHash() {
		System.out.println("##############################");
	}
}
