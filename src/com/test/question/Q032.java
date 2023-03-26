package com.test.question;

import java.util.Scanner;

public class Q032 {

	public static void main(String[] args) {
		//요구사항] 주차 요금을 계산하시오.
		//조건..
		//무료 주차: 30분
		//초과 10분당: 2,000원
		int comeHour, comeMin, outHour, outMin;
		Scanner scan = new Scanner(System.in);
		System.out.print("[들어온 시간]\n");
		System.out.print("시: ");
		comeHour= scan.nextInt();
		System.out.print("분: ");
		comeMin= scan.nextInt();
		System.out.print("\n[나간 시간]\n");
		System.out.print("시: ");
		outHour= scan.nextInt();
		System.out.print("분: ");
		outMin= scan.nextInt();
		System.out.printf("주차요금은 %,d원입니다.\n", calcFee(comeHour, comeMin, outHour, outMin));
		scan.close();
	}
	
	public static int calcFee(int comeH,
							  int comeM,
							  int outH,
							  int outM ) {
		// 1.분단위로 환산 2. 30보다 작으면 0원, 보다 크면 추가요금으로 10나눠서 2천곱
		int result = (outH*60 + outM) - (comeH*60 + comeM);
		return ( result / 30 ) > 0 ? 2000* (result - 30) / 10 : 0;
	}

}
