//package com.test.obj.cast;
//
//public class Ex62 {
//
//	public static void main(String[] args) {
//		/////////////////
//	//	AAA a = new AAA();
//	//	a.test();
//		
//	//	BBB b = new BBB(); // 
//	}// main 
//
//}
//
////// 상속 + 접근 지정자
////class AAA { // new AAA(); 
////	// *** 접근 지정자와 상관없이 모든 멤버는 상속된다.
////	public  int a;
////	private int b;
////	public AAA() {}
////	public AAA(int a, int b) {
////		super();
////		this.a = a;
////		this.b = b;
////	}
////
////	public void test() {
////		// 같은 클래스내에서는 접근 지정자 > 무의미
////		System.out.println(this.a);
////		System.out.println(this.b);
////	}
////}
//
//class BBB extends AAA {
//	//  상속
//	public int c;
//	private int d;
//
//	public BBB(int c, int d) {
//		super(20, 10); // 기본생성자가 아니라 오버로딩된 이생성자로 알려줘
//		this.c = c;
//		this.d = d;
//	}
//	//  a(+) : public , b(-) : private
//	public void test() {
//		// 부모로부터 물려받은 a와 b를 출력
//		System.out.println(this.a);
//		// System.out.println(this.b); // [에러] The field AAA.b is not visible : 보이지 않는다.
//		
//	}
//}
//// 규약의 집합 > 모든 상속받은 클래스들의 행동으르 강제로 이행 + 사용법이 통일
//interface Printer {
//	// 프린터 자격을 
//
//	public void print();
//}
//
//class HP600 implements Printer{
//	public void print() {
//		
//	}
//}
//
//
//class LG500 implements Printer{
//	public void print() {
//		
//	}
//}
//
//
//
//
//
//
//
//
//
//
