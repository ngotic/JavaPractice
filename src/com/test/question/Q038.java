package com.test.question;

import java.util.Scanner;

public class Q038 {

	public static void main(String[] args) {
		// 요구사항] 입력 횟수(N)와 숫자 N개를 입력받아 짝수와 합과 홀수의 합을 각각 출력하시오.
		//		입력..
		//		입력 횟수: 10 
		//		숫자: 5 
		//		숫자: 2 
		//		숫자: 12 
		//		숫자: 3 
		//		숫자: 11 
		//		숫자: 8 
		//		숫자: 1 
		//		숫자: 7 
		//		숫자: 23 
		//		숫자: 10
		Scanner scan = new Scanner(System.in);
		System.out.print("입력 횟수: ");
		int cnt = scan.nextInt();
		int odd = 0;
		int evenSum = 0, oddSum = 0;
		for(int i=0; i < cnt ;i++ ) {
			System.out.print("숫자: ");
			int num = scan.nextInt();
			if( num%2==1 ) {
				odd++;
				oddSum+=num;
			} else {
				evenSum+=num;
			}
		}
		System.out.printf("짝수 %d개의 합: %d\n",cnt-odd, evenSum);
		System.out.printf("홀수 %d개의 합: %d\n",odd, oddSum);
		scan.close();
	}

}
