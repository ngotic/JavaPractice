package com.test.question;

import java.util.Scanner;

public class Q029 {

	public static void main(String[] args) {
		// 요구사항] 숫자 2개와 연산자 1개를 입력받아 연산 과정과 결과를 출력하시오.
		//		조건..
		//		정수만 입력하시오.(유효성 검사 필요없음)
		//		나머지 연산 결과는 소수이하 첫째자리까지 출력 하시오.
		//		연산자는 산술 연산자(+, -, *, /, %)만 입력하시오.
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 숫자: ");
		int num1 = scan.nextInt();               
		System.out.print("두번째 숫자: ");
		int num2 = scan.nextInt();              
		System.out.print("연산자: ");
		scan.nextLine(); // 입력 버퍼 클리어
		String op = scan.nextLine();
		if( op.equals("+") ) {
			System.out.printf("%d %s %d = %d",   num1, op, num2, num1+num2);
		} else if( op.equals("-") ) {
			System.out.printf("%d %s %d = %d",   num1, op, num2, num1-num2);
		} else if( op.equals("*") ) {
			System.out.printf("%d %s %d = %d",   num1, op, num2, num1*num2);
		} else if( op.equals("/")) {
			System.out.printf("%d %s %d = %.1f", num1, op, num2, (double)num1/num2);
		} else if( op.equals("%")) {
			System.out.printf("%d %s %d = %d",   num1, op, num2, num1%num2);
		} else {
			System.out.println("연산이 불가능합니다.");
		}
		System.out.println();
		scan.close();
	}

}
