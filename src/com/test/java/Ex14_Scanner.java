package com.test.java;

import java.util.Scanner;

public class Ex14_Scanner {

	public static void main(String[] args) {
		// Scanner는 상대적으로 편하다.
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.printf("안녕하세요. %s님\n", str);
		
		System.out.println("숫자 : ");
	
		int num = sc.nextInt();
		System.out.println(num + 10);
		
		

	}

}
