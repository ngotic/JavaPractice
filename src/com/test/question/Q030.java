package com.test.question;

import java.util.Scanner;

public class Q030 {

	public static void main(String[] args) {
		// 요구사항 ] 영문자 1개를 입력받아 대/소문자 변환을 한 뒤 출력하시오.
		// 조건..
		// 유효성 검사를 하시오.(영문자만 입력 가능)
		Scanner scan = new Scanner(System.in);
		System.out.printf("문자: ");
		String character = scan.nextLine();
		int ch   = character.charAt(0);
		int dif  = 'a'-'A';
		if ( ch >= 'A' && ch <= 'Z' ) { // 대문자 
			System.out.printf("'%c'의 소문자는 '%c'입니다.\n",
					ch, ch + dif );
		}
		else if( ch >= 'a' && ch <= 'z') { // 소문자
			System.out.printf("'%c'의 대문자는 '%c'입니다.\n",
					ch, ch - dif);
		}
		else {
			System.out.println("영문자만 입력하시오.");
		}
		scan.close();
	}

}
