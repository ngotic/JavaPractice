package com.test.obj.inheritance;

public class Ex50_Object {

	public static void main(String[] args) {
		// 
		// Object 클래스
		// - 개발자가 만든느 모든 클래스는 따러 상속하지 않으면,
		// - 자동으로 Object 클래스를 상속받는다.
		// - 모든 클래스의 근원 클래스 > Root Class
		// - Object 클래스 기능 (9개 메서드) 는 모든 클래스에게 상속된다.
		// > 모든 클래스는 9개의 메소드를 소유하고 있다.(공통기능)
		
		Object o1 = new Object();
		Test2 t2= new Test2();
		t2.a = 10;
		t2.b = 20;
		Test t1 = new Test();	
	}
}

// 상속을 명시하지 않는 클래스 선언은 자동으로 Object 클래스를 
// 상속받는다.
// 자동으로 Object 클래스를 상속받음
class Test extends Object{
	public int a;
}

class Test2 extends Test {
	public int b;
}