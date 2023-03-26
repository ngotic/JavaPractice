package com.test.question;

import java.util.Scanner;

public class Q040 {

	public static void main(String[] args) {
		// 요구사항] 아래와 같이 출력하시오.
		// 입력..
		// 시작 숫자: 1
		// 종료 숫자: 10

		Scanner scan = new Scanner(System.in);
		System.out.print("시작 숫자: ");
		int start = scan.nextInt();
		System.out.print("종료 숫자: ");
		int end = scan.nextInt();
		int sum = 0;
		for (int i = start; i < end; i++) {
			if (i % 2 == 1) {
				System.out.printf("%d - ", i);
				sum += i;
			} else {
				System.out.printf("%d + ", i);
				sum -= i;
			}
		}

		System.out.printf("%d = %d\n", end, sum - end);
		scan.close();
	}

}
