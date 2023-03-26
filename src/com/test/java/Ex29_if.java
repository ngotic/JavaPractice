package com.test.java;

import java.util.Scanner;

public class Ex29_if {

	public static void main(String[] args) {
		/*
		  * 프로그램
		  - 수많은 문장의 집합
		  - 명령어들의 미리 정해진 제어의 흐름에 따라 실행(위 > 아래)
		  * 제어문
		  - 그 흐름을 통제하는 명령어 > 크게 3가지가 있다. 
		  - 조건 제어, 반복 제어, 분기 제어
		  - 아래 8개의 문장으로 코드의 흐름을 만들면 > 알고리즘
		  
		  1. 조건문
		  	- 개발자가 조건을 제시한 후 프로그램 흐름을 제어함
		  	a. if
		  	b. switch
		  	  
		  2. 반복문
		  	- 특정 코드를 개발자가 원하는 회숫만큼 반복 실행한다.
		  	a. for
		  	b. while
		  	c. do while
		  	d. for 
		  	 
		  3. 분기문
		  	- 개발자가 코드의 흐름을 원하는 곳으로 이동한다.
		  	a. break
		  	b. continue 
		  	c. goto(JDK 1.5 때 폐기, 가독성 구림) 
		*/
		//m1();
		//m2();
		//m3();
		m4();
	}
	private static void m5() {
		/*
		 * [Java]
		   조건식
		   - boolean
		   - 비교식, 논리식
		   
		   [다른 언어의 조건식]
		   - boolean이 아닌 자료형을 사용하기도 한다. 
		   
		   자바는 c계열 언어이다. 
		   - C언어는 boolean형이 없다.> 정수 사용(1, 0)
		   // 값이 없으면 false, 숫자가 존재하면 true
		   - 정수 : 0(false), 1(true), 0이 아닌 모든 숫자(true)
		   - 실수: 0.0(false), 0이 아닌 모든 숫자(true)
		   - 문자: \0(null 문자, 문자코드값(0))(false), 그 이외의 모든 문자(true)
		   - 문자열: ""(빈문자열)(false), "홍길동"(true)
		*/
	}
	
	private static void m4() {
		int sum = 0 ; // 누적 변수 : 값을 차곡 쌓아갈 것이다.
		Scanner scan = new Scanner(System.in);
		// 설문조사 
		System.out.println("A. 무슨색을 좋아합니까?");
		System.out.println("1. 노란색");
		System.out.println("2. 빨간색");
		System.out.println("3. 파란색");
		System.out.print("선택: ");
		int sel = scan.nextInt();
		if (sel== 1) {
			sum += 10;
		} else if(sel==2) {
			sum += 5;
		} else if(sel==3) {
			sum += 3;
		}
		System.out.println("B. 어떤 언어를 선호합니까?");
		System.out.println("1. Java");
		System.out.println("2. C#");
		System.out.println("3. Python");
		System.out.print("선택: ");
		sel = scan.nextInt();
		if (sel== 1) {
			sum += 5;
		} else if(sel==2) {
			sum += 10;
		} else if(sel==3) {
			sum += 3;
		}
		System.out.println("완료되었습니다.");
		System.out.println("[결과]");
		if(sum > 15) {
			System.out.println("당신은 진취적인 개발자입니다.");
		} else if (sum <=15 && sum >= 10) {
			System.out.println("당신은 평범한 개발자입니다.");
		} else {
			System.out.println("다른일을 찾아보세요.");
		}
		
	}
	
	private static void m3() {
		// 요구사항] 직장인. 출근. 기상 시간 입력. 교통 수단 결정
		Scanner scan = new Scanner(System.in);
		System.out.println("몇시에 일어났습니까?(시): ");
		int hour = scan.nextInt();
		// hour = 7
		if(hour <= 6) {
			System.out.println("지하철을 타고 출근합니다.");
		} else if( hour <= 7) { // 6보다 크고 7보다 같거나 작다. 
		// hour > 6 && hour <= 7 // 앞에 부분은 암시적임
			System.out.println("버스를 타고 출근합니다.");
		} else if (hour <= 9) { // 7보다크고 9보다 작거나 같다.
		// hour >7 && hour <=9
			System.out.println("택시를 타고 출근합니다.");
		} else { // 9시 이후 
			System.out.println("휴가를 사용한다.");
		} // 조건화 > 규칙
		scan.close();
	}
	
	private static void m2() {
		// 요구사항] 나이를 입력받아 성인, 미성년자인지 출력하시오.
		Scanner scan = new Scanner(System.in);
		System.out.println("나이: ");
		int age = scan.nextInt();
		System.out.println(age >= 19? "성인" : "미성년자");
		// 삼항 연산자를 쓰나 if문을 쓰나 거기서 거기임
		if (age >= 19 ) { // true절
			System.out.println("성인");
		} else {          // false절
			System.out.println("미성년자");
		}
		scan.close();
	}
	
	private static void m1() {
		/*
		  if문
		  - 조건을 제시 후 프로그램 흐름을 제어한다.
		  - 조건식 > boolean 값을 가진다.
		  
		  if (조건식){
		  	실행문;
		  }  	
		  
		  if (조건식){ // 처음조건
		  	실행문;
		  } else {   // 처음조건 아닐 때
		  	실행믄;
		  }
		  
		  if (조건식){        // 처음조건
		  	실행문;
		  } else if(조건식) { // 또 물어본다.
		  	실행문;
		  } // 다중 조건문
		  
		  if(조건식) {
		  	실행문;
		  }
		  [else if (조건식) {
		  	실행문;
		  }] x N
		  [else {
		  	실행문;
		  }]
		  
		    []: 시용해도 되고, 생략해도 된다.
		  x N : 횟수 마음대로	   
		*/
		if (true) { //조건식을 먼저 검사한다. true->만족>통과, false->만족x, 통과x
		// false라고 하면 dead code라고 한다.
			System.out.println("안녕하세요.");
			
		}// true block
		System.out.println("프로그램 종료");
		
		int n = -10;
		
		if(n > 0) {
			System.out.println("양수입니다.");
		}
		
		if(n > 0) { // true block
			System.out.println("양수입니다.");
		} else {    // false block 
			System.out.println("양수가 아닙니다.");
		}
		
		n = 0;
		
		if (n > 0) {  
			System.out.println("양수입니다.");
		} else if (n < 0) {
			System.out.println("음수입니다.");
		} else {       // 0 일때도 처리하고 싶다. if ( n==0 )
			
		}
		
		System.out.println("프로그램 종료");
	}

}
