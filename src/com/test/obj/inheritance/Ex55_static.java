package com.test.obj.inheritance;

public class Ex55_static {

	public static void main(String[] args) {
		
		StaticTest t = new StaticTest();
		
		
	} // main

} // main class

// 코딩할 때 조심해야 하는 것이 있다.

class StaticTest {
	private int a; // 객체 변수
	private static int b; // 정적 변수
	// 멤버 초기화 > 생성자
	
	// static 없는 것
	public void aaa() {
		// 객체 메서드 > static 있으나 없으나 변수에 접근 가능
		System.out.println(a); //
		System.out.println(b); // 
		
		System.out.println(this.a);
		System.out.println(this.b);//경고 
		//The static field StaticTest.b should be accessed in a static way > 정적인 방식으로 접근해라, this 붙이지마라
		
		// 허용은 하는데 원래는 에러다.
		System.out.println(StaticTest.b); // 앞에다가 Class 이름을 붙임 Heap에 b가 없어서 
		bbb(); // 호출가능
		StaticTest.bbb(); // 호출가능
	}
	// static 있는 것
	public static void bbb() {
		// 정적 메서드
		System.out.println(a);// 에러
		System.out.println(b);
		System.out.println(this.a);// this가 문제다
		System.out.println(StaticTest.b);
		// static 메소드내에서는 this 키워드를 사용할 수 없다.
		// >>> 객체 변수나 객체 메소드를 호출할 수 없다.
		// *** static 메서드 안에서는 static 변수만 접근이 가능하다.
		aaa();      // 에러
		this.aaa(); // 에러
	}
}
