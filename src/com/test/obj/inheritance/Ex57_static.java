package com.test.obj.inheritance;

public class Ex57_static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 요구사항]
		// 1. 펜을 생산하시오. > class Pen > new Pen();
		// 2. 생산된 펜을 개수를 세시오.
		
		// Case 1
		// - 간편하다.
		// - Pen과 Count간의 관계가 약하다. > 둘의 연관성이 낮다. 좋은 방법은 아니다. 
//		int count = 0; // 누적 변수
//		Pen p1 = new Pen("Monami", "Black");
//		count++;
//		
//		Pen p2 = new Pen("Monami", "Black");
//		count++; // 여길 빼먹으면 안됨
//		
//		Pen p3 = new Pen("Monami", "Black");
//		count++;
//		
//		System.out.println("볼펜 개수: " + count);
		
		// Case 2
		// 클래스를 손을 본다.
		// - Pen 클래스와 count 변수간이 관계를 강하게 연결
		// - count 벼수가 객체마다 존재 > count를 개인 데이터로 취급 > count는 개인 데이터가 아니다. > 공용 데이터
//		Pen p1 = new Pen("Monami", "Black");
//		p1.count++;//정당성?? 
//		
//		Pen p2 = new Pen("Monami", "Black");
//		p1.count++;
//		
//		Pen p3 = new Pen("Monami", "Black");
//		p1.count++;
//		
//		System.out.println("볼펜 개수: " + p1.count); // 3
//		System.out.println("볼펜 개수: " + p2.count); // 0
//		System.out.println("볼펜 개수: " + p3.count); // 0
		// p1.count =1 , p2.count =1, p3.count=1 // p1.count++;p2.count++;p3.count++;
		// 결국은 자기 count 변수 각자 샌거다.
		// 	p1.count++;	p1.count++;	p1.count++; // 근데 왜 p1한테만? > 정당성이 있어?
		
		// Case 3 
		// - Pen 클래스와 count 변수간이 관계를 강하게 연결
		// - 공용 데이터 성격으로 count를 만듬 > static
		// - 이것도 단점 중간에 count++을 뺴먹으면? 
//		Pen p1 = new Pen("Monami", "Black");
//		Pen.count++;
//		Pen p2 = new Pen("Monami", "Black");
//		
//		Pen.count++; // 얘를 뺴먹으면? 
//		
//		Pen p3 = new Pen("Monami", "Black");
//		Pen.count++;
//		
//		System.out.println("볼펜 개수: " + Pen.count); // 3
		// Pen을 몇개를 만들건 누적 변수가 하나만 생긴다. 가장 좋은 방법이다.
		
		// Case 4
		// - count++,  Pen p3 = new Pen("Monami", "Black"); + Pen.count++; 두 줄을 합친다.
		// 생성자에다가 Pen.count++를 추가한다. 
		// 이제 count를 세는게 외부에 누출이 안된다. 
		Pen p1 = new Pen("Monami", "Black");
		
		Pen p2 = new Pen("Monami", "Black");
		
		Pen p3 = new Pen("Monami", "Black");
		
	}

} // main class

class Pen {
	private String model;
	private String color;
	
	public static int count; // 여기다가 변수를 선언한다. 편의상 public으로 연다. 다같이 쓰는 데이터 -> Static
	
	// 정적 생성자 > static 있는 생성자.
	static { // 정적 생성자 이건 우리가 못부른다. 이게 자동으로 만들어져 있다. 
		Pen.count=0; // static 변수만 초기화한다.
		// 여긴 오버로딩도 없다 유일하게 하나만 존재한다. 
	}
	
	// 객체 생성자 > static 없는 생성자.
	public Pen(String model, String color) { //
		this.model = model;
		this.color = color;
		
		Pen.count++; // 
	} // 

	@Override
	public String toString() {
		return "Pen [model=" + model + ", color=" + color + "]";
	}
}

