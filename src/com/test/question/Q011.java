package com.test.question;

import java.util.Scanner;

public class Q011 {

	public static void main(String[] args) {
		// 요구사항 ] 숫자를 2개 입력받아 연산식을 반환하는 메소드를 선언하시오.
		// 조건..
		// String add(int, int)
		// String subtract(int, int)
		// String multiply(int, int)
		// String divide(int, int)
		// String mod(int, int)
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자: ");
		int n1 = sc.nextInt();
		System.out.print("두번째 숫자: ");
		int n2 = sc.nextInt();
		
		String result = add(n1, n2);
		System.out.println(result);
		result = subtract(n1, n2);
		System.out.println(result);
		result = multiply(n1, n2);
		System.out.println(result);
		result = divide(n1, n2);
		System.out.println(result);
		result = mod(n1, n2);
		System.out.println(result);
		sc.close();

	}
	
	public static String add(int a, int b) {
		return String.format("%d + %d = %d", a, b, a+b);
	}
	public static String subtract(int a, int b) {
		return String.format("%d - %d = %d", a, b, a-b);	
	}
	public static String multiply(int a, int b) {
		return String.format("%d * %d = %d", a, b, a*b);
	}
	public static String divide(int a, int b) {
		return String.format("%d / %d = %.1f", a, b, (double)a / b);
	}
	public static String mod(int a, int b) {
		return String.format("%d %% %d = %d", a, b, a % b);
	}
}