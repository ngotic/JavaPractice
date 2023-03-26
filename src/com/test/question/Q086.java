package com.test.question;

import java.util.Scanner;

public class Q086 {

	public static void main(String[] args) {
//		요구사항
//		숫자를 입력받아 3자리마다 , 를 붙이시오.
//		조건..
//		%,d 사용 금지
//		입력..
//		숫자: 1234 
//		출력..
//		결과: 1,234
//		입력..
//		숫자: 1234567 
//		출력..
//		결과: 1,234,567
		Scanner scan = new Scanner(System.in);
		System.out.printf("숫자: ");
		String numstr = scan.nextLine();
		StringBuilder one = new StringBuilder("");
		
		int first = numstr.length() % 3;
		int index=0; 
		for(int i=first; i <= numstr.length() ; i+=3) {
			one.append(numstr.substring(index, i)).append(",");
			index=i; // 이전 인덱스 저장
		}
		String result = one.substring(0, one.length()-1);
		System.out.printf("결과: %s\n", result);
		scan.close();

	}

}
