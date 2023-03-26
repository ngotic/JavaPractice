package com.test.java;

public class Ex09_Output {

	public static void main(String[] args) {
		
		// 1. %숫자s, %숫자d, %숫자f, %숫자c, %숫자b
		// - 숫자 : 출력할 너비를 지정한다.
		// - 탭문자처럼 출력 내용을 서식 지정하는 역할
		
		int num = 123;
		
		System.out.printf("[%d]\n", num);
		System.out.printf("[%10d]\n", num);
		System.out.printf("[%-10d]\n", num);
		
		double num2 = 3.14;
		
		System.out.println(num2);
		System.out.printf("%f\n",num2);    // %f면 기본 6개
		System.out.printf("%.2f\n",num2);  // 소수점아래 2개
		System.out.printf("%.1f\n",num2);  // 소수점아래 1개
		System.out.printf("%.10f\n",num2); // 소수점아래 10개
		System.out.printf("%.0f\n",num2);  // 소수점아래 0개
		
		System.out.printf("[%10.1f]\n",num2); // 소수점부터 찍고 나머진 10자리 확보 
		
		int price = 1234567;
		System.out.printf("금액: %d\n", price);
		System.out.printf("금액: %,d원\n", price); // 천 단위 끊어진다. %, 쓰면 천단위 끊
		
		// 전체너비 20칸 + 천단위 표기 + 소수이하 2자리
		double num3 = 1234567.89012345;
		System.out.printf("%,20.2f\n", num3);
		
		// 메뉴판 출력
		System.out.println("======================");
		System.out.println("     음료 가격(단위:원)  ");
		System.out.println("======================");
		System.out.printf("콜라 :\t\t%,6d\n", 2500);
		System.out.printf("사이다 :\t\t%,6d\n", 3500);
		System.out.printf("아메리카노 :\t%,6d\n", 5000);
		System.out.printf("케익 : \t\t%,6d\n", 12000);
		
		
	}

}
