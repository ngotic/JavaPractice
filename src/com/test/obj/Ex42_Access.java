package com.test.obj;

public class Ex42_Access {

	public static void main(String[] args) {
		Cup c1 = new Cup();
		
		// Getter + Setter > 읽기 쓰기 가능한 멤버 > 프로퍼티
		c1.setColor("white");
		System.out.println(c1.getColor());
		
		// Setter > 쓰기 전용멤버 
		c1.setWeight(500);
		
		// Getter > 일기 전용 멤버
		System.out.println(c1.getPrice());
		
		// 계산된 프로퍼티
		System.out.println(c1.getLevel());
		
		// 자바 용어
		// c1.type      > field(필드)
		// c1.getType() > property(프러퍼티)
		
		Desk d1 = new Desk();
		
		
		// d1.color = "blu"; // 이부분에서 값으 수정하는게 문제다.
		// System.out.println(d1.color);
		 d1.setColor("blu"); // 오타나면 방지
		
		 System.out.println(d1.getColor());
		 System.out.println(d1.getColor());
		 
		 // c2(main)의 지역변수 
		 Chair c2 = new Chair(); // 멤버변수 > 세트(집합)
		 // 지역변수 > 단독
		 int a;
		 // 객체가 모든 참조가 끊기면 > 객체는 가비지가 된다. > 가비지 컬렉터가 객체를 수거한다. > 객체를 소멸시킨다. 
		 // > 내부에 멤버 변수도 같이 소멸된다. 
		 
		 // c2는 main이 끝날 때 죽는다. 
		 // c2만 죽고 / new Chair() 이 객체는 안죽는다.
		 // 그러면서 화살표가 사라진다. 주소값이 기억을 이제 못한다. 
		 // 어느 누구도 얘의 위치를 기억하지 못하는 데이터를 가비지 라고 한다.
		 // 가비지컬렉터가 수거하면 소멸이 된다. 
		 
	}//main

}
