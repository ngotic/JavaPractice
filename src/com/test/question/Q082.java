package com.test.question;

import java.util.Scanner;

public class Q082 {

	public static void main(String[] args) {
		// 요구사항] 숫자를 입력받아 각 자릿수의 수의 합을 구하시오.
		//		입력..
		//		숫자: 314
		//		출력..
		//		결과: 3 + 1 + 4 = 8
		Scanner scan = new Scanner(System.in);
		System.out.printf("숫자: ");
		String number = scan.nextLine();
		int sum = 0;
		System.out.printf("결과: ");
		for(int i=0;i <number.length(); i++) {
			int num = (int) (number.charAt(i)-'0');
			sum += num;
			
			if(i==number.length()-1)
				System.out.printf("%d = ", num );
			else 
				System.out.printf("%d + ", num );
		}
		System.out.println(sum);
		scan.close();
	}

}
