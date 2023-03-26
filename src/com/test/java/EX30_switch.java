package com.test.java;

import java.util.Scanner;

public class EX30_switch {

	public static void main(String[] args) {
		/*
		  
		  switch문, switch case문
		  switch( 조건>숫자(boolean(x)) ) {
		  	case 값 :     // 1번 이상
		  		실행문; 
		  		break;
		  	[case 값:
		  		실행문;
		  		break;] x N
		  	[default:
		  		실행문;
		  		break;]
		  }
		 if문의 조건으로 사용 가능한 자료형
		 - boolean
		 switch문의 조건으로 사용 가능한 자료형
		 - 정수
		 - 문자, 문자열
		 - Enum
		 
		*/
//		m1();
//		m2();
//		m3();
		m4();
	}//main

	private static void m4() {
		// 요구사항] 인터넷 쇼핑몰 > 상품 구매 > 옵션(패키지)
		//1. 노트북
		//2. 노트북 + 마우스 패드
		//3. 노트북 + 마우스 패드 + 웹캠
		Scanner scan = new Scanner(System.in);
		System.out.println("선택 : ");
		int input = scan.nextInt();
		// 노트북은 목적과 의미가 동일하다. 
		switch(input) {
			case 3:
				System.out.println("노트북");
			case 2:
				System.out.println("마우스 패드");
			case 1:
				System.out.println("노트북");
				break;
		}
	}

	private static void m3() {
		// 요구사항] 사용자가 월을 입력 > 해당월의 마지막 일?
		int lastDate = 0;
		int month = 5;
		switch(month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				lastDate = 31;
				break;
			case 2:
				lastDate = 28;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				lastDate = 30;
				break;
		}
		
		System.out.printf("입력한 %d월의 마지막 날짜는 %d일입니다.\n", month, lastDate);
		
	}

	private static void m2() {
		// 요구사항] 자판기
		//- 메뉴 출력 > 음료 선택 > 가격 출력
		//- 가격 인상 > 사이다 700원 > 앞으로 계속 콜라와 사이다는
		//  동일한 가격을 유지한다. 
		Scanner scan = new Scanner(System.in);
		System.out.println("==============");
		System.out.println("     자판기");
		System.out.println("==============");
		System.out.println("1. 콜라");
		System.out.println("2. 사이다");
		System.out.println("3. 비타500");
		System.out.println("--------------");
		System.out.print("선택(번호): ");
		String input = scan.nextLine();
		// 선택을 하라놓고 "사이다" 라고 입력하는 사람도 있다. 
		if(input.equals("1") || input.equals("2")) {
			System.out.println("700원 입니다.");       // block을 공유
		} else if(input.equals("3")) {
			System.out.println("500원 입니다.");
		}
		// 문자열 일 땐 
//		switch(input) { //input이 문자열이면 문자열로 " " case 구분
//			case "1":
//				System.out.println("700원입니다.");
//				break;
//			case "2":
//				System.out.println("600원입니다.");
//				break;
//			case "3":
//				System.out.println("500원입니다.");
//				break;
//		}
		switch(input) { //input이 문자열이면 문자열로 " " case 구분
			case "1":
			case "2":
				System.out.println("700원입니다.");
				break;
			case "3":
				System.out.println("500원입니다.");
				break;
		}
		scan.close();
	}

	private static void m1() {
		// 요구사항] 숫자를 1개 입력> 한글 출력
		// 1.> 하나		// 2.> 둘
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자: ");
		int num = scan.nextInt();
		if ( num == 1 ) {
			System.out.println("하나");
		} else if( num==2 ) {
			System.out.println("둘");
		} else if( num==3 ) {
			System.out.println("셋");
		} else {
			System.out.println("나머지 숫자");
		}
		
		switch(num) { // 조건으로 제시된 값 > 3
			case 1: //Label(위치를 표현하는 역할)
				System.out.println("하나");
				break; // "자신이 속한 제어문을 탈출해라"
			case 2:
				System.out.println("둘");
				break;
			case 3:
				System.out.println("셋");
				break;
			default :
				System.out.println("나머지 숫자");
				break;
		}
	}

}
