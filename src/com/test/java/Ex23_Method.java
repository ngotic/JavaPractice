package com.test.java;

class Car {
	public void water() {
		System.out.println("물");
	}
}
class FireEngine extends Car{
	public void fire() {
		System.out.println("불");
	}
	public void attack() {
		System.out.println("공격");
	}
} 
public class Ex23_Method {
	
	public static void Test(Car c) {
		if(c instanceof FireEngine) {
			FireEngine ex = (FireEngine)c;
			c.water();  // 이러니 메서드 호출에 다양성이 생긴다.
			ex.fire();
			ex.attack();
		}
	}
	
	public static void main(String[] args) {
		
		
//		Car c1 = new FireEngine(); // 자식꺼 못함
//		FireEngine c2 = new FireEngine(); // 자식꺼 호출가능
//		Car c3 = new Car(); // 자식꺼 못함
//		
//		Test(c1);
//		Test(c2);
//		Test(c3);
//		
//	    hello();
//	    hi("홍길동");
//	    hi("아무개");
//	    checkAge(25);
//	    checkAge(30);
	    score("홍길동",100, 95, 80);
	} // main	
	// 요규사항] '홍길동' 에게 인사를 하는 메소드를 선언하시오.
	public static void hello() {
		System.out.println("홍길동님 안녕하세요.");
	} // 이 메서드는 길동이에게만 인사, 아무개한테는 인사x
	public static void hello2() {
		System.out.println("아무개님 안녕하세요.");
	} // 이 메서드는 길동이에게만 인사, 아무개한테는 인사x
	// 추가사항] '아무개' 에게 인사를 하는 메소드를 선언하시오.
	// 추가사항] 우리 강의실에 있는 모든 사람마다 인사를 하는 메소드를 선언하시오.
	public static void hello3() {
		System.out.println("김경민님 안녕하세요.");
	}
	public static void hello4() {
		System.out.println("김대환님 안녕하세요.");
	}
	public static void hi(String name) { // 누구에게 인사하는 메서드인지 정의 x,
		// 그 때 그 때 마다 다름
		System.out.printf("%s님 안녕하세요.\n", name);
	}
	public static void checkAge(int age) {
		String result = age >=19 ? "성인" : "미성년자";
		System.out.printf("입력한 %d세는 %s입니다.\n", age,result);
	}
	
	
	
	// 문서주석, Documment Coment 메서드 위에 /**치고 엔터
	/**
	 * 
	 * @param kor
	 * @param eng
	 * @param math
	 * 여기다가 뭔가씀
	 */
	public static void score( String name, int kor, int eng, int math) {
		
		System.out.println("");
		System.out.println("=================");
		System.out.printf("  %s의 성적표   \n", name);
		System.out.println("=================");
		System.out.printf("국어: %d점\n", kor);
		System.out.printf("영어: %d점\n", eng);
		System.out.printf("수학: %d점\n", math);
		
		System.out.printf("총점: %d점\n", kor+eng+math);
		System.out.printf("평균: %.1f점\n", (double)(kor+eng+math)/3.0);
	}
	
}// class
