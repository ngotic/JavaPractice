package com.test.obj;


public class Chair {
	private int a; // 멤버 변수 : 얘도 변수일 뿐인데 성질이 다르다. 
	// 클래스 멤버 변수의 생명 주기
	// - 객체를 생성할 때 변수가 태어난다. 
	// - new Chair();
	
	
	// 지역변수의 생명주기 
	public void test(int b) {// 지역변수(매개변수)
		int c; // 지역변수
		
		// int b;
		
		if(true) {
			int d;
		}
		
		// loop 변수 i의 생명주기 : for 시작 ~ 끝
		for(int i=0 ; i<10 ; i++) { // i는 딱 한번 만들어진다.
			
			//for 내의 변수 e의 생명주기: for 1바퀴 > 반복 
			int e; // 얘는 i가 10번 만들어지고 10번사라진다.
		}

//		System.out.println(i); 
//		System.out.println(e);
	
		
//		while(true) {
//			int d;
//		}
		
		
		
		// new는 완성형, 생성자는 우리가 적극적으로 건든다. 
		// 자료형 변수 = 객체생성연산자 생성자();
		Test t = new Test();
	
		// Test.Sub s = new Test.Sub();// 이것도 안됨 
		
		// 개발자 입장에선 객체와 인스턴스가 크게 구분되지 않는다. 
		// 객체 (=Object, 철학용어 )
		// - 실존하고, 다른 객체와 구분되어지는 객체
		
		// 인스턴스 ( 전산용어에 가깝다 ) 
		// - 객체
		// - 메모리에 실체화된 객체를 인스턴스라고 부른다. 
		
	}
}


class Test {
	// 일반적인 클래스 멤버 
	private int a;
	
	public void bbb() {
		// public void ccc() {} // 메서드 안에 메서드는 안된다. 일반 명령어만 들어간다 .
	}
	
	
	// 어떤 클래스 안에서만 쓰려는 전용클래스다. 스윙에서 쓰기도 했다. 
	// 내부 클래스, 중첩클래스, inner class
	class Sub { // 클래스 안에는 클래스도 들어간다. 
		
	} // 괄호의 역할은 스코프다. 
	// 내부 클래스는 일반적이지 않다. 
	
	public void ccc() {
		Sub s = new Sub();
	}
}

