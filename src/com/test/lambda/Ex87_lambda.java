package com.test.lambda;

public class Ex87_lambda {

	public static void main(String[] args) {
		/*
		 람다식, Lambda Expression
		 - 함수형 프로그래밍 방식을 지원하는 표현식이다.
		 - 절차지향(C언어), 객체지향(C++, java)
		 - 람다식을 사용하면 코드 일부가 간결해진다. (호불호)
		 - Java 8 출시
		 - 목적 > 컬랙션(배열) 조작을 위해 .... 
		 
		 - 자바의 메소드를 표현하는 방법 중 하나로 사용 
		 - 람다식은 메소드를 대신하는 코드블록이다.
		 - 자바의 람다식은 인터페이스를 사용해서 만든다.
		 - 자바의 람다식은 익명 객체(추상메서드)를 만드는 표현을 간소화시킨 기술이다.
		 
		 - 람다식을 저장하는 인터페이스는 반드시 Functional Interface이어야 가능핟.(추상메서드를 딱 1개만 가져야 한다.)
		 - 그렇지 않으면 람다가 어떤 메서드인지 매칭할 방법이 없다. 
		 
		*/
		//요구사항] MyInterface를 구현한 객체를 생성하시오.
		
		//1. 클래스 + 객체
		MyInterface m1 = new MyClass();
		m1.test();
		
		//2. 익명 객체
		MyInterface m2 = new MyInterface() { // 
			@Override
			public void test() {
				System.out.println("익명 클래스에서 구현한 메서드");
			}
		}; // 반드시 인터페이스가 시킨 추상메서드를 구현해야 한다. 
		m2.test(); // 요만큼의 코딩이
		
		//3. 람다식  m2를 람다식 m3로 만든 사례
		MyInterface m3 = () -> { // 요만큼으로 쭐여졌다. 이놈은 얘를 상속받은 클래스가 만드는 추상메서드다.
			System.out.println("람다식으로 구현한 메소드");
		}; // 이걸 람다식이라 부른다. 소괄호, 화살표, 중괄호
		m3.test(); // 여태했던 것과 동일하다. 
		//★ 익명 객체를 만드는 문법을 훨신 더 간단하게 만들어주기 위해 람다식을 쓴다.
		
		
			
		TestInterface t1 = new TestInterface() { // 익명클래스는 쓴다. 람다식은 못쓴다.
			
			@Override
			public void bbb() {
				System.out.println("B");
			}
			
			@Override
			public void aaa() {
				System.out.println("A");
			}
		};
		
		// 3. 람다식은 메서드 하나를 정의하는 문법이다. 어떻게 2개이상 정의를 해?!!
		TestInterface t2 = () -> {
			// aaa() vs bbb() 야? >> 람다식은 aaa()를 구현하는건지 bbb()를구현하는건지 모른다.
		}; // 이건 안된다. 익명객체를 썼을 떄 람다식 썼을떄 차이점이다.
		// 람다식은 하나라서 aaa인지 bbb인지 모른다.
		// The target type of this expression must be a functional interface
		// 이 표현식의 타겟 타입은 반드시 functional Interface라 한다.
		
		t2.aaa();
		t2.bbb(); // 둘다 보이는데 
		
		
//		//2. 익명 객체를 만드는 문법을 훨신 더 간단하게 만들어주기 위해 람다식을 쓴다.
//		MyInterface m4 = () ->{System.out.println("익명 클래스에서 구현한 메서드"); }; 
		
		// 1.번은 실명클래스, [2. 3.번은 익명클래스]
		// 람다식 형식
		// - 인터페이스 변수 = 람다식
		// - MyInterface m3 = () -> {}; 
		// (매개변수) -> {};
		//a. (매개변수) : 메서드의 인자리스트
		//b.  -> : 화살표(Arrow), 구현부를 호출하는 역할. 연결 지어준다. 단지
		//c. {구현부}: 메서드의 구현부
		
		// public void test(){  syso(); }
		//
		// () -> {  // 익명 메소드(함수) 이름을 지우고 연결을 화살표로, 그리고 반환형 다지움
		//  syso();
		// }
		//
		
		//추상 메서드 형식에 따라..
		// - 매개변수 O, X
		// - 반환값 O, X
		
		NoParameterNoReturn pr1 = new NoParameterNoReturn() {
			@Override
			public void call() {
				System.out.println("pr1");
			}
		}; // new 클래스 부분은 벗겨라, 메서드 부분만 일단 냄겨
		pr1.call();
		
		NoParameterNoReturn pr2 = () -> { // 반환형 이름 없애 {}를 연결하기 위해 -> 넣고
			System.out.println("pr2");
		}; // 세미클론 만들어야한다. 문장을 만드니까 
		pr2.call();
		
		// ** 람다식 구현부에 실행문장 1줄이면 {}을 생략할 수 있다. 
		NoParameterNoReturn pr3 = () -> System.out.println("pr3");  // 요렇게만 적어도된다.
		pr3.call();
		
		//ParameterNoReturn pr7 = n ->System.out.println("pr7: " +n);
		
		ParameterNoReturn pr4 = (int n)-> { // 인자만 남았네?
			System.out.println("pr4: "+n);
		};
		pr4.call(100);
		pr4.call(200);
		pr4.call(300);
		
		// *** 매개변수의 자료형을 생략할 수 있다.
		ParameterNoReturn pr5 = (n)-> { // 인자의 자료형을 생략한다.
			System.out.println("pr5: " + n);
		};// >> 인터페이스를 통해 알 수 있으니까 저 정의를 보고 알아서 추측을 해준다.
		pr5.call(400);
		
		ParameterNoReturn pr6 = (n) -> {
			System.out.println("pr6: " + n);
		};
		pr6.call(500);
		
		// 중괄호 생략, 
		ParameterNoReturn pr7 = n ->System.out.println("pr7: " +n);
		pr7.call(600);
		
		
		MultiParameterNoReturn pr8 = (String name, int age)-> {
			System.out.println("pr6: " +name + age);
		};
		pr8.call("홍길동", 20);

		
		MultiParameterNoReturn pr9 = ( name, age)-> { // 자료형 생략가능하다.
			System.out.println("pr9: " +name + age);
		};
		pr9.call("홍길동", 20);
		// ** 매개변수의 ()는 매개변수가 1개일 떄만 생략가능하다. 
//		MultiParameterNoReturn pr10 =  name, age -> { // 에러다.
//			System.out.println("pr9: " +name + age);
//		};
		
		// 없거나 2개 이상일 떄 생략불가 
		NoParameterReturn pr11 = () -> {
			return 100;
		};
		System.out.println("pr11: "+ pr11.call());
		
		// ** 구현부에 'return문이 유일'하면, { }와 return을 생략할 수 있다.
		NoParameterReturn pr12 = () -> 200; // 리턴 키워드 자체도 생략한다. return 100; 리턴을 남기면 안된다.
		System.out.println("pr12: "+ pr12.call());
		
		//int call(int a,int b);
		ParameterReturn pr13 = (int a, int b) -> {
			return a + b;
		}; // 숫자 두개받은 걸 더한 합을 돌려준다.
		System.out.println("pr13: "+ pr13.call(10, 20));
		
		ParameterReturn pr14 = (a, b) -> a + b;
		System.out.println("pr14: "+ pr14.call(30, 40));
		// 지금 써먹을 수 있을 배열의 정렬쪽
		
		
		// Sort에서 Comparator는 구현할게 하나밖에 없었다. 그래서 
		// 이걸 써먹을 수 있었다. 
	}

}


// 얘는 functional Interface 방식이다. :> 추상메서드를 딱 한개만 가지는 인터페이스다.
interface MyInterface {
	void test(); // 추상메서드는 이거하나 만듬
}

class MyClass implements MyInterface{
	@Override
	public void test() {
		System.out.println("MyClass 클래스에서 구현한 메소드");
	}
}

interface TestInterface { // 얘는 추상메서드 2개라 functional Interface라고 부르지 못한다.
	void aaa();
	void bbb();
} // ★ 람다식은 못쓰나 익명클래스는 쓴다.


// 반환관도 없고 인자값도 없다.라는 의미로 
interface NoParameterNoReturn {
	void call();
}

interface ParameterNoReturn {
	void call(int n);
}// 파라미터는 있고 리턴값은 없다.

// 다중 파라미터 리턴값 없음
interface MultiParameterNoReturn {
	void call(String name, int age); // 매개변수 2개
}

// 파라미터 없고 리턴값 있음
interface NoParameterReturn {
	int call();
}

// 파라미터와 리턴값 있음
interface ParameterReturn {
	int call(int a,int b);
}
