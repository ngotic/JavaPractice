package com.test.question;

import java.util.Scanner;

public class Q081 {

	public static void main(String[] args) {
		// 요구사항] 이메일 주소를 입력받아 아이디와 도메인을 각각 추출하시오.
		//		입력..
		//		이메일: hong@gmail.com 
		//
		//		출력..
		//		아이디: hong
		//		도메인: gmail.com
		Scanner scan = new Scanner(System.in);
		System.out.print("이메일: ");
		String mail = scan.nextLine();

		String[] result = mail.split("@");

		if (result.length == 2) {
			
			if( result[0].equals("") ){
				System.out.println("양식에 맞게 적어주시오.");
			} else {
				System.out.printf("아아디: %s \n", result[0]);
				System.out.printf("도메인: %s ", result[1]);
			}
			
		} else {
			
			System.out.println("양식에 맞게 적어주시오.");
		}

		scan.close();
	}

}
