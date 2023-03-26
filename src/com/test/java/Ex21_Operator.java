package com.test.java;

import java.util.Scanner;

public class Ex21_Operator {

	public static void main(String[] args) {
		// 요구사항 ] 사용자로부터 문자 1개를 입력 > 영어 소문자인지 검사?
		// 시나리오
		
		Scanner scan = new Scanner(System.in);
		// 화면 설계 
		System.out.println("문자 입력 : ");
		String s = scan.nextLine(); 
		
		int code = (int)s.charAt(0);
		if(s.length()==1 ) {
			String str= ( code >=97 && code <=122)? "소문자 입니다.":"대문자 입니다." ;
			System.out.printf("입력받은 문자는 %c %s입니다.",code, str);
		} else {
			System.out.println("힌글자만");
		}
	}

}
