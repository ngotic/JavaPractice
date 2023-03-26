package com.test.obj;

public class Ex38_Class {

	public static void main(String[] args) {
		/*
		 * 
		클래스, Class
		- 코드의 집합
		- 같은 목적을 가지는 코드의 집합
		메서드 - 행동
		- 데이터 집합... 클래스를 만드는 이유중에 하나 
		 
		*/
		
		// 요구사항 ] 지도 > 우리집 > 좌표 > 저장 + 사용
		
		// Case 1.
		// - 간편, 즉시 생성
		// - 식별자 문제 > 같은 성질의 데이터를 저장하는 식벼자(변수)가 서로 다른 이름을 사용
		//  >>>>>>>>>>>>>.> 사용자 경험 의지 >> 물리적 구조 불안정
		
		
		// 우리집 좌표 
		int x = 100;
		int y = 200;
		
		System.out.printf("우리집은 [%d, %d]에 위치합니다.\n", x, y);
		
		// 마트 좌표 
		int x2 = 300; 
		int y2 = 400;
		// 변수 이름을 다르게 만들어야 한다. 좌표라는 같은 부류지만...
		
		System.out.printf("마트는 [%d, %d]에 위치합니다.\n", x2, y2);
		
		// Case 2.
		// - 배열사용
		// - 간편, 즉시 생성
		// - 데이터 저장 구조 생성 > 관리 용이 + 가독성 향상
		// - 각 방의 데이터가 구분이 힘들다. > 요소를 방번호(첨자)
		
		int [] kors = {100, 90, 80}; // 같은 성질의 데이터(국어점수)> 많이 사용
		int [] score = {100, 95, 89, 77, 45};// 1명의 점수(과목 5개) > 잘 사용안함
		
		int [] a1 = {100 ,200 };
		System.out.printf("우리집은 [%d, %d]에 위치합니다.\n", a1[0], a1[1]);
		
		int [] a2 = {300 ,400 };
		System.out.printf("마트은 [%d, %d]에 위치합니다.\n", a2[0], a2[1]);
		System.out.println();
		
		// Case 3. 
		// - 클래스 사용
		// 데이터 구조 명확
		// 변수 생성
		// -자료형 
//		int a;// 스텍이라는 영역에 만들어짐
//		
//		
//		int[] a3 = new int[2];
//		a3[0] = 100;
//		a3[1] = 200;
		
		// 클래스 객체명 = 객체생성연산자 생성자();
		// 클래스의 객체(인스턴스)를 생성한다.
		// 클래스 == 붕어빵틀 == 설계도 == 사람 == 포메라이언
		// 객체 == 붕어빵 == 제품 == 홍길동 == 똘이
		Point p1 = new Point();
		// 생성자() >> 이게 생성자다.
		
		//Stack에 p1으로 찾아감
		// .을 멤버 접근 연산자라고 불른다.
		p1.x = 100;
		p1.y = 200;
		
		System.out.printf("우리집은 [%d, %d]에 위치합니다.\n", p1.x, p1.y);
		
		
		// 마트
		Point p2 = new Point();
		
		p2.x = 300;
		p2.y = 500;
		
		System.out.printf("마트은 [%d, %d]에 위치합니다.\n", p2.x, p2.y);
		System.out.println();
		
		System.out.println();
		
		Size s1= new Size();
		s1.name="노트북";
		s1.width=60;
		s1.height=50;
		
		System.out.printf("%s[%dcm, %dcm]\n", s1.name, s1.width, s1.height);
		
		
		
		Student hong = new Student();
		hong.name = "홍길동";
		hong.kor = 100;
		hong.eng=90;
		hong.math = 90;
		
		
		// 학생 점수 
		// UML, Unified Modeling Language
		// - 여러가지 다이어그램
		// - 유스케이스 
		// - 시퀀스 다이어그램
	}//main

}//class



//클래스 선언하기
//class 클래스명 {
//	// 클래스 멤버 선언하기
//	int a;
//	int b;
//}
// 좌표값 저장하기 위한 클래스
class Point{ // 사용자 정의 자료형이다. 자료형의 역할이다.
	public int x;
	public int y;
}

// 제품의 크기
class Size {
	// 마음대로 조합해도 된다. 
	public String name; // 제품명
	public int width;   // 너비
	public int height;  // 높이
}

//class Student {
//	public String name;
//	public int kor;
//	public int eng;
//	public int math;
//}