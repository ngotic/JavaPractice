package com.test.question;

import java.util.Scanner;

public class Q090 {

	public static void main(String[] args) {
//		요구사항
//		입력받은 문장에서 숫자를 찾아 그 합을 구하시오.
//		조건..
//		모든 숫자는 한자리 숫자로 처리한다.
//		입력..
//		입력: 국어 점수는 95점입니다. 
//		출력..
//		문장에 존재하는 모든 숫자의 합은 14입니다.
		Scanner scan = new Scanner(System.in);
		System.out.print("입력: ");
		int sum=0;
		String input = scan.nextLine();
		for(int i=0; i<input.length();i++) {
			char ch =input.charAt(i);
			if ( ch >= '0' && ch <= '9') {
				int num = ch-'0';
				sum += num;
			}
				
		}
		
		System.out.printf("문장에 존재하는 모든 숫자의 합은 %d입니다.\n", sum);
		
		scan.close();
	}

}
