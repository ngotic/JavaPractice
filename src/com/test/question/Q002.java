package com.test.question;

import java.util.Scanner;

public class Q002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1. 입력 및 화면
		System.out.print("첫번째 숫자: ");
		long num1 = sc.nextLong();
		System.out.print("두번째 숫자: ");
		long num2 = sc.nextLong();
		//2. 출력 - 입력 숫자는 정수라 가정, 출력 숫자에 천단위 표시, 결과값은 소수 이하 1자리까찌 표기
		System.out.printf("%,d + %,d = %d\n",   num1, num2, num1+num2 );
		System.out.printf("%,d - %,d = %d\n",   num1, num2, num1-num2 );
		System.out.printf("%,d * %,d = %d\n",   num1, num2, num1*num2 );
		System.out.printf("%,d / %,d = %.1f\n", num1, num2,(double)num1/num2 );
		System.out.printf("%,d %% %,d = %d\n",   num1, num2, num1%num2 );
		sc.close();
	}

}
