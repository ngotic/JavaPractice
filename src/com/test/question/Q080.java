package com.test.question;

import java.util.Scanner;

public class Q080 {

	public static void main(String[] args) {
		// 요구사항] 문장을 입력받아 역순으로 출력하시오.
		// 입력..
		// 문장 입력 : 가나다
		// 출력..
		// 역순 결과 : "다나가"
		Scanner scan = new Scanner(System.in);
		System.out.printf("문장 입력: ");
		String input = scan.nextLine();
		
		char[] reverse = input.toCharArray();
		
		System.out.printf("역순 결과: \"");
		
		for(int i=reverse.length-1; i>=0 ;i--) {
			System.out.print(reverse[i]);
		}
		System.out.printf("\"\n");
		scan.close();
	}

}
