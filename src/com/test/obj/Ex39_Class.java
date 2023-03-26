package com.test.obj;

public class Ex39_Class {

	public static void main(String[] args) {
	
		User u1= new User();
		u1.name = "홍길동";
		u1.age  = 20;
		u1.hello();
		
		User u2 = new User();
		u2.name = "아무개";
		u2.age = 25;
		u2.hello();
		
		User u3 = new User();
		u3.name = "하하하";
		u3.age = 23;
		u3.hello();
		// 객체를 여러개 만드는 목적도 있다. 
//		// 
	}

}// class

// 클래스는 파스칼 표기법을 쓴다. 
class User {
	// 멤버 선언
	// 1. 변수
	// 2. 메서드
	public String name;
	public int age;
	
	// 메서드 > 구현 > 개성있는 행동 > 자신만이 가진 데이터를 활용해서 행동
	// 멤버 변수가 개입된 코드를 구현하는 것이 좋다. 
	public void hello() {
		// 정적
		// System.out.println("안녕하세요.");
		System.out.printf("안녕하세요. 저는 %s입니다. 그리고 제 나이는 %d살입니다.\n",
				this.name, 
				this.age);
	}
}
