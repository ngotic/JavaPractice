package com.test.question;

import java.util.Scanner;

public class Q031 {

	public static void main(String[] args) {
		// 요구사항 ] 숫자 5개를 입력받아 짝수와 홀수의 개수를 출력하시오.
		//		입력..
		//		숫자 입력: 3 
		//		숫자 입력: 2 
		//		숫자 입력: 7 
		//		숫자 입력: 1 
		//		숫자 입력: 8

		Scanner scan = new Scanner(System.in);
		int odd=0, totalCnt =0; // 홀수 개수, 전체 숫자 개수 카운트
		
		odd = inputNumber(odd, scan);
		totalCnt++;
		odd = inputNumber(odd, scan);
		totalCnt++;
		odd = inputNumber(odd, scan);
		totalCnt++;
		odd = inputNumber(odd, scan);
		totalCnt++;
		odd = inputNumber(odd, scan);
		totalCnt++;
		
		int even = totalCnt-odd; // 짝수 개수
		
		System.out.printf("짝수는 %d개 홀수는 %d개 입력했습니다.\n", even, odd);
		
		if(odd > even)// 많습니다. or 적습니다.
			System.out.printf("홀수가 짝수보다 %d개 더 많습니다.\n", odd-even);
		else 
			System.out.printf("홀수가 짝수보다 %d개 더 적습니다.\n", even-odd);
		
		scan.close();
	}
	
	public static int inputNumber( int odd, Scanner scan){
		
		System.out.print("숫자 입력: ");
		int num = Integer.parseInt(scan.nextLine());		
		if( num % 2 == 1 ) odd++;
		return odd;
		
	}
	
	

}
