//package com.test.obj.cast;
//
//
//public class Ex60_Casting {
//
//	public static void main(String[] args) {
//		// 상황 ] 대리점 운영 > 프린터 판매
//		// 1. HP600 x 5대, LG500 x 3대 : 모델이 있다고 치자
//		// 2. 주기적으로 제품 점검
//		
//		// 목적 ] 제품 점검 > 어떻게 효율적으로 할까? 
//		// 변경사항 ] HP600 > 500대, LG500을 300대? 
//		// 변경사항 ] 브랜드 증가 > BenQ, ASUS, MS.. 브랜드 늘어나는 것에 유연하게 반응하기 힘들다.
//		
////		m1();
//		//m2();
//		m3();
//	}// main
//
//	private static void m3() {
//		// Case 3.
//		// 형변환 사용
//		HP600 hp = new HP600("black", 250000, "ink");
//		LG500 lg = new LG500("white", 350000, "lazer");
//		
//		Printer p1;
//		// 부모 = 자식
//		// 업캐스팅
//		p1 = hp;
//		
//		// 업캐스팅
//		Printer p2 = lg;
//		
//		Printer[] list = new Printer[2]; // 형변환 때문에 이게 가능해졌따. 
//		list[0] = hp;
//		list[1] = lg;
//		
//		// list > HP와 LG를 한번에 담은 배열이 되었다. 서로 다른 자료형도 하나의 배열에 넣었다.
//		// 형제뻘되는 클래스들으 객체를 부모 타입에 한번에 담는다. > 편하다!
//		
//		Printer[] ps = new Printer[8]; // 제고가 늘면 이 숫자만 바꾸면 됨
//		
//		for(int i=0; i< ps.length; i++) {
//			
//			// 여기 통제 숫자만 바꾸면 됨
//			if( i < 5) // 형제뻘되는 애들을 다 데리고 부모로 업캐스팅을 해버린다. 
//				ps[i] = new HP600("black", 2500000, "ink");
//			else 
//				ps[i] = new LG500("white", 2500000, "lazer");
//		}
//		// 점검 
//		for(int i=0; i<ps.length ; i++) {///////////////////////////////////////////////////
//			ps[i].print(); // 오버라이딩 때문에 각각 HP나 LG로 찍힌다. 껍데기는 Printer이지만 알맹이는 HP나 LG
//		// 이게 안된다. >> Printer 껍데기가 print()가 없다. >> 그래서 print()를 만들어줬다.
//			// 다운 캐스팅 > 평소에는 형제들과 같이 부모 배열에 넣어서 관리하다가. 자식만이 가지고 있는 고유 기능을 사용해야 할 때 
//			// 에러다 > 5바퀴 때는 HP인데 6번쨰에서 LG로 되서 이런다.
////			if(i < 5) {
////				HP600 hp1 = (HP600)ps[i]; // 원래 타입인 자신의 타입으로 넣은 다운캐스팅을 했다.
////				hp1.selfTest(); // 이건 selfTest가 보인다.
////			} else {
////				LG500 lg1 = (LG500)ps[i]; // 원래 타입인 자신의 타입으로 넣은 다운캐스팅을 했다.
////				lg1.call(); // 이건 selfTest가 보인다.
////			} // 자식만이 가지는 고유 기능을 사용해야 할 떄 DownCasting을 싸용해서 원래 타입의 참조변수로 형변환을 시킨다.   
////			
//			if(ps[i] instanceof HP600 ) {
//				HP600 hp1 = (HP600)ps[i];
//				hp1.selfTest();
//			} else if (ps[i] instanceof LG500 ) {
//				LG500 lg1 = (LG500)ps[i];
//				lg1.call();
//			}
//			
//			// 연사
//			//System.out.println(ps[i] instanceof HP600); // 앞의 객체가 뒤에 클래스 타입의 인스턴스냐?
//		                                      // 형변환을 해서라도 집어넣을 수 있으면 true 그니까 부모 자식간의 관계면 true
//			
//			
//		} //////////////////////////////////////////////////////////////////////////////////
//		
//	}
//
//	private static void m2() {
//		// Case 2. > 배열의 특징 같은 자료형 밖에 저장 못한다.
//		// 재고 확보
//		HP600[] hps = new HP600[5]; // 재고가 바뀌면 이 숫자만 고치면 된다.
//		for(int i=0; i<hps.length; i++)
//			hps[i] = new HP600("black", 250000, "int");
//		LG500[] lgs = new LG500[3]; // 재고가 바뀌면 이 숫자만 고치면 된다.
//		
//		for(int i=0; i<lgs.length; i++)
//			lgs[i] = new LG500("White", 350000, "lazer");
//		// 점검 
//		for(int i=0; i<hps.length; i++) {
//			hps[i].print();    //공통기능
//			hps[i].selfTest(); //자가 기능
//		}
//		
//		for(int i=0; i<lgs.length; i++) {
//			lgs[i].print();    //공통기능
//			lgs[i].call();     //자가기능
//		}
//		// loop를 돌릴 수 있다. 
//	}
//
//	private static void m1() {
//		// Case 1.
//		HP600 hp1 = new HP600("black", 250000, "int");
//		HP600 hp2 = new HP600("black", 250000, "int");
//		HP600 hp3 = new HP600("black", 250000, "int");
//		HP600 hp4 = new HP600("black", 250000, "int");
//		HP600 hp5 = new HP600("black", 250000, "int");
//		
//		LG500 lg1 = new LG500("White", 350000, "lazer");
//		LG500 lg2 = new LG500("White", 350000, "lazer");
//		LG500 lg3 = new LG500("White", 350000, "lazer");
//		
//		// 점검 x 반복 > 이 반복을 어떻게하면 편하게 할 수 있을까? 
//		hp1.print(); 
//		hp2.print();
//		hp3.print();
//		hp4.print();
//		hp5.print();
//		
//		lg1.print(); 
//		lg2.print(); 
//		lg3.print(); 
//		// 너무 반복이 많다. 좋은 코드가 아니다. 
//	
//	}
//
//}// main class
//
//
//// 둘다 Printer라 기능이 비슷하다. 우연의 일치다. 
//
//class Printer{
//
//	private String color; 
//	private int price;
//	private String type;
//	
//	public Printer(String color, int price, String type) {
//		super();
//		this.color = color;
//		this.price = price;
//		this.type = type;
//	} 
//		
//	// 생성자, 근데 기본생성자 없다.
//	public void print() { } // > 바지사장이다. > 인터페이스 역할 > 통로 역할
//}
//
//// HP600, LG500의 공통적인 부모 역할 할 수 있는 클래스
//
//
//class HP600 extends Printer {
//	
////	private String color;
////	private int price;
////	private String type;
//	
//	public HP600(String color, int price, String type) {
//		// super(); // 에러
//		super(color, price, type);
////		this.color = color;
////		this.price = price;
////		this.type = type;
//	}
////	@Override
////	public String toString() {
////		return "HP600 [color=" + color + ", price=" + price + ", type=" + type + "]";
////	}
//	public void print() {
//		System.out.println("HP600으로 출력합니다.");
//	}
//	public void selfTest() {
//		System.out.println("HP600의 자가진단을 시작합니다.");
//	}
//}
//
//class LG500 extends Printer {
//	
////	private String color; // 주석처리, 부모 클래스로 올리자.
////	private int price;
////	private String type;
//	
//	public LG500(String color, int price, String type) {
//		//super();
//		super(color, price, type);
////		this.color = color;
////		this.price = price;
////		this.type = type;
//	}
////	@Override
////	public String toString() {
////		return "LG500 [color=" + color + ", price=" + price + ", type=" + type + "]";
////	}
//	public void print() {
//		System.out.println("LG500으로 출력합니다.");
//	}
//	public void call() { // 
//		System.out.println("인공지능 AI와 연결합니다.");
//	} /////////////////////
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
//
