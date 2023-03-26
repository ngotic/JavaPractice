package com.test.obj.type;

public class Ex71_Generic {

	public static void main(String[] args) {
		
//		String d;
//		//d.length() //String 
//		
//		char[] a;
//		//a.length //배열
//		
//		String[] s;
//		//s.length
		
		
		Item item1 = new Item();// 타입을 지정하지 않으면 Object
		item1.c = 100;
		
		Item <String> item2 = new Item<String>();
		item2.c = "홍길동";
		
		Item <Integer> item3 = new Item<Integer>();
		item3.c = 200;
		
		//Iten<int> item4= new Item<int>();
		//Item<double> item5;
		
		Pen<Boolean> p = new Pen<Boolean>();
		
		p.a=true;
		p.b=false;
		p.c=true;
		
		Desk<Double> d = new Desk<Double>();
		
		d.set(3.14);
		
		System.out.println(d.get() * 2);
		
		Cup<Integer, String> cup = new Cup<Integer, String>(100,"문자열");
		
		System.out.println(cup.getB());
		System.out.println(cup.getA());
	}

}


// 제네릭 클래스
//1. T  : 타입 변수 > 자료형을 저장하는 변수 > 값형식은 불가능, 참조형식만 가능
//2. <> : 인자 리스트
class Item<T> { // 자료형을 별도로 표기 x 이름만 적음
	public int a;
	public int b;
	public T c;//클래스 설계 당시에는 c의 자료형이 결정되지 않은 나중에 자료형이 결정된다.  
	// 객체 생성할 때
	
}


class Pen<T> {
	
	public T a;
	public T b;
	public T c;
}


// 눈에 보이는 것들만 해라
class Desk<T>{
	public T a; // 멤버 변수의 자료형
	public void set(T a) { // 매개변수 자료형
		this.a= a;
// 		T b; // 지역변수 자료형 > 비권장한다. (외부에 노출이 안되서 컨트롤 힘들다)
	}
	public T get() { // 반환값 자료형
		return this.a;
	}
}

class Cup<T, U> {
	public T a;
	public U b;
	public Cup(T a, U b) {
		this.a = a;
		this.b = b;
	}
	public T getA() {
		return a;
	}
	public void setA(T a) {
		this.a = a;
	}
	public U getB() {
		return b;
	}
	public void setB(U b) {
		this.b = b;
	}
}
