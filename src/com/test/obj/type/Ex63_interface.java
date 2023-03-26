package com.test.obj.type;

public class Ex63_interface { ////

	public static void main(String[] args) {
		/*
		 
		 인터페이스, interface
		  - 클래스의 일종
		  - 자료형(변수 생성 가능) 
		 
		*/
		// Cannot instantiate the type Mouse
//		 Mouse m = new Mouse(); // 인터페이스는 객체로 생성할 수 없다.
//		 
//		 
		 
		 // 구매 > 10년 동안
		 HP600 hp = new HP600();
		 hp.print();
		 hp.print();
		 hp.print();
		 
		 // 교체 > 다른 프린터 구매 > 새로산 티비는 이전에 쓰던가랑 리모콘이 달라
		 // 제품이 바뀌니 사용법이 바뀜
		 LG500 lg = new LG500();
		// lg.output(); // 근데 메서드가 100개 다 달르면 앞이 깜깜하다.
		 lg.print();
		 

	} //main

} ///// main class

//interface Mouse {
//	
//	// 인터페이스 멤버 선언
//	// - 멤버 변수 선언 불가능
//	// - 추상 메서드를 멤버로 가진다
//	// *** 인터페이스는 추상 메소드들의 집합 > 인터페이스는 구현 멤버를 가질 수 없다. 
//	// > 구현맴버(변수, 구현부를 가지는 메소드)


//	// 변수는 못만든다.
//	// public int a;//The blank final field a may not have been initialized
//	// private int b; //Illegal modifier for the interface field Mouse.b; only public, static & final are permitted
//	//public void test() { }//Abstract methods do not specify a body
//	//private void test() {} //OK
//	//public static void test() {}//OK
//	// 추상메서드라 한다. 
//	// ★ 접근 지정자는 반드시 public이어야 한다.
//	public void test(); // 구현부는 없다. > 반드시 public이라서 < 안써도 된다. 생략가능 
//	void test2();
//	
//	// private void test2();// 에러다 private라고해서 에러다.
//	
//}


interface Mouse {
	
	int a; //The blank final field a may not have been initialized
	
	int b=2;
	
	void drag();
	void click();
	void doubleClick();
}

// 인터페이스를 부모로하는 자식 클래스의 의무!
// - 물려준 추상메소드의 몸통을 만들어야 한다. > 구현부 > 메소드를 구현한다. > 자식에게 구현을 맡긴다. 
// - 유언 같은 느낌이다.
///The type G300 must implement the inherited abstract method Mouse.drag()
class G300 implements Mouse{
	@Override
	public void drag() { // public을 붙여준다.
		// TODO Auto-generated method stub
		
	}
	@Override
	public void click() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void doubleClick() {
		// TODO Auto-generated method stub
		
	} // 인터페이스는 implements이다.
}

// 규격의 집합 > 모든 상속받은 클래스들의 행동을 강제로 이행 + 사용법이 통일 
interface Printer{
	// 프린터 > 자격을 가지는 모든 실제 기기들의 공통된 사용법 정의
	public void print();
}


class HP600 implements Printer{
	public void print() {
		
	}
}
class LG500 implements Printer{
//	public void output() {
//		
//	}
	public void print() {
			
	}
	
}

