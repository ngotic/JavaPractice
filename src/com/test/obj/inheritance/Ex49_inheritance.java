package com.test.obj.inheritance;

public class Ex49_inheritance {

	public static void main(String[] args) {
		/*
		 객체 지향 프로그래밍, Object Oriented Programming, OOP
		 - 클래스 > 객체 중심의 프로그래밍 방식
		 
		 상속, Inheritance
		 - 부모가 가지는 재산을 자식에게 물려주는 행동
		 - 부모(클래스)가 가지는 재산(멤버 변수, 멤버 메서드)을
		 자식(클래스)에게 물려주는 행동
		 상속하는 이유(목적)?
		 - 비용 절감 
		 -  코드 재사용을 위한
		 
		 상속관게예 잇는 클래스 호칭
		 - 부모 클래스 <- 자식 클래스
		 - 슈퍼 클래스 <- 서브 클래스
		 - 기본 클래스 <- 확장 클래스
		 - 기본 클래스 <- 파생 클래스 
		*/
		
		// 이전에 만든 코드가 앞으로 새로 만든 클래스와 일치하는 부분이 있다면 
		// 맨땅에 헤당하는게 아니라 베이스를 깔고 그 위에다가 그린다.
		// Parent는 구형제품 > Parent의 코드를 Child에게도 사용한다.
		// 신체품을 만들 때 구형제품의 기능을 받는다. 그리고 신제품은 신제품만의 멤버를 만든다.
		
		Parent p = new Parent();
		
		p.a = 10;
		p.b = 20;
		p.ccc();
		
		Child c = new Child();
		
		c.a = 10; //
		c.b = 20; //
		c.ccc(); // 이걸 추가로 쓴다.
		
		c.d = 30;
		c.e = 40;
		c.fff();
		
	}
}


class Parent {
	public int a;
	public int b;
	
	
	Parent(){};
	
	public void ccc() {
		System.out.println("ccc");
	}

}
// 클래스 상속(extends Parent)
// - Child > 자식 클래스
// - Parent > 부모 클래스
// - 부모클래스(Parent)가 가지는 모든 멤버를 자식클래스(Child)에게 물려준다.
class Child extends Parent { 
	
//  이 소스들을 준다. 컨+C, 컨+V급인데 
//	public void ccc() {
//		System.out.println("ccc");
//	}
	public int d; //
	public int e; //
	public void fff( ) {// 
		System.out.println("fff");
	}
	// 실질적으로 Child는 변수가 4개 메서드가 2개다.
}
// 코드 재사용성 ~ 
// 사이트 회원(카페)
// 1. 일반회원
// -이름
// -아이디
// -암호
// -이메일
// 2. 관리자 회원
// - 이름
// - 아이디
// - 암호
// - 등급
// 3. 임시 회원
// - 이름
// - 아아디
// - 암호
// - 유효기간

class Member {
	public String name;
	public String id;
	public String pw;
}

class User extends Member {
	// 일반 사이트 회원 클래스
	public String email;
}

class Administrator extends Member {
	// 관리자 회원 클래스
	public String level;
}

class Temp extends Member {
	public String exDate; //
}
