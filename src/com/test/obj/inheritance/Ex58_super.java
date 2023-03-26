package com.test.obj.inheritance;

public class Ex58_super {

	public static void main(String[] args) {
		
		//[ super 키워드 ]
		// - this와 같은 역할 > 객체를 가리키는 상대 표현
		// - 자기 자신(x) > 부모 객체(O) 
		// - 상속 관계에 있는 부모 객체 가르키는 상대 표현 
		// - "우리 아빠, 우리 엄마"
		// - 부모( 상대표현)
		
		//[ this 키워드 ]
		//- 객체 접근(지정) 연산자
		//- 객체 자신을 가르키는 상대 표현
		//- 나
		//- 객체 메소드내에서 객체 자신 참조 > 객체 멤버(변수, 메소드)를 접근할 때
		// - 또 다른 생성자를 호출할 때 생성자 이름 대신에 this를 사용
		
		// this(인자); : 이렇게 호출하면 클래스 안에서 생성자를 호출한다.
		TestChild c = new TestChild(); 
		c.test();
		//System.out.println(c.a);
		//System.out.println(c.b);
		
		c.a = 10;
		c.b = 20;
		c.bbb();
		
	}// main

} // main

class TestParent {
	public int a;
	
	public void aaa() {
		System.out.println(a);
		System.out.println(this.a);
	}
	public void test() {
		System.out.println("부모 메서드");
	}
}

class TestChild extends TestParent {
	public int b;

	public void bbb() {
	
		System.out.println();
		test(); // 부모가 물려준 test() vs 자신기 선언한 test()
		this.test(); // 사실 앞에 this가 생략된 것
		super.test(); // 이게 오버라이딩으로 감춰진 부모 메서드를 명시적으로 호출
		System.out.println();
	}
	
//	public void test() {
//		System.out.println("자식 메서드");
//	}
}

//// 자기 자신이 만든 멤버 변수
//System.out.println(b);
//System.out.println(this.b);
//// System.out.println(super.b);// 이건 아예 에러다.
//
//// 부모로 부터 상속받은 멤버 변수 
//System.out.println(a); 
//System.out.println(this.a);  // 부모가 만든 변수지만 this로도 접근 가능  
//System.out.println(super.a); // 이게 조금 정확히하면 맞긴함



//개발자가 생성자 명시적으로 1개이상 선언 > TestParent() 기본 생성자는 자동 선언되지 않는다.
	// 컨트롤 스페이스 엔터 > 기본생성자
//	public TestParent(int a) {
//		this.a = 100;
//	}



//public TestChild() { //Implicit super constructor TestParent() is undefined. Must explicitly invoke another constructor
//// super(); // 인자값이 없는 부모 생성자를 호출하라.
//// 이걸 지우면 부모 생성자가 호출이 안되나? 아니다 잘된다. > 무조건 생성자는 호출이 된다.
//super(300);
//this.b = 200;
//}