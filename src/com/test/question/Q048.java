package com.test.question;

import java.util.Scanner;

public class Q048 {

	public static void main(String[] args) {
		// 요구사항] 최대 9자리 정수를 입력받아 각자리의 홀수 숫자합과 짝수 숫자합을 구하시오.
		// 조건..
		// int 양수만 입력하시오.
		Scanner scan = new Scanner(System.in);

		System.out.print("숫자 입력: ");
		int num = scan.nextInt();
		int evenSum = 0, oddSum = 0;

		
		
		
		
		while (num > 0) {
			// 1의 자리는 10으로 나눈 나머지
			int remain = num % 10; // 

			if ((remain % 2) == 0) {
				evenSum += remain;
			} else {
				oddSum += remain;
			}
			num /= 10; // 다음수 자리로
		}
		System.out.printf("짝수의 합: %d\n", evenSum);
		System.out.printf("홀수의 합: %d\n", oddSum);

		scan.close();
	}

}
