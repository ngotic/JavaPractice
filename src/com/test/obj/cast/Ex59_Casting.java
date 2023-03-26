package com.test.obj.cast;

public class Ex59_Casting { // 

	public static void main(String[] args) {
	// [ CAST 형변환 ] 
	/*	
		형변환, Type Casting
		- 값형과 참조형끼리는 형변환이 불가능하다.
		
		1. 값형 형변환, Value Type Casting
		- 값형끼리 형변환
		
		2. 참조형 형변환, Reference Type Casting
		- 참조형끼리 형변환
		
		int  > double
		char > int
		
		참조형 형변환
		- 클래스끼리의 형변환 > 상속 관계에 있는 클래스끼리의 형변환이다. 상속이 이어야 가능하다. > 직계만 가능(방계는 불가능)
		- A클래스 > B클래스
		
		1. 업캐스팅, Up Casting
		   - 암시적인 형변환 > 그 무슨 짓을 해도 에러가 안난다. 
		   //  우리가 그 사실을 몰라도 에러가 안나 안보여줄거야 
		   - 자식 클래스 > (형변환) > 부모 클래스
		   - 100% 안전한 작업이다.
		   
		2. 다운캐스팅, Down Casting
		   - 명시적인 형변환
		   - 우리에게 너 여기 조심해야해! 알려주는 스타일이다. 
		   - 에러가 날수도 안날수도 있으니까 너 스스로가 잘 해결해
		   - 문제가 일어날 가능성이 있는 형변환이 다운캐스팅이다. 
		   - 부모 클래스 > (형변환) > 자식 클래스
		   - 안전하지 않을 수 있다.
		   - 100% 안되는데 되는 경우 있다. ( 겉에만 Down Casting, 실제 heap에 있는 객체는 Child인 경우 )
		   - 코드의 유연성 부여 > 팁처럼 사용 
		// 
	*/	
		
		Parent p1 = new Parent();
		p1.a = 10;
		p1.b = 20;
		Child c1 = new Child();
		c1.a = 10;
		c1.b = 20;
		c1.c = 30;
		c1.d = 40;
		Parent p2;
		Child c2;
		c2 = new Child(); // 원본
		// 복사
		// Parent = Child > 자료형이 다르다. / 근데 에러가 안난다. / 우리 모르게 뭔가가 일어난다. 
		p2 = c2;       // > 암시적인 형변환이 일어난다.
		// 부모 클래스 = 자식 클래스 ---> 자식클래스를 부모 클래스 형태로 바꾼다. > Up_Casting이다.
		p2 = (Parent)c2;       // 원형
		// 복사 완료 > 제대로 복사 완료 검증? > 출력 해본다. > 복사본의 멤버가 모두 올바르게 사용되는지 확인? 
		// 내부적 구조원리는 값형과 완전 다르다. 
		// p2 > 얘가 가진 멤버가 다 돌아가는지 확인한다
		// p2.a, p2.b 보이는건 이게끝
		
		p2.a = 10;
		p2.b = 20; 
		
		System.out.println(p2.a);  // 잘됨 
		System.out.println(p2.b);  // 복사는 안전하다.
		// 
		
//		Parent p3;
//		Child c3;
//		
//		p3 = new Parent();
//		
//		// 참조형 복사
//		// 명시적인 형변환
//		// Child = Parent 
//		// 자식 클래스 = 부모 클래스 >
//		// 부모클래스를 자식클래스로 바꿔야해서 다운캐스팅
//		c3 = (Child)p3; // 명시적
//		// Parent cannot be cast to class Child 
//		// 형변환 하다가 에러가 났어요!
//		
//		// 검증 > 눈앞에 있는 c3를 사용하는데 지장이 없는지 테스트 해야한다.
//		c3.a = 10;
//		c3.b = 20;
//		c3.c = 30;
//		c3.d = 40;
//		
//		System.out.println(c3.a);
//		System.out.println(c3.b);
//		System.out.println(c3.c);
//		System.out.println(c3.d);
	
		
		Parent p4;
		Child c4;
		
		c4 = new Child(); // 요거만 기억
		
		p4 = c4; //업캐스팅(100%) // p4.a, p4.b는 쓰는데 문제없음, 이복사는 안전
		
		Child c5;
		// 자식 = 부모
		// 다운 캐스팅(100%)
		c5 = (Child)p4;  // 겉만 부모형 p4지 실제 가리키는게 Child클래스가 힙에 있는 것
		// 실제로는 Child객체를 다시 Child 변수로 참조한 것 뿐이다.
		c5.a = 10;
		c5.b= 20;
		c5.c= 20;
		c5.d= 20;
		System.out.println(c5.a);
		System.out.println(c5.b);
		System.out.println(c5.c);
		System.out.println(c5.d);
		
		
	} // main

} // 

class Parent{
	public int a;
	public int b;
}

class Child extends Parent {
	public int c;
	public int d;
}
